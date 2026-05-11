/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g04;

/**
 *
 * @author Usuario
 */
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
