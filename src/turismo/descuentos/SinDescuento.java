package turismo.descuentos;

import turismo.modelo.Reserva;

public class SinDescuento implements PoliticaDescuento {

    @Override
    public double calcularDescuento(Reserva reserva) {
        return 0;
    }

    @Override
    public String getNombre() {
        return "Sin descuento";
    }
}