
/**
 * Write a description of class Aplicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto
{
    
    private String nombre;
    private double tamano;
    private Categoria categoria;

    /**
     * Constructor for objects of class Aplicacion
     */
    public Aplicacion(String nombre, double tamano, Categoria categoria)
    {
        this.nombre = nombre;
        this.tamano = tamano;
        this.categoria = categoria;
    }
    
    public String getNombre()
    {
        return nombre;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
