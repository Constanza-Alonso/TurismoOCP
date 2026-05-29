package turismo.descuentos;

import turismo.modelo.Reserva;

public interface PoliticaDescuento {
    double calcularDescuento(Reserva reserva);
    String getNombre();
}