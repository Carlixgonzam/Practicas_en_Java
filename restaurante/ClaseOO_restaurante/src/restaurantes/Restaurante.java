package restaurantes;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * La clase que agrupa la información de los platos y meseros del restaurante
 */
public class Restaurante
{
    /**
     * Un mapa con los platos del restaurante: las llaves son los nombres de los platos y los valores son los platos mismos
     */
    private HashMap<String, Plato> menu;

    /**
     * Una lista con los meseros del restaurante, organizados según el orden en que fueron creados
     */
    private ArrayList<Mesero> equipo;

    /**
     * 
     */
    private boolean estamosEnPromocion;

    /**
     * Construye un nuevo restaurante, inicializando el menú como un mapa vacío y el equipo de meseros como una lista vacía.
     */
    public Restaurante( )
    {
        this.menu = new HashMap<String, Plato>( );
        this.equipo = new ArrayList<>( );
        this.estamosEnPromocion = false;
    }

    /**
     * Retorna un plato del restaurante dado su nombre
     * @param nombrePlato El nombre del plato que se está buscando
     * @return El plato que se encuentra almacenado en el menú. Si no existe un plato con el nombre, retorna null.
     */
    public Plato getPlato( String nombrePlato )
    {
        return menu.get( nombrePlato );
    }

    /**
     * Agrega un nuevo plato al menú del restaurante. Si ya existía un plato con el mismo nombre, se reemplaza por el nuevo.
     * @param nuevoPlato
     */
    public void agregarPlato( Plato nuevoPlato )
    {
        String nombrePlato = nuevoPlato.getNombre( );
        menu.put( nombrePlato, nuevoPlato );
    }

    /**
     * Retorna un mesero del restaurante, dado su nombre.
     * @param nombreMesero El nombre del mesero que se está buscando
     * @return Un mesero con el nombre dado. Si ningún mesero tiene ese nombre, retorna null. Si varios meseros tienen el mismo nombre, retorna el primero que se encuentre.
     */
    public Mesero getMesero( String nombreMesero )
    {
        Mesero elMesero = null;

        int i = 0;
        while( elMesero == null && i < equipo.size( ) )
        {
            Mesero temporal = equipo.get( i );
            if( temporal.getNombre( ).equals( nombreMesero ) )
                elMesero = temporal;
            i++;
        }

        return elMesero;
    }

    /**
     * Agrega un nuevo mesero al equipo del restaurante.
     * @param nuevoMesero
     */
    public void agregarMesero( Mesero nuevoMesero )
    {
        equipo.add( nuevoMesero );
    }

    /**
     * Activa las promociones. Cuando el restaurante está en promoción, todos los platos quedan a mitad de precio.
     */
    public void activarPromocion( )
    {
        if( !estamosEnPromocion )
        {
            for( Plato unPlato : menu.values( ) )
            {
                int precioActual = unPlato.getPrecio( );
                unPlato.cambiarPrecio( precioActual / 2 );
            }
            estamosEnPromocion = true;
        }
    }

    /**
     * Desactiva las promociones y regresa todos los platos a su precio normal.
     */
    public void desactivarPromocion( )
    {
        if( estamosEnPromocion )
        {
            for( Plato unPlato : menu.values( ) )
            {
                int precioActual = unPlato.getPrecio( );
                unPlato.cambiarPrecio( precioActual * 2 );
            }
            estamosEnPromocion = false;
        }
    }
}
