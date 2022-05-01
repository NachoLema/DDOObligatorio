/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Date;

/**
 *
 * @author Nacho
 */
class ComisionVentaProducto {
    
    private Factura factura;
    private Date fecha;
    private Producto producto;
    private int cantidad;

    public ComisionVentaProducto(Factura factura, Producto producto, int cantidad) {
        this.factura = factura;
        this.fecha = new Date();
        this.producto = producto;
        this.cantidad = cantidad;
    }

    
    
    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

     
    

    
    


}
