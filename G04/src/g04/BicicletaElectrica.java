
package g04;


public class BicicletaElectrica extends Bicicleta {
    int potencia;

    public BicicletaElectrica(int potencia, String marca, String modelo, int cantidadKilometros) {
        super(marca, modelo, cantidadKilometros);
        this.potencia = potencia;
    }

    @Override
    public boolean cumpleConServicio() {
        return super.cumpleConServicio() && potencia < 250; 
    }

    @Override
    public String toString() {
        return super.toString() + ", potencia: " + potencia + '}';
    }
    
    
    
    
}
