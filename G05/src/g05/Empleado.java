
package g05;


public abstract class Empleado {
    //----------------------------------------------------
    //atributos
    private String dni;
    private String nombre;
    private String apellido;
    private int añoDeIngreso;
    private double salario;
    
    
    //----------------------------------------------------
    //Constructor
    public Empleado(String dni, String nombre, String apellido, int añoDeIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.añoDeIngreso = añoDeIngreso;
        this.salario = getSalario(); //como sus hijos comparten el atributo salario, pero cobran de distinta manera
    }                               //en cada clase hija declaro como se cobra el salario (getSalario())
    
    //----------------------------------------------------
    //getters
    
    public int getAñoDeIngreso() {
        return añoDeIngreso;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    //----------------------------------------------------
    //metodos

    public abstract double getSalario();
    
    public void mostrarDatosEmpleado() {
        System.out.println("----------------------------------------------");
        System.out.println("nombre compledo de empleado: " + getNombre() + " " + getApellido() );
        System.out.println("dni: " + getDni());
        System.out.println("anio de ingreso en la empresa: " + getAñoDeIngreso());
        System.out.println("salario: $" + getSalario());
    }
    
}

