import java.util.ArrayList;
/**
 * Write a description of class GooglePlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GooglePlay
{
    
    private ArrayList<Usuario> usuarios;
    private ArrayList<Producto> productos;

    /**
     * Constructor for objects of class GooglePlay
     */
    public GooglePlay()
    {
        usuarios = new ArrayList<Usuario>();
        productos = new ArrayList<Producto>();
    }
    
    public int getNumeroUsuarios()
    {
        return usuarios.size();
    }
    
    public void addUsuario(Usuario usuario)
    {
        usuarios.add(usuario);
    }
    
    public void addProducto(Producto producto)
    {
        productos.add(producto);
    }
    
    public int getNumeroProductos()
    {
        return productos.size();
    }
    
    public double comprar(String correo, String nombreProducto)
    {
        double precio = -1;
        boolean usuarioCorrecto = false;
        boolean nombreProductoCorrecto = false;
        double precioProducto = 0;
        int posicionAplicacion = -1;
        
        for (int i = 0; i < usuarios.size(); i++){
            if (usuarios.get(i).getNombreCuenta().equals(correo)){
                usuarioCorrecto = true;
            }
        }
        
        for (int i = 0; i < productos.size(); i++){
            if (productos.get(i).getNombre().equals(nombreProducto)){
                nombreProductoCorrecto = true;
                precioProducto = productos.get(i).getPrecio();
                posicionAplicacion = i;
            }
        }
        
        if (usuarioCorrecto && nombreProductoCorrecto){
            precio = precioProducto;
            productos.get(posicionAplicacion).aumentarNumeroVecesVendido();
        }
        
        return precio;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
