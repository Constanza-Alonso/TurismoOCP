package turismo.descuentos;

import turismo.modelo.Reserva;

public class DescuentoPromoWeb implements PoliticaDescuento {

    @Override
    public double calcularDescuento(Reserva reserva) {
        return reserva.getPrecioBase() * 0.10;
    }

    @Override
    public String getNombre() {
        return "Promoción web - 10%";
    }
}