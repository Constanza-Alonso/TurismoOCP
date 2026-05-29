package turismo.descuentos;

import turismo.modelo.Reserva;

public class DescuentoClienteFrecuente implements PoliticaDescuento {

    @Override
    public double calcularDescuento(Reserva reserva) {
        return reserva.getPrecioBase() * 0.15;
    }

    @Override
    public String getNombre() {
        return "Cliente frecuente - 15%";
    }
}