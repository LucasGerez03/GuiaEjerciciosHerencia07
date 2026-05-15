package g02;

public class ArchivoDeAudio extends ArchivoMultimedia {
    //-------------------------------------------
    //atributos
    private String artista;
    private String album;

    //------------------------------------------------
    //constructor
    public ArchivoDeAudio(String nombre, double peso, String localizacion, int duracion, String formato, String artista, String album) {
        super(nombre, peso, localizacion, duracion, formato);
        this.artista = artista;
        this.album = album;
    }
    
    //-------------------------------------------------
    //getters

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }
    
    
    
    
    
    
}
