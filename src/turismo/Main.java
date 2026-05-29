package turismo;

import turismo.modelo.Reserva;
import turismo.descuentos.PoliticaDescuento;
import turismo.servicio.CalculadoraPrecio;
import turismo.servicio.SelectorDescuento;
import turismo.database.ConexionBD;
import turismo.database.ReservaDAO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ConexionBD.conectar();

        Scanner scanner = new Scanner(System.in);
        SelectorDescuento selectorDescuento = new SelectorDescuento();

        System.out.println("=== PLATAFORMA DE TURISMO Y VIAJES ===");

        System.out.println("Seleccione el destino:");
        System.out.println("1. Bariloche - $200000");
        System.out.println("2. Mendoza - $150000");
        System.out.println("3. Cancún - $500000");

        System.out.print("Opción: ");
        int idDestino = scanner.nextInt();

        String destino;
        double precioBase;

        switch (idDestino) {
            case 1:
                destino = "Bariloche";
                precioBase = 200000;
                break;
            case 2:
                destino = "Mendoza";
                precioBase = 150000;
                break;
            case 3:
                destino = "Cancún";
                precioBase = 500000;
                break;
            default:
                destino = "Mendoza";
                precioBase = 150000;
                idDestino = 2;
                System.out.println("Opción inválida. Se seleccionó Mendoza por defecto.");
        }

        System.out.print("Ingrese la cantidad de personas: ");
        int cantidadPersonas = scanner.nextInt();

        Reserva reserva = new Reserva(destino, precioBase, cantidadPersonas);

        System.out.println("\nSeleccione el tipo de descuento:");
        System.out.println("1. Sin descuento");
        System.out.println("2. Cliente frecuente");
        System.out.println("3. Promoción web");
        System.out.println("4. Paquete familiar");

        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        PoliticaDescuento descuento = selectorDescuento.seleccionar(opcion);

        CalculadoraPrecio calculadora = new CalculadoraPrecio(descuento);

        double montoDescuento = calculadora.obtenerDescuento(reserva);
        double precioFinal = calculadora.calcularPrecioFinal(reserva);

        ReservaDAO reservaDAO = new ReservaDAO();

        reservaDAO.guardarReserva(
                1,
                idDestino,
                opcion,
                cantidadPersonas,
                precioFinal
        );

        System.out.println("\n=== RESUMEN DE LA RESERVA ===");
        System.out.println("Destino: " + reserva.getDestino());
        System.out.println("Cantidad de personas: " + reserva.getCantidadPersonas());
        System.out.println("Precio base: $" + reserva.getPrecioBase());
        System.out.println("Tipo de descuento: " + calculadora.obtenerNombreDescuento());
        System.out.println("Monto descontado: $" + montoDescuento);
        System.out.println("Precio final: $" + precioFinal);

        scanner.close();
    }
}