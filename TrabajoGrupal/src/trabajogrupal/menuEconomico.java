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
public class menuEconomico extends menu {

    private double descuento;

    public menuEconomico(String nP, double vM, double vI, double d) {
        super(nP, vI);
        descuento = d;
        // 10
    }

    public double obtenerDescuento() {
        return descuento;
    }

    public void establecerValorPostre(double n) {
        descuento = n;
    }

    @Override
    public String toString() {
        return String.format("%s" + super.toString()
                + "Porcentaje de descuento, "
                + "en referencia al valor inicial del menú",
                obtenerDescuento());
    }

}


