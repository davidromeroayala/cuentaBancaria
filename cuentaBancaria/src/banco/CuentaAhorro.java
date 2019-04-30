/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;

/**
 *
 * @author davidromeroayala
 * @version 1.69
 */
public final class CuentaAhorro extends CuentaBancaria {

    private float interes;
    private ArrayList<String> vEntidades;

    public CuentaAhorro(float interes, ArrayList<String> vEntidades, float saldo, Persona titular) {
        super(saldo, titular);
        this.interes = interes;
        this.vEntidades = vEntidades;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public ArrayList<String> getvEntidades() {
        return vEntidades;
    }

    public void setvEntidades(ArrayList<String> vEntidades) {
        this.vEntidades = vEntidades;
    }

}
