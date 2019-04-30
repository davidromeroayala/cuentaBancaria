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
public final class CuentaCorrienteEmpresa extends CuentaCorriente {

    private float descubierto;
    private float maximo;

    public CuentaCorrienteEmpresa(float descubierto, float maximo, int cuenta, Hashtable a, float saldo, Persona titular) {
        super(cuenta, a, saldo, titular);
        this.descubierto = descubierto;
        this.maximo = maximo;
    }

}
