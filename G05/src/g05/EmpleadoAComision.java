
package g05;


public class EmpleadoAComision extends Empleado {
    //--------------------------------------------------
    //atributos
    private int clientesCaptados;
    private double montoPorCliente;
    private double salarioMinimo;    
    
    //--------------------------------------------------
    //Constructor
    public EmpleadoAComision(int clientesCaptados, double montoPorCliente, String dni, String nombre, String apellido, int añoDeIngreso) {
        super(dni, nombre, apellido, añoDeIngreso);
        this.clientesCaptados = clientesCaptados;
        this.montoPorCliente = montoPorCliente;
        this.salarioMinimo = 500000;
    }    
    
    //--------------------------------------------------
    //getters
    @Override
    public double getSalario() {
        double salarioEmpleado = this.montoPorCliente * this.clientesCaptados;
        
        if (salarioEmpleado < salarioMinimo){ //si no pasa del salario minimo
            return salarioMinimo; //se cobra el minimo
        }else{
            return salarioEmpleado; //sino se cobra el salario por comision de clientes
        }
    }

    public int getClientesCaptados() {
        return clientesCaptados;
    }
    
    
    //-----------------------------------------------------
    //metodos

    @Override
    public void mostrarDatosEmpleado() { //sobreescribimos el metodo de la clase padre y ponemos los datos de la clase EmpleadoAComision
        super.mostrarDatosEmpleado();
        System.out.println("Tipo de empleado: a Comision por Cliente");
        System.out.println("monto Cobrado por Cliente: $" + this.montoPorCliente);
        System.out.println("salario minimo: $" + this.salarioMinimo);
        System.out.println("----------------------------------------------\n");
    }
    
    
    
    
    
    

    
    
}
