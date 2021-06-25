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
<<<<<<< HEAD
public class menuDia extends Menu {
=======
public class MenuDia extends Menu {
>>>>>>> d4fa515bb961e2c58c80ee99ce4b197bcc15c938

    protected double valorPostre;
    protected double valorBebida;

<<<<<<< HEAD
    public menuDia(String nom, double vI, double vP, double vB) {
        super(nom, vI);
        establecerValorPostre(vP);
        establecerValorBebidas(vB);
=======
    public MenuDia(String nP, double vI, double vP, double vB) {
        super(nP, vI);
        valorPostre = vP;
        valorBebida = vB;
>>>>>>> d4fa515bb961e2c58c80ee99ce4b197bcc15c938
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial + valorPostre + valorBebida;
    }

    public void establecerValorPostre(double n) {
        valorPostre = n;
    }

    public void establecerValorBebidas(double n) {
        valorBebida = n;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebidas() {
        return valorBebida;
    }

<<<<<<< HEAD
=======
       @Override
    public void establacerValorMenu() {
        valorMenu =   valorInicial+valorPostre+valorBebida;
    }

    
>>>>>>> d4fa515bb961e2c58c80ee99ce4b197bcc15c938
    @Override
    public String toString() {

        String cadena = String.format("Menú del Dia: \n"
                + "Nombre del plato: %s\n"
                + "Valor inicial: %.2f\n"
                + "Valor postre: %.2f\n"
                + "Valor bebida: %.2f\n"
                + "Valor Menú: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorInicial(),
                obtenerValorPostre(),
                obtenerValorBebidas(),
                obtenerValorMenu());
        return cadena;
    }

}
