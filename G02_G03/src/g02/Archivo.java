
package g02;


public abstract class Archivo {
    //---------------------------------------
    //definicion de atributos
    private String nombre;
    private double peso;
    private String localizacion;
    private boolean estaAbierto;

    //---------------------------------------
    //Constructor

    public Archivo(String nombre, double peso, String localizacion) {
        this.nombre = nombre;
        this.peso = peso;
        this.localizacion = localizacion;
        this.estaAbierto = false;
    }
    
    
    //---------------------------------------
    //getters
    public String getNombre() {
        return nombre;
    }
    
    public double getPeso() {
        return peso;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public boolean isEstaAbierto() {
        return estaAbierto;
    }
    
    //---------------------------------------
    //metodos
    public void abrir(){
        if(!estaAbierto){
            this.estaAbierto = true;
            System.out.println("\n^^^^^^ El archivo "+ nombre + " acaba de ABRIRSE ^^^^^^\n" );
        }else{
            System.out.println("\n^^^^^^ ADVERTENCIA ^^^^^^: \nEl archivo "+ nombre + " ya se encuentra ABIERTO \n" );
        }
    }
    
    public void cerrar(){
        if(estaAbierto){
            this.estaAbierto = false;
            System.out.println("\n^^^^^^ El archivo "+ nombre + " acaba de CERRARSE ^^^^^^\n" );
        }else{
            System.out.println("\n^^^^^^ ADVERTENCIA ^^^^^^: \nEl archivo "+ nombre + " ya se encuentra CERRADO \n" );
        }
    }
    
    public void mover(String unaLocalizacion){
        System.out.println("\n^^^^^^ Moviendo ubicacion del archivo en: " + this.localizacion + "^^^^^^" );
        System.out.println("^^^^^^ Hacia la nueva ubicacion: " + unaLocalizacion + "^^^^^^\n");
        this.localizacion = unaLocalizacion;
        
                
    }
    
}
