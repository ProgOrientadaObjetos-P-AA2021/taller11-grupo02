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
public class menuCarta extends menu {

    private double valorGuarni;
    private double valorBebida;
    private double pocentajeAdi;

    public menuCarta(String nP, double vM, double vI, double vP, double vB,
    double pA) {
        super(nP, vI);
        valorGuarni = vP;
        valorBebida = vB;
        pocentajeAdi = pA;
    }

    public double obtenervalorGuarni() {
        return valorGuarni;
    }

    public void establecerValorGuarni(double n) {
        valorGuarni = n;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public void establecerValorBebida(double n) {
        valorBebida = n;
    }

    public double obtenerPocentajeAdi() {
        return valorBebida;
    }

    public void establecerPocentajeAdi(double n) {
        valorBebida = n;
    }
    @Override
    public String toString() {
        return String.format("%s" + super.toString()
                + "Valor de porción de guarnición:%s\n"
                + "Valor de bebida: %.2f\n"
                + "porcentaje adicional por servicio en relacion "
                + "del valor inicial del menú", obtenervalorGuarni(),
                obtenerValorBebida(), obtenerPocentajeAdi());
    }
}
