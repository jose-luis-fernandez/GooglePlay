import java.util.ArrayList;
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    
    private String correo;
    private ArrayList<Producto> productosComprados;
    

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String correo)
    {
        this.correo = correo;
        productosComprados = new ArrayList<Producto>();
    }
    
    public String getNombreCuenta()
    {
        return correo;
    }
    
    public void comprarProducto(Producto producto)
    {
        productosComprados.add(producto);
    }
    
}