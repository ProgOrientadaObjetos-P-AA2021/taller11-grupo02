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
public class menuNiños extends Menu {

    protected double valorHelado;
    protected double valorPastel;

    public menuNiños(String nP, double vI, double vH, double vP) {
        super(nP, vI);
        establecerValorHelado(vH);
        establecerValorPastel(vP);
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial + valorHelado + valorPastel;
    }

    public void establecerValorHelado(double vH) {
        valorHelado = vH;
    }

    public void establecerValorPastel(double vP) {
        valorPastel = vP;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menú Niño: \n"
                + "Nombre del plato: %s\n"
                + "Valor inicial: %.2f\n"
                + "Valor por helado: %.2f\n"
                + "Valor por pastel: %.2f\n"
                + "Valor Menú: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorInicial(),
                obtenerValorHelado(),
                obtenerValorPastel(),
                obtenerValorMenu());
        return cadena;
    }

}
