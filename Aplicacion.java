
/**
 * Write a description of class Aplicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto
{
    
    private double tamano;
    private Categoria categoria;

    /**
     * Constructor for objects of class Aplicacion
     */
    public Aplicacion(String nombre, double tamano, Categoria categoria)
    {
        super(nombre);
        this.tamano = tamano;
        this.categoria = categoria;
    }
    
    public double getTamanoEnMB()
    {
        return tamano;
    }
    
    public String getCategoria()
    {
        String categoria = "";
        String nombreCategoria = this.categoria.name();
        
        switch (nombreCategoria){
            case "JUEGOS":
            categoria = "Juegos";
            break;
            case "COMUNICACIONES":
            categoria = "Comunicaciones";
            break;
            case "PRODUCTIVIDAD":
            categoria = "Productividad";
            break;
            case "MULTIMEDIA":
            categoria = "Multimedia";
            break;
        }
        
        return categoria;
    }
    
    public double getPrecio()
    {
        double precio = 0;
        if(getNumeroVecesVendido() < 2){
            precio = 0.99;
        }
        else{
            if(getCategoria().equals("Juegos")){
                precio = 5;
            }
            else if(getCategoria().equals("Productividad")){
                precio = 10;
            }
            else{
                precio = 2;
            }
        }
        return precio;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
