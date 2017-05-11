
/**
 * Write a description of class Pelicula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelicula extends ProductoMultimedia
{
    
    private int duracion;
    private int calidad;

    /**
     * Constructor for objects of class Pelicula
     */
    public Pelicula(String titulo, int ano, int duracion, int calidad)
    {
        super(titulo, ano);
        this.duracion = duracion;
        this.calidad = calidad;
    }
    
    public int getDuracion()
    {
        return duracion;
    }
    
    public String getCalidad()
    {
        String calidad = "";
        if (this.calidad == 1080){
            calidad = "FullHD";
        }
        else{
            calidad = "HD";
        }
        return calidad;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
