package g01;

public class VehiculoTerrestre {
    private short cantidadRuedas;
    private short cantidadPuertas;
    private Colores color;
            
            
    public enum Colores{
        ROJO, BLANCO, AZUL, GRIS, NEGRO
    };

    public VehiculoTerrestre(short cantidadRuedas, short cantidadPuertas, Colores color) {
        this.cantidadRuedas = cantidadRuedas;
        this.cantidadPuertas = cantidadPuertas;
        this.color = color;
    }

    
    
    
    
    
    
    
}
