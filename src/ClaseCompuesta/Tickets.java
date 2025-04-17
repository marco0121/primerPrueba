package ClaseCompuesta;

import java.util.ArrayList;

public class Tickets {

    private String articulo;
    private double precioUnidad;
    private double precioTotalProducto;
    private double TotalVenta;
    private double PagoCliente;
    private double cambio;

    public Tickets (String articulo, double cambio, double pagoCliente, double precioTotalProducto, double precioUnidad, double totalVenta) {
        this.articulo = articulo;
        this.cambio = cambio;
        PagoCliente = pagoCliente;
        this.precioTotalProducto = precioTotalProducto;
        this.precioUnidad = precioUnidad;
        TotalVenta = totalVenta;
    }

    public String getArticulo () {
        return articulo;
    }

    public void setArticulo (String articulo) {
        this.articulo = articulo;
    }

    public double getCambio () {
        return cambio;
    }

    public void setCambio (double cambio) {
        this.cambio = cambio;
    }

    public double getPagoCliente () {
        return PagoCliente;
    }

    public void setPagoCliente (double pagoCliente) {
        PagoCliente = pagoCliente;
    }

    public double getPrecioTotalProducto () {
        return precioTotalProducto;
    }

    public void setPrecioTotalProducto (double precioTotalProducto) {
        this.precioTotalProducto = precioTotalProducto;
    }

    public double getPrecioUnidad () {
        return precioUnidad;
    }

    public void setPrecioUnidad (double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public double getTotalVenta () {
        return TotalVenta;
    }

    public void setTotalVenta (double totalVenta) {
        TotalVenta = totalVenta;

    }
}

