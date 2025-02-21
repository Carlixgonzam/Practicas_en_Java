package restaurantes;

public class Mesero
{
    /**
     * El nombre del mesero
     */
    private String nombre; //son mis atributos

    /**
     * La cantidad de dinero que ha recibido como propina
     */
    private int propinas;

    /**
     * El plato favorito que recomendaría siempre
     */
    private Plato platoFavorito;

    public Mesero( String nombre )
    {
        this.nombre = nombre;
        this.propinas = 0;
    }

    /**
     * Retorna el nombre del mesero
     * @return
     */
    public String getNombre( )
    {
        return nombre;
    }

    /**
     * Modifica el plato favorito del mesero
     * @param elPlato
     */
    public void setPlatoFavorito( Plato elPlato )
    {
        this.platoFavorito = elPlato;
    }

    /**
     * Retorna el plato favorito del mesero que siempre podría recomendar
     * @return
     */
    public Plato getPlatoFavorito( )
    {
        return this.platoFavorito;
    }

    /**
     * Aumenta las propinas recibidas hasta el momento
     * @param adicional El valor en que debe aumentarse el valor acumulado
     */
    public void agregarPropina( int adicional )
    {
        this.propinas += adicional;
    }

    /**
     * La cantidad de dinero recibida como propina hasta el momento
     * @return
     */
    public int getPropinas( )
    {
        return this.propinas;
    }
}
