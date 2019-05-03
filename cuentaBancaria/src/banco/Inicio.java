/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import Menu.Menu;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author davidromeroayala
 * @version 1.69
 */
public class Inicio {

    public static void main(String[] args) {
        ArrayList<CuentaBancaria> vCuentas = new ArrayList<CuentaBancaria>();
        ArrayList<String> vEntidades = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        int opc = 0;
        vEntidades.add("Ibercaja");
        vEntidades.add("Rural");
        vEntidades.add("Caixa");
        vEntidades.add("Popular");
        vEntidades.add("Santander");
        Hashtable he = new Hashtable(69, "dra");
        Persona person = new Persona("ejemplo", "1", "55");
        CuentaAhorro ac = new CuentaAhorro(0, vEntidades, 0, person, "000000000000000000");
        CuentaCorrientePersonal pcc = new CuentaCorrientePersonal(0, he, 0, person, "000000000000000000");
        CuentaCorrienteEmpresa ecc = new CuentaCorrienteEmpresa(0, 500, he, 0, person, "000000000000000000");
        vCuentas.add(ac);
        vCuentas.add(ecc);
        vCuentas.add(pcc);

        while (opc != 7) {
            Menu.menu1();
            try {
                opc = leer.nextInt();
            } catch (Exception e) {
                System.out.println("indique que opcion desea seleccionar");
            }
            switch (opc) {
                case 1:
                    leer = new Scanner(System.in);
                    String nombre = "",
                     apellido = "",
                     nacimiento = "",
                     ccc = "";
                    float saldo = 0;
                    Persona per;
                    int opcCuenta;
                    Hashtable ha;
                    try {
                        Menu.añadirPersona();
                        System.out.println("Indique el nombre del titular");
                        nombre = leer.nextLine();
                        leer = new Scanner(System.in);
                        System.out.println("Indique el apellido del titular");
                        apellido = leer.nextLine();
                        leer = new Scanner(System.in);
                        System.out.println("Indique la fecha de nacimiento del titular");
                        nacimiento = leer.nextLine();
                        System.out.println("Indique la cuenta bancaria del titular");
                        ccc = leer.nextLine();
                        leer = new Scanner(System.in);
                        per = new Persona(nombre, apellido, nacimiento);
                        ha = new Hashtable(69, "dra");
                        Menu.cuentaNueva();
                        opcCuenta = leer.nextInt();
                        leer = new Scanner(System.in);

                        switch (opcCuenta) {
                            case 1:
                                System.out.println("Indique el interes de la cuenta ahorro");
                                CuentaAhorro ca = new CuentaAhorro(leer.nextFloat(), vEntidades, saldo, per, ccc);
                                vCuentas.add(ca);
                                break;

                            case 2:
                                System.out.println("Indique la comision de la cuenta corriente personal");
                                CuentaCorrientePersonal ccp = new CuentaCorrientePersonal(leer.nextFloat(), ha, saldo, per, ccc);
                                vCuentas.add(ccp);
                                break;
                            case 3:
                                float descubierto,
                                 maximo;
                                System.out.println("Indique Tipo de interés por descubierto de la cuenta corriente empresa");
                                descubierto = leer.nextFloat();
                                leer = new Scanner(System.in);
                                System.out.println("Indique Máximo descubierto permitido de la cuenta corriente empresa");
                                maximo = leer.nextFloat();
                                leer = new Scanner(System.in);
                                CuentaCorrienteEmpresa cce = new CuentaCorrienteEmpresa(descubierto, maximo, ha, saldo, per, ccc);
                                vCuentas.add(cce);
                                break;

                        }

                    } catch (Exception e) {
                        System.out.println("Fallo. Conteste lo que le indican");
                    }

                    break;
                case 2:

                    for (CuentaBancaria cuenta : vCuentas) {
                        cuenta.imprimir();
                    }
                    break;
                case 3:
                    String nom;
                    System.out.println("Indique el nombre del titular ");
                    nom=leer.nextLine();
                    try {
                        for (CuentaBancaria cuenta : vCuentas) {
                            if (cuenta.titular.getNombre().equalsIgnoreCase(nom)) {
                                System.out.println("***********************");
                                cuenta.imprimir();

                            }
                        }

                    } catch (Exception e) {
                        System.out.println("Algo fallo vuelva a intentarlo");
                    }
                    nom = leer.nextLine();

                    break;
                case 4:
                    for (CuentaBancaria Cuenta : vCuentas) {
                        if () {

                        }
                    }
                    break;
                case 5:
                    for (CuentaBancaria Cuenta : vCuentas) {
                        if () {

                        }
                    }
                    break;
                case 6:
                    for (CuentaBancaria Cuenta : vCuentas) {
                        if () {

                        }
                    }
                    break;
                case 7:
                    System.out.println("Adios");
                    break;

            }

        }

    }

}
