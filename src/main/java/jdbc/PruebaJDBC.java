package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PruebaJDBC {
    public static void main(String[] args) {
        Connection conexion = null;
        Statement sentencia = null;
        // ResultSet result = null;
        String url = "jdbc:mysql://localhost:3306/jee";
        String user = "root";
        String pass = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, pass);
            sentencia = conexion.createStatement();
        } catch (ClassNotFoundException e) {
            System.out.println("Imposible cargar el driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Imposible conectar: " + e.getMessage());
        }

        try {
            sentencia
                    .executeUpdate("CREATE TABLE Log (id INT AUTO_INCREMENT,prioridad VARCHAR(10),fecha VARCHAR(20),"
                            + "clase VARCHAR(20),mensaje VARCHAR(255),PRIMARY KEY (ID))");
        } catch (SQLException e) {
            System.out.println("Creación de tabla fallida: " + e.getMessage());
        }

    }
}
