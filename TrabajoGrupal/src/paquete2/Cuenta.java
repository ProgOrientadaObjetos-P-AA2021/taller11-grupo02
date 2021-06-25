/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author USUARIO
 */
public class Cuenta {
    private <Arraylist> listascuenta;
    private String cliente;
    private double valorTotal;
    private double subtotal;
    private double iva;
    private double sub;

    public Cuenta(String c, double iv) {

        cliente = c;
        iva = iv;
    }

    public void establecerValorTotal(double vH) {
        valorTotal = subtotal + sub;
    }

    public double obteneValorTotal() {
        return valorTotal;
    }

    public void establecerIva(double n) {
        iva = n;

    }

    public double obtenerIva() {
        return iva;
    }

    public void establecerSub(double n) {
        sub = subtotal * iva;

    }

    public double obtenerSub() {
        return sub;
    }
    public void establecerCliente(String n) {
        cliente = n;

    }

    public String obtenerCliente() {
        return cliente;
    }
    
 public void establecerSubtotal() {
       double suma =0;
        for (int i = 0; i < listadocartas.size(); i++) {
           suma = suma + listadocartas.get(i).establacerValorInicial();
        }
       subtotal =suma;
    }

    public double obteneSubtotal() {
        return subtotal;
    }
    
    
    @Override
    public String toString() {
        return String.format("Nombre del Cliente: %s\n"
                + "Subtotal: %.2f\n"
                + "Iva: %.2f\n"
                +"Listado de todos los menú:%s"
                 +"Valor a cancelar a total.:%.2f"
                , obtenerCliente(),
                obtenerSubtotal(),establecerSub,obteneValorTotal());
    }
}
