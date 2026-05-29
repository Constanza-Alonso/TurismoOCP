package turismo.database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ReservaDAO {

    public void guardarReserva(
            int idCliente,
            int idDestino,
            int idDescuento,
            int cantidadPersonas,
            double precioFinal) {

        String sql = "INSERT INTO reservas " +
                "(id_cliente, id_destino, id_descuento, cantidad_personas, fecha_reserva, precio_final) " +
                "VALUES (?, ?, ?, ?, CURDATE(), ?)";

        try {
            Connection conexion = ConexionBD.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, idCliente);
            ps.setInt(2, idDestino);
            ps.setInt(3, idDescuento);
            ps.setInt(4, cantidadPersonas);
            ps.setDouble(5, precioFinal);

            ps.executeUpdate();

            System.out.println("✅ Reserva guardada en la base de datos");

            ps.close();
            conexion.close();

        } catch (Exception e) {
            System.out.println("❌ Error al guardar la reserva");
            e.printStackTrace();
        }
    }
}