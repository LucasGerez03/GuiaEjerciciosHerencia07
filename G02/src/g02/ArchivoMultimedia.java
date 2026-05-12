package g02;

public abstract class ArchivoMultimedia extends Archivo {
    //----------------------------------------
    //atributos
    private int duracion;
    private String formato;
    private boolean estaEnReproduccion;

    //----------------------------------------
    //constructor
    public ArchivoMultimedia(String nombre, double peso, String localizacion, int duracion, String formato) {
        super(nombre, peso, localizacion);
        this.duracion = duracion;
        this.formato = formato;
        this.estaEnReproduccion= false;
    }
    
    //----------------------------------------
    //getters

    public int getDuracion() {
        return duracion;
    }

    public String getFormato() {
        return formato;
    }

    public boolean isEstaEnReproduccion() {
        return estaEnReproduccion;
    }
    
    //----------------------------------------
    //metodos
    
    public void pararArchivoMultimedia(){
        if(estaEnReproduccion){
            this.estaEnReproduccion = false;
            System.out.println("\n*** Deteniendo reproduccion del archivo: " + getNombre() + "."+ this.formato +" ***\n");
        }else{
            System.out.println("\n^^^^^^ ADVERTENCIA ^^^^^^: \n*** El archivo: " + getNombre() + "."+ this.formato + " ya se encuentra PARADO ***\n");
        }
    }
    
    public void reproducirArchivoMultimedia(){
        if(!estaEnReproduccion){
            this.estaEnReproduccion = true;
            System.out.println("\n+++ Reproduciendo  archivo: " + getNombre() + "." + this.formato + " +++\n");
        }else{
            System.out.println("\n^^^^^^ ADVERTENCIA ^^^^^^: \n+++ El archivo: " + getNombre() + "." + this.formato +" ya se encuentra EN REPRODUCCION +++\n");
        }
    }    


}
