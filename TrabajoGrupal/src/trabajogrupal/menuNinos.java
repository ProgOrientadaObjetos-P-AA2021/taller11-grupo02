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
public class MenuNinos extends Menu {

    private double valorHelado;
    private double valorPastel;

    public MenuNinos(String nP, double vI, double vH, double vP) {
        super(nP, vI);
        valorHelado = vH;
        valorPastel = vP;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public void establecerValorHelado(double vH) {
        valorHelado = vH;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }

    public void establecerValorPastel(double vP) {
        valorPastel = vP;
    }

    @Override
    public void establacerValorMenu() {
        valorMenu = valorHelado + valorPastel + valorInicial;
    }

    @Override
    public String toString() {
        return String.format("%s" + super.toString()
                + "Valor de porcion de helado:%s\n"
                + "Valor de porcion de pastel: %.2f\n",
                obtenerValorHelado(),
                obtenerValorPastel());
    }
}
