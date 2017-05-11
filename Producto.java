
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Producto
{
    
    private String nombre;
    private int numeroVecesVendido;

    /**
     * Constructor for objects of class Producto
     */
    public Producto(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public int getNumeroVecesVendido()
    {
        return numeroVecesVendido;
    }
    
    public abstract double getPrecio();
    
    public void aumentarNumeroVecesVendido()
    {
        numeroVecesVendido++;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
