
/**
 * Write a description of class ProductoMultimedia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ProductoMultimedia extends Producto
{
    
    private int ano;

    /**
     * Constructor for objects of class ProductoMultimedia
     */
    public ProductoMultimedia(String titulo, int ano)
    {
        super(titulo);
        this.ano = ano;
    }
    
    public String getTitulo()
    {
        return super.getNombre();
    }
    
    public int getAno()
    {
        return ano;
    }
    
    
    
}
