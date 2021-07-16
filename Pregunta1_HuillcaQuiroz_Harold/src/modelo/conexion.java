package modelo;
import java.sql.*;

public class conexion {
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    public static final String USERNAME = "system";
    public static final String PASSWORD = "Dante99753";
    public static Connection getConexion() {
        Connection con = null;
        try {
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //JOptionPane.showMessageDialog(null, "Conexión Exitosa!");
            System.out.println("Conexion Exitosa");
        } catch (SQLException e) {
            System.out.println(e);
        }
        return con;
    }
    
}
