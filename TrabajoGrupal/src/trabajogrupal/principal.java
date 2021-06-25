/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajogrupal;

import java.util.ArrayList;

/**
 *
 * @author Usuario iTC
 */
public class Principal {
     public static void main(String[] args) {
        
        ArrayList<Menu> listaMenus = new ArrayList<>();

        menuNiños nino1 = new menuNiños("Plato 1", 6, 5.3, 5.10);

        menuNiños nino2 = new menuNiños("Plato 2", 10, 5.9, 5);

        menuEconomico menuecominico = new menuEconomico("Plato 3", 7,30);

        menuDia menudia = new menuDia("Plato 4", 7, 7, 4.5);

        menuCarta menucarta = new menuCarta("Plato 5", 9, 5, 3.5, 8);

        listaMenus.add(nino1);
        listaMenus.add(nino2);
        listaMenus.add(menuecominico);
        listaMenus.add(menudia);
        listaMenus.add(menucarta);

        for (int i = 0; i < listaMenus.size(); i++) {
            listaMenus.get(i).establecerValorMenu();
        }

        Cuenta cuenta = new Cuenta("Jose Criollo - Joel Ordoñes - Jhordan Bustamante ",
                listaMenus, 0.10);
        cuenta.establecerSubTotal();
        cuenta.establecerValorTotal();
        System.out.println(cuenta);
        
    }
}
