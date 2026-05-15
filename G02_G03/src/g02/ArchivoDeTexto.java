package g02;


public class ArchivoDeTexto extends Archivo {
    //-------------------------------------------------------------
    //atributos
    private String codificacion;

    
    //-------------------------------------------------------------
    //contructor
    public ArchivoDeTexto(String nombre, double peso, String localizacion, String codificacion) {
        super(nombre, peso, localizacion);
        this.codificacion = codificacion;
    }

    
    //-------------------------------------------------------------
    //getters
    public String getCodificacion() {
        return codificacion;
    }
    
    //-------------------------------------------
    //metodos
    public void cifrarContenido(){
        System.out.println("Cifrando el contenido del archivo de texto " + getNombre() + " con codificacion " + codificacion);
    }
    
}
