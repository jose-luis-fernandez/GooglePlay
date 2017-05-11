
/**
 * Write a description of class ProductoMultimedia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProductoMultimedia extends Producto
{
    
    private String titulo;
    private int ano;

    /**
     * Constructor for objects of class ProductoMultimedia
     */
    public ProductoMultimedia(String titulo, int ano)
    {
        this.titulo = titulo;
        this.ano = ano;
    }
    
    public String getTitulo()
    {
        return titulo;
    }
    
    public int getAno()
    {
        return ano;
    }
    
}
