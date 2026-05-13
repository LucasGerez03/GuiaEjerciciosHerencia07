package g05;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //-------------------------------------------------------------------------
        EmpleadoAComision e1 = new EmpleadoAComision(5, 1000, "45.222.222", "lucas", "gerez", 1999);
        EmpleadoFijo e2 = new EmpleadoFijo(250000, "23.124.444", "oscar", "gomez", 2025);
        EmpleadoAComision e3 = new EmpleadoAComision(10, 100000, "33.333.333", "mariana", "gimenez", 1985);
        EmpleadoFijo e4 = new EmpleadoFijo(750000, "44.444.444", "ramon", "avila", 2005);

        //-------------------------------------------------------------------------
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);

        //-------------------------------------------------------------------------
        System.out.println("----------------- INICIANDO PROGRAMA DE EMPLEADOS -----------------\n");

        mostrarDatos(empleados);
        
        System.out.println("----------------- EMPLEADO/A A COMISION CON MAYOR CANTIDAD DE CLIENTES: -----------------\n");
        System.out.println("EL EMPLEADO/A ES: " + empleadoConMasClientes(empleados));
        
        System.out.println("\n----------------- FIN DEL PROGRAMA -----------------\n");
    }
    
    //----------------------------------------------------------------------
    //metodos estaticos

    public static void mostrarDatos(ArrayList<Empleado> empleados) {
        for (Empleado e : empleados) {
            e.mostrarDatosEmpleado();
        }
    }

    public static String empleadoConMasClientes(ArrayList<Empleado> empleados) {
        EmpleadoAComision emp = null;

        for (Empleado e : empleados) {
            if (e instanceof EmpleadoAComision) { // si el empleado es por comision
                EmpleadoAComision ec = (EmpleadoAComision) e; // lo casteamos
                if (emp == null
                        || ec.getClientesCaptados() > emp.getClientesCaptados()) { //si no tiene clientes o si es mayor
                    emp = ec; //se reemplaza
                }
            }
        }
        if (emp != null) {
           return emp.getNombre() + " " + emp.getApellido(); 
        } else {
            return "ADVERTENCIA:\nNo hay empleados a comisión.";
        }
    }
    
    //----------------------------------------------------------------------

}
