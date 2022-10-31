package company.servicios;

import company.dao.IDao;
import company.entidades.Estudiante;

import java.util.List;

public class EstudianteService{

    //atributos
     private IDao<Estudiante> estudianteIDao;

    //constructor




    //getter setters

    public IDao<Estudiante> getEstudianteIDao() {
        return estudianteIDao;
    }

    public void setEstudianteIDao(IDao<Estudiante> estudianteIDao) {
        this.estudianteIDao = estudianteIDao;
    }


    //metodos

    public Estudiante guardarEstudiante(Estudiante e){
        //delegarle la responsabilidad de guardar al DAO
        return estudianteIDao.guardar(e);
    }

    public void eliminarEstudiante(Long id){
        estudianteIDao.eliminar(id);
    }

    public Estudiante buscarEstudiante(Long id){
        return estudianteIDao.buscar(id);
    }

    public List<Estudiante> buscarTodos(){
        return estudianteIDao.buscarTodos();
    }



}
