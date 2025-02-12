package restaurantes;

public class Plato
{
    /**
     * El nombre del plato
     */
    private String nombre;

    /**
     * El precio actual del plato
     */
    private int precio;

    /**
     * Construye un nuevo plato con un nombre y un precio por defecto de 1.
     * @param nombre
     */
    public Plato( String nombre )
    {
        this.nombre = nombre;
        this.precio = 1;
    }

    /**
     * Construye un nuevo plato con un nombre y con el precio indicado en los parámetros
     * @param nombre
     * @param precio
     */
    public Plato( String nombre, int precio )
    {
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getPrecio( )
    {
        return precio;
    }

    public String getNombre( )
    {
        return nombre;
    }

    /**
     * Cambia el precio del plato por el indicado en el parámetro
     * @param nuevoPrecio
     */
    public void cambiarPrecio( int nuevoPrecio )
    {
        this.precio = nuevoPrecio;
    }

    @Override
    public String toString( )
    {
        return "Soy un plato de " + nombre + " y valgo " + precio;
    }

}
