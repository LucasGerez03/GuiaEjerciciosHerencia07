
package g04;


public class Bicicleta {
    private String marca;
    private String modelo;
    private int cantidadKilometros;

    public Bicicleta(String marca, String modelo, int cantidadKilometros) {
        this.marca = marca;
        this.modelo = modelo;
        this.cantidadKilometros = cantidadKilometros;
    }
    
    public boolean cumpleConServicio() {
        return this.cantidadKilometros < 2000;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "marca=" + marca + ", modelo=" + modelo + ", cantidadKilometros=" + cantidadKilometros ;
    }

    
    
    
    
}


