package turismo.modelo;

public class Reserva {
    private String destino;
    private double precioBase;
    private int cantidadPersonas;

    public Reserva(String destino, double precioBase, int cantidadPersonas) {
        this.destino = destino;
        this.precioBase = precioBase;
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getDestino() {
        return destino;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }
}