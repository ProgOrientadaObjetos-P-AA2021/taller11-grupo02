/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajogrupal;

import java.util.ArrayList;
import paquete2.Cuenta;
/**
 *
 * @author Usuario iTC
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<Menu> listadocartas = new ArrayList<>();

        MenuNinos menu1 = new MenuNinos("Pistachos",4.75,1.25,0.75);

        MenuNinos menu2 = new MenuNinos("Yogurt",2.75,1.72,1.20);

        MenuEconomico menu3 = new MenuEconomico("Ensalada Cesar",3.10);

        MenuDia menu4 = new MenuDia("Panqueques",3.75,2.50,1.75);

        listadocartas.add(menu1);
        listadocartas.add(menu2);
        listadocartas.add(menu3);
        listadocartas.add(menu4);

        for (int i = 0; i < listadocartas.size(); i++) {
            listadocartas.get(i).establacerValorMenu();// se llama al 
            // métodos abstracto
            
                 
        }
        Cuenta c = new Cuenta("Rene Elizalde",0.14);

    }
}
