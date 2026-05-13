
package g05;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class EmpleadoFijo extends Empleado {
    //--------------------------------------------------
    //atributos
    private double salarioFijo;
    private double porcentajeAdicional;
    
    //--------------------------------------------------
    //Constructor
    public EmpleadoFijo(double salarioFijo, String dni, String nombre, String apellido, int añoDeIngreso) {
        super(dni, nombre, apellido, añoDeIngreso);
        this.salarioFijo = salarioFijo;
        this.porcentajeAdicional = obtenerPorcentajeDeEmpleado();
    }
    
    //--------------------------------------------------
    //getters
    @Override
    public double getSalario() {
        return salarioFijo + (this.porcentajeAdicional * salarioFijo); // al salario fijo le sumo su porcentaje adicional
    }
    
    //--------------------------------------------------
    //metodos De Clase
    private double obtenerPorcentajeDeEmpleado(){
        LocalDate fechaActual = LocalDate.now();
        int cantidadDeAños = fechaActual.getYear() - getAñoDeIngreso(); //Saco los años en la empresa del empleado
        
        
        if(cantidadDeAños >= 2 && cantidadDeAños <= 5){ //se ve que porcentaje le corresponde segun sus años
            return 0.05;
        }else if(cantidadDeAños >= 6 && cantidadDeAños <= 10)
            return 0.10;
        else if(cantidadDeAños > 10){
            return 0.15;
        }else{
            return 0; //si no supera los 2 años, no tiene porcentaje adicional
        }
    }
    
    
    @Override
    public void mostrarDatosEmpleado() { //sobreescribimos el metodo y ponemos los datos de la clase EmpleadoFijo
        super.mostrarDatosEmpleado();
        System.out.println("Tipo de empleado: Sueldo fijo");
        System.out.println("Salario fijo: $" + this.salarioFijo);
        System.out.println("Porcentaje Adicional de salario: " + this.porcentajeAdicional + "%");
        System.out.println("----------------------------------------------\n");
    }
    
    
    
    
    
    
    
    
    
}
