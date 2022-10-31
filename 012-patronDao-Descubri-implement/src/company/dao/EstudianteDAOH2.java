package company.dao;

import company.entidades.Estudiante;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAOH2 implements IDao<Estudiante> {

    //atributos
    //lo que necesitamos para conectarnos en java
    //driver de conexion
    //la url
    //usuario y password
    //se crean entonces variables estaticas
    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:C:\\Users\\Karol\\Desktop\\BACKEND1\\012-patronDao-Descubri-implement\\db\\estudiantes";
    private final static String DB_USER = "sa";
    private final static String DB_PASSWORD = "";

    //constructor




    //getter setters



    //metodos

    @Override
    public Estudiante guardar(Estudiante estudiante){
        //Usar una conexion
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        //levantar el driver y conectarnos
        //puede arrojar exception por lo que usamos try catch

        try {
            Class.forName("DB_JDBC_DRIVER");
            //debemos conectarnos
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //crear una sentencia -hay 2 maneras -se recomienda prepares porque se pasan las variables dinamicas
            //arriba se crea el prepared statement
            //recibe por parametro un query

            preparedStatement = connection.prepareStatement("INSERT INTO estudiantes VALUES (?,?,?)");
            preparedStatement.setLong(1,estudiante.getId());
            preparedStatement.setString(2,estudiante.getNombre());
            preparedStatement.setString(3, estudiante.getApellido());

            //se ejecutan las sentencias

            preparedStatement.executeUpdate();
            preparedStatement.close();


        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }

        return estudiante;

    }

    @Override
    public void eliminar(Long id) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName("DB_JDBC_DRIVER");
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            preparedStatement = connection.prepareStatement("DELETE FROM estudiantes where id=?");
            preparedStatement.setLong(1,id);
            preparedStatement.executeUpdate();
            preparedStatement.close();

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }

    }


    @Override
    public Estudiante buscar(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Estudiante estudiante = null;

        try {
            Class.forName("DB_JDBC_DRIVER");
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement("SELECT * FROM estudiantes where id=?");
            preparedStatement.setLong(1,id);


            ResultSet result = preparedStatement.executeQuery();

            //ademas se evalua los resultados, se recorren
            while(result.next()){
                Long idEstudiante = result.getLong("id");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                //se debe crear un estudiante nulo
                estudiante = new Estudiante();
                estudiante.setId(idEstudiante);
                estudiante.setNombre(nombre);
                estudiante.setApellido(apellido);

            }

            preparedStatement.close();


        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }

        return estudiante;
    }

    @Override
    public List<Estudiante> buscarTodos() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        //en vez de 1 persona es una lista
        List<Estudiante> estudiantes = new ArrayList();

        try {
            Class.forName("DB_JDBC_DRIVER");
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement("SELECT * FROM estudiantes");


            ResultSet result = preparedStatement.executeQuery();

            //ademas se evalua los resultados, se recorren
            while (result.next()) {
                Long idEstudiante = result.getLong("id");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                //se crea arriba lista de estudiantes nula

                //se crea el individuo
                Estudiante estudiante = new Estudiante();
                estudiante.setId(idEstudiante);
                estudiante.setNombre(nombre);
                estudiante.setApellido(apellido);

            }

            preparedStatement.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return estudiantes;
    }



}
