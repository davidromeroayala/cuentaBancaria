/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author davidromeroayala
 * @version 1.69
 */
public final class Persona implements Imprimible {

    private String nombre;
    private String apellidos;
    private String nacimiento;

    public Persona(String nombre, String apellidos, String nacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public void imprimir() {
        System.out.println("**************************************************************************");
        System.out.print(nombre +" "+apellidos +" "+ nacimiento +" ");
    }

}
