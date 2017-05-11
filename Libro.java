
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro extends ProductoMultimedia
{
    
    private int numeroPaginas;
    private boolean ficcion;

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String titulo, int ano, int numeroPaginas, boolean ficcion)
    {
        super(titulo, ano);
        this.numeroPaginas = numeroPaginas;
        this.ficcion = ficcion;
    }
    
    public int getNumeroPaginas()
    {
        return numeroPaginas;
    }
    
    public boolean getFiccion()
    {
        return ficcion;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
