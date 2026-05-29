package turismo.servicio;

import turismo.descuentos.PoliticaDescuento;
import turismo.modelo.Reserva;

public class CalculadoraPrecio {

    private PoliticaDescuento politicaDescuento;

    public CalculadoraPrecio(PoliticaDescuento politicaDescuento) {
        this.politicaDescuento = politicaDescuento;
    }

    public double calcularPrecioFinal(Reserva reserva) {
        double descuento = politicaDescuento.calcularDescuento(reserva);
        return reserva.getPrecioBase() - descuento;
    }

    public double obtenerDescuento(Reserva reserva) {
        return politicaDescuento.calcularDescuento(reserva);
    }

    public String obtenerNombreDescuento() {
        return politicaDescuento.getNombre();
    }
}