import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Main {

        public static void main(String[] args) throws Exception {
            System.out.println("Loading MySQL JDBC driver");

            Class.forName("org.h2.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:h2:" +
                    "C:\\Users\\Karol\\Desktop\\BACKEND1\\010-proyectoBD\\b_d_test\\database", "sa", "");
            Statement stmt = con.createStatement();

            //Código para crear una tabla. Elimina la tabla si esta ya existe y la
            //vuelve a crear
            String createSql = "DROP TABLE IF EXISTS TEST1;\n" +
                    "CREATE TABLE TEST1(ID INT PRIMARY KEY, NAME VARCHAR(255));\n" +
                    "INSERT INTO TEST1 VALUES(1, 'Hola');\n" +
                    "INSERT INTO TEST1 VALUES(2, 'Mundo');\n";
            stmt.execute(createSql);

            //Codigo para consultar todos los registros de la tabla TEST
            String sql = "select * from TEST1";
            ResultSet rd = stmt.executeQuery(sql);

            //Código para recorrer el resultado de la consulta
            while (rd.next()) {
                System.out.println(rd.getInt(1) + rd.getString(2));
            }
        }
}