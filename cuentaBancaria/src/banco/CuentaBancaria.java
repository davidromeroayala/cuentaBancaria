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
public abstract class CuentaBancaria implements Imprimible {

    protected float saldo;
    protected Persona titular;
    protected String ccc;

    public CuentaBancaria(float saldo, Persona titular,String ccc) {
        this.saldo = saldo;
        this.ccc=ccc;
        this.titular = new Persona(titular.getNombre(), titular.getApellidos(), titular.getNacimiento());
    }

    @Override
    public void imprimir() {
        titular.imprimir();
        System.out.print(saldo  +" "+ ccc +" " );
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return new Persona(titular.getNombre(), titular.getApellidos(), titular.getNacimiento());
    }

    public void setTitular(Persona titular) {
        this.titular = new Persona(titular.getNombre(), titular.getApellidos(), titular.getNacimiento());
    }

}
