
package g01;


public class AutoMovil extends VehiculoTerrestre {
    short cantidadDeMarchas;
    int cantidadPasajeros;

    public AutoMovil(short cantidadDeMarchas, int cantidadPasajeros, short cantidadRuedas, short cantidadPuertas, Colores color) {
        super(cantidadRuedas, cantidadPuertas, color);
        this.cantidadDeMarchas = cantidadDeMarchas;
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
    
    
}
