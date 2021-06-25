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
<<<<<<< HEAD
    protected double valorInicial;
    protected double valorMenu;

    public Menu(String nP, double vI) {
        nombrePlato = nP;
=======
    protected double valorMenu;
    protected double valorInicial ;

    public Menu(String nP, double vI) {
        nombrePlato = nP;

>>>>>>> d4fa515bb961e2c58c80ee99ce4b197bcc15c938
        valorInicial = vI;
    }

    public void establecerNombrePlato(String nP) {
        nombrePlato = nP;
    }

    public abstract void establecerValorMenu();

    public void establecerValorInicial(double vI) {
        valorInicial = vI;
    }

<<<<<<< HEAD
    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double obtenerValorInicial() {
        return valorInicial;
    }

    public double obtenerValorMenu() {
        return valorMenu;
=======
    public abstract void establacerValorMenu();

    public double obtenerValorMenu() {
        return valorMenu;
    }

    @Override
    public String toString() {
        return String.format("Nombre del plato: %s\n"
                + "Valor inicial del menu: %.2f\n", obtenerNombrePlato(),
                obtenerValorInicial());
>>>>>>> d4fa515bb961e2c58c80ee99ce4b197bcc15c938
    }

}
