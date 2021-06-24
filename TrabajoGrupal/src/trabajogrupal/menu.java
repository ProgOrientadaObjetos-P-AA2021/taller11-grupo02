/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajogrupal;

/**
 *
 * @author Usuario iTC
 */
public class menu {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicial;
    
    public menu(String nP, double vM, double vI){
        nombrePlato = nP;
        valorMenu = vM;
        valorInicial = vI;
    }

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public void establecerNombrePlato(String nP) {
        nombrePlato = nP;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    public void establecerValorMenu(double vM) {
        valorMenu = vM;
    }

    public double obtenerValorInicial() {
        return valorInicial;
    }

    public void establecerValorInicial(double vI) {
        valorInicial = vI;
    }
}
