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
public class MenuCarta extends Menu {

    private double valorGuarni;
    private double valorBebida;
    private double pocentajeAdi;

    public MenuCarta(String nP, double vI, double vG, double vB) {
        super(nP, vI);
        valorGuarni = vG;
        valorBebida = vB;
    
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
        return pocentajeAdi;
    }

    public void establecerPocentajeAdi(double n) {
        pocentajeAdi= valorInicial*0.1;
    }
       @Override
    public void establacerValorMenu() {
        valorMenu =  valorGuarni+ valorInicial+valorBebida+pocentajeAdi;
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
