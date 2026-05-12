
package g02;


public class ArchivoDeVideo extends ArchivoMultimedia {
    
    //---------------------------------------------
    //atributos
    private double alto;
    private double ancho;

    //--------------------------------------------
    //constructor
    public ArchivoDeVideo(String nombre, double peso, String localizacion, int duracion, String formato, double alto, double ancho) {
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
    
    
    
    
    
}
