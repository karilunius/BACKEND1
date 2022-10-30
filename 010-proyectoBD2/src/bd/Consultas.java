/*import java.sql.*;

public class Consultas {

    public static void main(String[] args) throws Exception {
        System.out.println("Consultando la base de datos ");

        Class.forName("org.h2.Driver").newInstance();
        Connection con = DriverManager.getConnection("jdbc:h2:" +
                "C:\\Users\\Karol\\Desktop\\BACKEND1\\010-proyectoBD2\\database\\baseDatos", "sa", "");

        *//*Statement sentencia = con.createStatement();
        String nombre="Cliente1";
        String consulta = "select * from BD2 where NAME='"+nombre+"'";
        ResultSet rs = sentencia.executeQuery(consulta);
        System.out.println(rs);*//*

        String consulta = "select * from BD2 where NAME=?";
        PreparedStatement sentencia= con.prepareStatement(consulta);
        sentencia.setString(1,"Cliente1");
        ResultSet rs = sentencia.executeQuery();
        System.out.println(rs);


    }
}*/
