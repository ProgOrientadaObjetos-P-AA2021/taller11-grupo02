/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;
import java.util.ArrayList;
/**
 *
 * @author Usuario iTC
 */
public class Principal {

    public static void main(String[] args) {
        
        ArrayList<Menu> listaMenus = new ArrayList<>();

        MenuNiño nino1 = new MenuNiño("Plato 1", 6, 5.3, 5.10);

        MenuNiño nino2 = new MenuNiño("Plato 2", 10, 5.9, 5);

        MenuEconomico menuecominico = new MenuEconomico("Plato 3",7.30);
        menuecominico.establecerDescuento();
       
        MenuDia menudia = new MenuDia("Plato 4", 7, 7, 4.5);

        MenuCarta menucarta = new MenuCarta("Plato 5", 9, 5, 3.5);
        menucarta.establecerPorcentajeAdicion();
                
                
                
        listaMenus.add(nino1);
        listaMenus.add(nino2);
        listaMenus.add(menuecominico);
        listaMenus.add(menudia);
        listaMenus.add(menucarta);

        for (int i = 0; i < listaMenus.size(); i++) {
            listaMenus.get(i).establecerValorMenu();
        }

        Cuenta cuenta = new Cuenta("Jose Criollo - Joel Ordoñes "
                + "- Jhordan Bustamante ",
                listaMenus, 0.10);
        cuenta.establecerSubTotal();
        cuenta.establecerValorTotal();
        System.out.println(cuenta);
        
    }
}

