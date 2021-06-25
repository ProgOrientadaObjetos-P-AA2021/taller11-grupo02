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
public class menuCarta extends Menu {
=======
public class MenuCarta extends Menu {
>>>>>>> d4fa515bb961e2c58c80ee99ce4b197bcc15c938

    protected double valorPorcionGuarnicion;
    protected double valorBebida;
    protected double porcentajeAdicion;

<<<<<<< HEAD
    public menuCarta(String nP, double vI, double vP, double vB, double pA) {
        super(nP, vI);
        establecerValorGuarnicion(vP);
        establecerValorBebidas(vB);
        establecerPorcentajeAdicion(pA);
=======
    public MenuCarta(String nP, double vI, double vG, double vB) {
        super(nP, vI);
        valorGuarni = vG;
        valorBebida = vB;
    
>>>>>>> d4fa515bb961e2c58c80ee99ce4b197bcc15c938
    }

    @Override
    public void establecerNombrePlato(String nP) {
        nombrePlato = nP;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorPorcionGuarnicion + valorBebida
                + valorInicial + (valorInicial * (porcentajeAdicion / 100));
    }

    @Override
    public void establecerValorInicial(double vI) {
        valorInicial = vI;
    }

    public void establecerValorGuarnicion(double vP) {
        valorPorcionGuarnicion = vP;
    }

    public void establecerValorBebidas(double vH) {
        valorBebida = vH;
    }

<<<<<<< HEAD
    public void establecerPorcentajeAdicion(double pA) {
        porcentajeAdicion = pA;
    }

    public double obtenerValorGuarnicion() {
        return valorPorcionGuarnicion;
    }

    public double obtenerValorBebidas() {
        return valorBebida;
    }

    public double obtenerPorcentajeAdicion() {
        return porcentajeAdicion;
    }
=======
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
>>>>>>> d4fa515bb961e2c58c80ee99ce4b197bcc15c938

    @Override
    public String toString() {
        String cadena = String.format("Menú a la carta: \n"
                + "Nombre del plato: %s\n"
                + "Valor inicial: %.2f\n"
                + "Valor por guarnición: %.2f\n"
                + "Valor por bebida: %.2f\n"
                + "Valor adicional: %.2f\n"
                + "Valor Menú: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorInicial(),
                obtenerValorGuarnicion(),
                obtenerValorBebidas(),
                obtenerPorcentajeAdicion(),
                obtenerValorMenu());
        return cadena;
    }

}
