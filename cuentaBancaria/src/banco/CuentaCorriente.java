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
public abstract class CuentaCorriente extends CuentaBancaria {

    
    protected Hashtable a;

    public CuentaCorriente( Hashtable a, float saldo, Persona titular) {
       super(saldo, titular);
       
        this.a = new Hashtable(a.getNum(), a.getH());
    }

   

    public Hashtable getA() {
        return new Hashtable(a.getNum(), a.getH());
    }

    public void setA(Hashtable a) {
        this.a = new Hashtable(a.getNum(), a.getH());
    }

 

    
}
