package turismo.servicio;

import turismo.descuentos.*;

public class SelectorDescuento {

    public PoliticaDescuento seleccionar(int opcion) {
        switch (opcion) {
            case 1:
                return new SinDescuento();
            case 2:
                return new DescuentoClienteFrecuente();
            case 3:
                return new DescuentoPromoWeb();
            case 4:
                return new DescuentoPaqueteFamiliar();
            default:
                return new SinDescuento();
        }
    }
}