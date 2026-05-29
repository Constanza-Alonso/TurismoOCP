package turismo.descuentos;

import turismo.modelo.Reserva;

public class DescuentoPaqueteFamiliar implements PoliticaDescuento {

    @Override
    public double calcularDescuento(Reserva reserva) {
        if (reserva.getCantidadPersonas() >= 4) {
            return reserva.getPrecioBase() * 0.20;
        }
        return 0;
    }

    @Override
    public String getNombre() {
        return "Paquete familiar - 20% si viajan 4 o más personas";
    }
}