
import java.sql.*;


public class Main {
    public static void main(String[] args) throws Exception{
          Class.forName("org.h2.Driver").newInstance();
          //Connection connection = DriverManager.getConnection("jdbc:h2:"+"./Database/my","root","myPassword");
          Connection connection = DriverManager.getConnection("jdbc:h2:"+"tcp://localhost/~/test","sa","");

          //obj statement
          Statement stmt = connection.createStatement();

          //tabla
          String createTable = "DROP TABLE IF EXIST;CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255))";
          stmt.execute(createTable);

          //insertar datos
          String insertarFila = "INSERT INTO TEST VALUES(1,'HOLA')";
          String insertarFila2 = "INSERT INTO TEST VALUES(2,'CHAO')";

          //para ejecutar los 2 statements
          stmt.execute(insertarFila);
          stmt.execute(insertarFila2);

          //sentencia query para obtener datos
          String sql = "SELECT * FROM TEST1";
          //se ejecuta esta query
          ResultSet rd = stmt.executeQuery(sql);
          //devuelve un objeto de tipo respuesta por eso se guarda en variable
        //para ver que funciona imprime por pantalla
          while (rd.next()){
              System.out.println(rd.getInt(1) + rd.getString(2));
          }

    }
}