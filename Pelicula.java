
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
    
    public double getPrecio()
    {
        double precio = 0;
        
        if(getCalidad() == "FullHD"){
            precio = 10;
        }
        else{
            precio = 5;
        }
        
        if(getAno() < 2000){
            precio = precio / 2;
        }
        
        return precio;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
