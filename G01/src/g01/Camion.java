
package g01;

public class Camion extends VehiculoTerrestre {
    short cantidadDeMarchas;
    int pesoCarga;

    public Camion(short cantidadDeMarchas, int pesoCarga, short cantidadRuedas, short cantidadPuertas, Colores color) {
        super(cantidadRuedas, cantidadPuertas, color);
        this.cantidadDeMarchas = cantidadDeMarchas;
        this.pesoCarga = pesoCarga;
    }
    
    
    
    
    
}
