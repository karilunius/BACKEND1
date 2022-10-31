package company.dao;

import java.util.List;

public interface IDao<T> {

    //atributos


    //constructor




    //getter setters



    //metodos
    public T guardar(T t);
    public void eliminar(Long id);
    public T buscar(Long id);
    public List<T> buscarTodos();
}
