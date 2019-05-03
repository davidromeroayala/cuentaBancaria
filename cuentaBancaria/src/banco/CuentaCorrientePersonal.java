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
public final class CuentaCorrientePersonal extends CuentaCorriente {

    private float comision;

    public CuentaCorrientePersonal(float comision, Hashtable a, float saldo, Persona titular,String ccc) {
        super(a, saldo, titular, ccc);
        this.comision = comision;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    @Override
    public void imprimir() {
        super.imprimir(); 
        System.out.println("Cuenta Corriente Personal" +"comision = "+comision);
    }
    

}
