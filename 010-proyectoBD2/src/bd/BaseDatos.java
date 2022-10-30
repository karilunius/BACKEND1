/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BaseDatos {


    public static void main(String[] args) throws Exception {
        System.out.println("Creando la base de datos ");

        Class.forName("org.h2.Driver").newInstance();
        Connection con = DriverManager.getConnection("jdbc:h2:" +
                "C:\\Users\\Karol\\Desktop\\BACKEND1\\010-proyectoBD2\\database\\baseDatos", "sa", "");
        Statement stmt = con.createStatement();

        //Código para crear una tabla. Elimina la tabla si esta ya existe y la
        //vuelve a crear
        String createSql = "DROP TABLE IF EXISTS BD2;\n" +
                "CREATE TABLE BD2(ID INT PRIMARY KEY, NAME VARCHAR(255));\n" +
                "INSERT INTO BD2 VALUES(1, 'Cliente1');\n" +
                "INSERT INTO BD2 VALUES(2, 'Cliente2');\n";
        stmt.execute(createSql);

        //Codigo para consultar todos los registros de la tabla TEST
        String sql = "select * from BD2";
        ResultSet rd = stmt.executeQuery(sql);

        //Código para recorrer el resultado de la consulta
        while (rd.next()) {
            System.out.println(rd.getInt(1) + rd.getString(2));
        }
    }


}*/
