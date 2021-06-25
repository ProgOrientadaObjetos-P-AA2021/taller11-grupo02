/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author Usuario iTC
 */
public abstract class Menu {

    protected String nombrePlato;
    protected double valorInicial;
    protected double valorMenu;

    public Menu(String nP, double vI) {
        nombrePlato = nP;
        valorInicial = vI;
    }

    public void establecerNombrePlato(String nP) {
        nombrePlato = nP;
    }

    public abstract void establecerValorMenu();

    public void establecerValorInicial(double vI) {
        valorInicial = vI;
    }

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double obtenerValorInicial() {
        return valorInicial;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

}
