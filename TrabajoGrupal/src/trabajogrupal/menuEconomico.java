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
public class MenuEconomico extends Menu {

    private double descuento;

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
    }

    @Override
    public String toString() {
        return String.format("%s" + super.toString()
                + "Porcentaje de descuento, "
                + "en referencia al valor inicial del menú",
                obtenerDescuento());
    }

}
