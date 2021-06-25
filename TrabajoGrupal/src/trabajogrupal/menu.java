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
public abstract class Menu {

    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicial ;

    public Menu(String nP, double vI) {
        nombrePlato = nP;

        valorInicial = vI;
    }

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public void establecerNombrePlato(String nP) {
        nombrePlato = nP;
    }

    public double obtenerValorInicial() {
        return valorInicial;
    }

    public void establecerValorInicial(double vI) {
        valorInicial = vI;
    }

    public abstract void establacerValorMenu();

    public double obtenerValorMenu() {
        return valorMenu;
    }

    @Override
    public String toString() {
        return String.format("Nombre del plato: %s\n"
                + "Valor inicial del menu: %.2f\n", obtenerNombrePlato(),
                obtenerValorInicial());
    }
}
