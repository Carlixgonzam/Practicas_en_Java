package pruebas;

import restaurantes.Mesero;
import restaurantes.Plato;
import restaurantes.Restaurante;

public class Prueba
{
    public static void main( String[] args )
    {
        Restaurante elRestaurante = new Restaurante( );
        Plato p1 = new Plato( "Ajiaco" );
        Plato p2 = new Plato( "Sancocho", 10000 );
        elRestaurante.agregarPlato( p1 );
        elRestaurante.agregarPlato( p2 );

        elRestaurante.agregarMesero( new Mesero( "Alberto" ) );
        elRestaurante.agregarMesero( new Mesero( "Beatriz" ) );
        elRestaurante.agregarMesero( new Mesero( "Carlos" ) );
        elRestaurante.agregarMesero( new Mesero( "Diana" ) );

        Mesero alberto = elRestaurante.getMesero( "Alberto" );
        alberto.agregarPropina( 15000 );
        alberto.setPlatoFavorito( elRestaurante.getPlato( "Ajiaco" ) );

        System.out.println( "El plato favorito de Alberto es: " + alberto.getPlatoFavorito( ).getNombre( ) );

        p1.cambiarPrecio( 13000 );
        alberto.getPlatoFavorito( ).cambiarPrecio( 30000 );
        System.out.println( p1 );
        elRestaurante.activarPromocion( );
        System.out.println( p1 );
        elRestaurante.desactivarPromocion( );
        System.out.println( p1 );
    }

}
