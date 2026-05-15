
package g02;


public class ArchivoDeVideo extends ArchivoMultimedia {
    
    //---------------------------------------------
    //atributos
    private int alto;
    private int ancho;

    //--------------------------------------------
    //constructor
    public ArchivoDeVideo(String nombre, double peso, String localizacion, int duracion, String formato, int alto, int ancho) {
        super(nombre, peso, localizacion, duracion, formato);
        this.alto = alto;
        this.ancho = ancho;
    }
    
    //--------------------------------------------
    //getters
    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    @Override
    public String toString() {
        return  getNombre() + "{" + "alto=" + alto + ", ancho=" + ancho + '}';
    }
    
    
    
    
    
}
