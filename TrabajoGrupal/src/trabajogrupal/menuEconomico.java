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
public class menuEconomico extends Menu {
=======
public class MenuEconomico extends Menu {
>>>>>>> d4fa515bb961e2c58c80ee99ce4b197bcc15c938

    protected double descuento;

<<<<<<< HEAD
    public menuEconomico(String nP, double vI, double d) {
        super(nP, vI);
        establecerDescuento(d);
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial - (valorInicial * (descuento / 100));
    }

    public void establecerDescuento(double tipo) {
        descuento = tipo;
    }

    public double obtenerDescuento() {
        return descuento;
=======
    public MenuEconomico(String nP, double vI) {
        super(nP, vI);
 
        // 10
    }

    public void establecerDescuento() {
        descuento = valorInicial * 0.1;
    }

    public double obtenerDescuento() {
        return descuento;
    }

    @Override
    public void establacerValorMenu() {
        valorMenu = valorInicial - descuento;
>>>>>>> d4fa515bb961e2c58c80ee99ce4b197bcc15c938
    }

    @Override
    public String toString() {
        String cadena = String.format("Menú Económico: \n"
                + "Nombre del plato: %s\n"
                + "Valor inicial: %.2f\n"
                + "Descuento: %.2f\n"
                + "Valor Menú: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorInicial(),
                obtenerDescuento(),
                obtenerValorMenu());
        return cadena;
    }

}
