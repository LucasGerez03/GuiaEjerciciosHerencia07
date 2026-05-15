
package g02;

import java.util.ArrayList;


public class Main {

    
    public static void main(String[] args) {
        //INSTANCIANDO ARCHIVOS
        ArchivoDeAudio cancion = new ArchivoDeAudio("pista01", 5.2, "D:/Musica", 210, "mp3", "Banda X", "Álbum Y");
        ArchivoDeTexto apunte = new ArchivoDeTexto("resumen_parcial", 1.5, "C:/Documentos", "UTF-8");
        ArchivoDeVideo pelicula = new ArchivoDeVideo("video_vacaciones", 1500.0, "/home", 7200, "mkv", 1080, 1920);
        
        
        //INSTANCIANDO COMPU, PUNTO G03
        ArrayList<Archivo> listaArchivos = new ArrayList<>();
        listaArchivos.add(cancion);
        listaArchivos.add(apunte);
        listaArchivos.add(pelicula);
        
        Computadora compu = new Computadora(listaArchivos);
        
        
        System.out.println("--- INICIANDO PROGRAMA DEL SISTEMA DE ARCHIVOS ---");

        //Probando archivo de texto
        
        System.out.println("///////////////////////////////////////////////////////");
        
        apunte.abrir();
        apunte.cifrarContenido();
        apunte.mover("C:/Documentos/UTN_LucasGerez");
        apunte.cerrar();

        System.out.println("///////////////////////////////////////////////////////");

        //Probando archivo de Audio
        
        cancion.abrir();
        cancion.pararArchivoMultimedia();
        cancion.reproducirArchivoMultimedia();
        cancion.mover("C:/Desktop/Carpeta_Para_Musica");
        cancion.pararArchivoMultimedia();
        cancion.cerrar();

        System.out.println("///////////////////////////////////////////////////////");

        //Probando archivo de video
        
        pelicula.cerrar();
        pelicula.abrir();
        pelicula.reproducirArchivoMultimedia();
        pelicula.reproducirArchivoMultimedia();
        pelicula.mover("/home/$USER_LucasGerez/Desktop/Videos");
        pelicula.pararArchivoMultimedia();
        pelicula.cerrar();
    
        System.out.println("///////////////////////////////////////////////////////");
        System.out.println("----------------Fin del Programa----------------\n\n\n\n");
        
        
        
        System.out.println("----------------PROGRAMA DE COMPUTADORA----------------");
        System.out.println("cantidad de Archivos de texto: \n" + compu.cantArchivosDeTexto());
        
        System.out.println("\nArchivos para cifrar: " );
        compu.cifrarArchivos();
        
        System.out.println("\nDuracion promedio de audio y video :");
        System.out.println(compu.duracionPromedio());
        
        System.out.println("\nCantidad de videos Full HD :");
        System.out.println(compu.videosFullHD().toString());
        
        
        
    }
    
}
