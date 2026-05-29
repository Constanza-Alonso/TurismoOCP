package turismo.descuentos;

import turismo.modelo.Reserva;

public class DescuentoTemporadaAlta implements PoliticaDescuento {

    @Override
    public double calcularDescuento(Reserva reserva) {
        return reserva.getPrecioBase() * 0.05;
    }

    @Override
    public String getNombre() {
        return "Temporada alta - 5%";
    }
}