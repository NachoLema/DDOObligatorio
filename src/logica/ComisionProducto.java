/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nacho
 */
public class ComisionProducto {
    
    private String Nombre;
    private Date fecha;
    private double porcentaje;
    private Producto producto;
    private ArrayList<ComisionVentaProducto> comisionesVenta = new ArrayList<ComisionVentaProducto>();

    

    public ComisionProducto(String Nombre,  double porcentaje, Producto producto) {
        this.Nombre = Nombre;
        this.fecha = new Date();
        this.porcentaje = porcentaje/100;
        this.producto = producto;
    }

    public String getNombre() {
        return Nombre;
    }
  
    
    public int cantComisiones (){
      int cant = 0;
      
      for(ComisionVentaProducto c : comisionesVenta)  {
      cant += c.getCantidad();
      
      }
    
      return cant;
    }
    
    public double cantPagarComisiones(){
    
        double total = 0;
        
        for(ComisionVentaProducto c : comisionesVenta)  {
            
            total += producto.getPrecio()*c.getCantidad()*porcentaje;
        }
    
        return total;
    
    }
    
    
    public boolean crearComisionVentaProducto(Producto p , Factura f, int cantidad){
    
        
       
        if(p != null && cantidad >0 && f!=null){
        
            ComisionVentaProducto cv = new ComisionVentaProducto(f,p,cantidad);
            comisionesVenta.add(cv);
            System.out.println(comisionesVenta);
            
            return true;
        
        }
        
        return false;
    
    }
    
    public boolean perteneceProducto(Producto p){
    
        if(producto.getNombre().equals(p.getNombre())){
        
        return true;
        }
        return false;
    
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }


    @Override
    public String toString() {
        return "Nombre : "+ Nombre +" , Porcentaje : " + porcentaje + " , Producto : " + producto.getNombre() ;
    }
    
    
      public String toString2() {
        return "Nombre : "+ Nombre +  " , Fecha : "+ fecha + " , Porcentaje : " + porcentaje + " , Producto : " + producto.getNombre() + " , Unidades vendidas : "+cantComisiones() + " , Total A pagar : "+cantPagarComisiones();
    }


}
