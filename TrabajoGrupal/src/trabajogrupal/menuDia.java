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
public class menuDia extends menu {

    private double valorPostre;
    private double valorBebida;

    public menuDia(String nP, double vM, double vI, double vP, double vB) {
        super(nP, vI);
        valorPostre = vP;
        valorBebida = vB;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public void establecerValorPostre(double vP) {
        valorPostre = vP;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public void establecerValorBebida(double vB) {
        valorBebida = vB;
    }

    
    
    @Override
    public String toString() {
        return String.format("%s" + super.toString()
                + "Valor del Postre:%s\n"
                + "Valor de bebida: %.2f\n",
                 obtenerValorPostre(),
                obtenerValorBebida());
    }

}
