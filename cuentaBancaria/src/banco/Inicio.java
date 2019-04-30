/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import Menu.Menu;
import java.util.ArrayList;


/**
 *
 * @author davidromeroayala
 * @version 1.69
 */
public class Inicio {

    public static void main(String[] args) {
        ArrayList<CuentaBancaria> vCuentas = new ArrayList<CuentaBancaria>();
        ArrayList<String> vEntidades=new ArrayList<>();
        vEntidades.add("Ibercaja");
        vEntidades.add("Rural");
        vEntidades.add("Caixa");
        vEntidades.add("Popular");
        vEntidades.add("Santander");
        Menu.menu1();
        
        
    }

}
