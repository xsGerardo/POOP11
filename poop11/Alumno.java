/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop11;

/**
 *
 * @author gerar
 */
public class Alumno {
    //Se generan los atributos del alumno.
    String nombre, apellidoP, apellidoM, carrera;
    int numCuenta,edad;

    //Se genera el constructor vacio.
    public Alumno() {
    }

    /**
     * Se genera el constructor lleno
     * @param nombre Se inicializa el atributo nombre del alumno
     * @param apellidoP Se inicializa el atributo del apellido paterno del alumno
     * @param apellidoM Se inicializa el atributo del apellido materno del alumno
     * @param carrera Se inicializa el atributo carrera del alumno
     * @param numCuenta Se inicializa el atributo del numero de cuenta del alumno
     * @param edad Se inicializa el atributo edad del alumno
     */
    public Alumno(String nombre, String apellidoP, String apellidoM, String carrera, int numCuenta, int edad) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.carrera = carrera;
        this.numCuenta = numCuenta;
        this.edad = edad;
    }

    /**
     * 
     * @return Método que regresa el nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre Método para asignar el nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return Método que regresa el apellido paterno del alumno
     */
    public String getApellidoP() {
        return apellidoP;
    }

    /**
     * 
     * @param apellidoP Método para asignar el apellido paterno del alumno
     */
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    /**
     * 
     * @return Método que regresa el apellido materno del alumno
     */
    public String getApellidoM() {
        return apellidoM;
    }

    /**
     * 
     * @param apellidoM Método para asignar el apellido materno del alumno
     */
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    /**
     * 
     * @return Método que regresa la carrera del alumno
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * 
     * @param carrera Método para asignar la carrera del alumno
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * 
     * @return Método que regresa el numero de cuenta del alumno
     */
    public int getNumCuenta() {
        return numCuenta;
    }

    /**
     * 
     * @param numCuenta Método para asignar el numero de cuenta del alumno
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * 
     * @return Método que regresa la edad del alumno
     */
    public int getEdad() {
        return edad;
    }

    /**
     * 
     * @param edad Método para asignar la edad del alumno
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * 
     * @return Método toString que castea todos los atributos para hacerlos cadenas de caracteres 
     * o Strings, y posteriormente devolverlos concatenados.
     */
    @Override
    public String toString() {
        return nombre +  "," + apellidoP + "," + apellidoM + "," + carrera + "," + numCuenta + "," + edad;
    }
}
