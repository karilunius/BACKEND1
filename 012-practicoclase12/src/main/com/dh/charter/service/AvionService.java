package main.com.dh.charter.service;

import main.com.dh.charter.dao.IDao;
import main.com.dh.charter.model.Avion;

import java.util.List;
import java.util.Objects;

public class AvionService {


    private IDao<Avion> avionIDao;

    public AvionService() {
    }


    public IDao<Avion> getAvionIDao() {
        return avionIDao;
    }

    public void setAvionIDao(IDao<Avion> avionIDao) {
        this.avionIDao = avionIDao;
    }

    public AvionService(IDao<Avion> avionIDao) {this.avionIDao = avionIDao;}

    public Avion buscarAvion (int id){return avionIDao.buscar(id);}

    public Avion guardarAvion (Avion avion){return avionIDao.guardar(avion);}

    public List<Avion> buscarTodos (){return avionIDao.buscarTodos();}

    public void eliminar(int id){ avionIDao.eliminar(id);}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AvionService that = (AvionService) o;
        return Objects.equals(avionIDao, that.avionIDao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(avionIDao);
    }

    public Avion registrarAvion(Avion avion) {
        return avionIDao.guardar(avion);
    }
}
