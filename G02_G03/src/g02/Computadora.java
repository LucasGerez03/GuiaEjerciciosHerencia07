
package g02;

import java.util.ArrayList;


public class Computadora {
    //--------------------------------------------------
    //atributos
    private ArrayList<Archivo> archivos;
    
    //--------------------------------------------------
    //constructor
    public Computadora(ArrayList<Archivo> archivos) {
        this.archivos = archivos;
    }
    
    //--------------------------------------------------
    //getters
    public ArrayList<Archivo> getArchivos() {
        return archivos;
    }

    
    //--------------------------------------------------
    //metodos
    
    public void cerrarTodos(){
        for (Archivo a : getArchivos()){
            if(a.isEstaAbierto()){
                a.cerrar();
            }
        }
    }
    
    public int cantArchivosDeTexto(){
        int cant = 0;
        for (Archivo a : getArchivos()){
            if(a instanceof ArchivoDeTexto){
                cant++;          
            }
        }
        return cant;
    }
    
    
    public void cifrarArchivos(){
        ArchivoDeTexto arch;
        for(Archivo a : getArchivos()){ //por cada archivo
            if(a instanceof ArchivoDeTexto){ //si el archivo es de texto
                arch = (ArchivoDeTexto) a;  //lo casteo a un archivo de texto
                if (arch.getCodificacion().equalsIgnoreCase("utf-8")) { //si tiene codifiacion utf-8
                    arch.cifrarContenido(); //lo ciframos
                }
            }
        }
    }
    
    public int duracionPromedio(){
        int duracion = 0;
        ArchivoMultimedia archivo;
        int cont = 0;
        
        for(Archivo am : this.archivos){
            if (am instanceof ArchivoMultimedia) {
                archivo = (ArchivoMultimedia) am;
                duracion+= archivo.getDuracion();
                cont++;
            }
        }
        
        return duracion / cont;
        
    }
    
    public ArrayList<String> videosFullHD(){
        ArrayList<String> hd = new ArrayList<>();
        ArchivoDeVideo video;
        
        for(Archivo v : this.archivos){
            if(v instanceof ArchivoDeVideo){
                video = (ArchivoDeVideo) v;
                if(esVideoFullHD(video)){
                    hd.add(video.toString());
                }
            }
        }
        
        if (hd.isEmpty()){
            System.out.println("NO HAY VIDEOS FULL HD (1920 X 1080)");
        }
        return hd;
        
    }
    
    private boolean esVideoFullHD(ArchivoDeVideo video){
        return (video.getAncho() == 1920) && (video.getAlto() == 1080);
    }
    
    //------------------------------------------------------
   
    
    
    
    
}
