package turismo.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3306/turismo_ocp";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection conectar() {
        try {
            Connection conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Conectado a MySQL");
            return conexion;
        } catch (Exception e) {
            System.out.println("❌ Error al conectar con MySQL");
            e.printStackTrace();
            return null;
        }
    }
}