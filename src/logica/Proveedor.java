package logica;

import java.util.ArrayList;

public class Proveedor {
    
    private String nombre;
    private ArrayList<Producto> productos = new ArrayList();
    private ArrayList<ComisionProducto> comisiones = new ArrayList<ComisionProducto>();

    public Proveedor(String nombre) {
        this.nombre = nombre;
    }
    
    
   
    
    public Boolean altaComision(String nombre, double porcentaje,Producto p){
    
       Boolean esValidoPorcentaje = validarPorcentaje(porcentaje);
       Boolean esValidoNombre = validarNombreComision(nombre);
       
       
       if(esValidoNombre && esValidoPorcentaje && p != null){
       
            ComisionProducto cp = new ComisionProducto (nombre,porcentaje,p);
            comisiones.add(cp);
            p.agregarComision(cp);
            return true;
            
     
       }
        
    
       return false;
    }
    
    
    public Boolean validarPorcentaje(double porcentaje){
    
            if( porcentaje >0 && porcentaje < 100){
                return true;
            }
            
            return false;
        
    }
    
    
    
    

    public Proveedor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    public ArrayList<ComisionProducto> getComisionProducto() {
        return comisiones;
    }
    
    public void agregar(Producto p){
        productos.add(p);
    }
    
    

    @Override
    public String toString() {
        return "Proveedor{" + "nombre=" + nombre + '}';
    }

    private Boolean validarNombreComision(String nombre) {
       
        
        if(nombre.equals("")){
            return false;
        }
        
        for(ComisionProducto cp : comisiones){
           if(cp.getNombre().equals(nombre))
               return false;
       
       } 
       
       
        
       return true;
    }
}
