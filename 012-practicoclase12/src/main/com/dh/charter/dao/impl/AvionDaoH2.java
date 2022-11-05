package main.com.dh.charter.dao.impl;

import main.com.dh.charter.dao.IDao;
import main.com.dh.charter.model.Avion;
import org.h2.expression.aggregate.ListaggArguments;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AvionDaoH2 implements IDao <Avion> {

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    //con la instruccion INIT=RUNSCRIPT cuando se conecta a la base ejecuta el script de sql que esta en dicho archivo
    private final static String DB_URL = "jdbc:h2:~/test;INIT=RUNSCRIPT FROM 'C:\\Users\\Karol\\Desktop\\BACKEND1\\012-practicoclase12\\create.sql'";
    private final static String DB_USER = "sa";
    private final static String DB_PASSWORD = "";


    @Override
    public Avion guardar(Avion avion) {
        //Usar una conexion
        Connection connection;
        connection = null;
        PreparedStatement preparedStatement;
        preparedStatement = null;

        try {
            Class.forName("DB_JDBC_DRIVER");

            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);


            preparedStatement = connection.prepareStatement("INSERT INTO aviones VALUES (?,?,?,?,?)");
            preparedStatement.setInt(1, avion.getId());
            preparedStatement.setString(2, avion.getMarca());
            preparedStatement.setString(3, avion.getModelo());
            preparedStatement.setString(4,avion.getMatricula());
            preparedStatement.setDate(5, (Date) avion.getFechaEntradaServicio());

            //se ejecutan las sentencias

            preparedStatement.executeUpdate();
            preparedStatement.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return avion;


    }


    @Override
    public Avion buscar(int id) {
        Connection connection;
        connection = null;
        PreparedStatement preparedStatement;
        preparedStatement = null;
        Avion avion = null;

        try {
            Class.forName("DB_JDBC_DRIVER");
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement("SELECT * FROM aviones where id=?");
            preparedStatement.setInt(1,id);


            ResultSet result = preparedStatement.executeQuery();

            //ademas se evalua los resultados, se recorren
            while(result.next()){
                int idAvion = result.getInt("id");
                String marca = result.getString("marca");
                String modelo = result.getString("modelo");
                String matricula = result.getString("matricula");
                Date fechaEntradaServicio = result.getDate("fechaEntradaServicio");
                //se debe crear un estudiante nulo
                avion = new Avion (idAvion,marca,modelo,matricula,fechaEntradaServicio);
                avion.setId(idAvion);
                avion.setMarca(marca);
                avion.setModelo(modelo);
                avion.setMatricula(matricula);
                avion.setFechaEntradaServicio(fechaEntradaServicio);

            }

            preparedStatement.close();


        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }

        return avion;
    }

    @Override
    public void eliminar(int id) {
    Connection connection;
        connection = null;
        PreparedStatement preparedStatement;
        preparedStatement = null;

        try {
            Class.forName("DB_JDBC_DRIVER");
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            preparedStatement = connection.prepareStatement("DELETE FROM aviones where id=?");
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
            preparedStatement.close();

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Avion> buscarTodos() {
        Connection connection;
        connection = null;
        PreparedStatement preparedStatement;
        preparedStatement = null;
        List<Avion> avionLista = new ArrayList<>();
        Avion avion = null;

        try {
            Class.forName("DB_JDBC_DRIVER");
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement("SELECT * FROM aviones");

            ResultSet result = preparedStatement.executeQuery();

            //ademas se evalua los resultados, se recorren
            while (result.next()) {
                int idAvion = result.getInt("id");
                String marca = result.getString("marca");
                String modelo = result.getString("modelo");
                String matricula = result.getString("matricula");
                Date fechaEntradaServicio = result.getDate("fechaEntradaServicio");
                //se debe crear un estudiante nulo
                //Avion avionL = new Avion(idAvion, marca, modelo, matricula, fechaEntradaServicio);
                avion.setId(idAvion);
                avion.setMarca(marca);
                avion.setModelo(modelo);
                avion.setMatricula(matricula);
                avion.setFechaEntradaServicio(fechaEntradaServicio);

            }

            preparedStatement.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return avionLista;
    }
}