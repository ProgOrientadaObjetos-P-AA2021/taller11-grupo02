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
<<<<<<< HEAD:TrabajoGrupal/src/trabajogrupal/menuNiños.java
public class menuNiños extends Menu {

    protected double valorHelado;
    protected double valorPastel;

    public menuNiños(String nP, double vI, double vH, double vP) {
        super(nP, vI);
        establecerValorHelado(vH);
        establecerValorPastel(vP);
=======
public class MenuNinos extends Menu {

    private double valorHelado;
    private double valorPastel;

    public MenuNinos(String nP, double vI, double vH, double vP) {
        super(nP, vI);
        valorHelado = vH;
        valorPastel = vP;
>>>>>>> d4fa515bb961e2c58c80ee99ce4b197bcc15c938:TrabajoGrupal/src/trabajogrupal/menuNinos.java
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial + valorHelado + valorPastel;
    }

    public void establecerValorHelado(double vH) {
        valorHelado = vH;
<<<<<<< HEAD:TrabajoGrupal/src/trabajogrupal/menuNiños.java
=======
    }

    public double obtenerValorPastel() {
        return valorPastel;
>>>>>>> d4fa515bb961e2c58c80ee99ce4b197bcc15c938:TrabajoGrupal/src/trabajogrupal/menuNinos.java
    }

    public void establecerValorPastel(double vP) {
        valorPastel = vP;
    }

<<<<<<< HEAD:TrabajoGrupal/src/trabajogrupal/menuNiños.java
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
=======
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
>>>>>>> d4fa515bb961e2c58c80ee99ce4b197bcc15c938:TrabajoGrupal/src/trabajogrupal/menuNinos.java
    }

}
