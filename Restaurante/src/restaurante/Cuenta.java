/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;
import java.util.ArrayList;
/**
 *
 * @author Usuario iTC
 */
public class Cuenta {
    
    private String nombreCliente;
    private ArrayList <Menu> menu = new ArrayList<>();
    private double iva;
    private double valorTotal;
    private double subTotal;
   
    
    public Cuenta(String nC, ArrayList <Menu> lista, double i) {
        nombreCliente = nC;
        menu = lista;
        iva = i;    
    }
    
    public void establecerNombreCliente(String nC){
        nombreCliente = nC;
    }
    
    public void establecerIva(double IVA){
        iva = IVA;
    }
    public void establecerValorTotal(){
        valorTotal = subTotal + (subTotal * iva);
    }
    public void establecerSubTotal(){
        for(int i = 0; i < listaCarta().size();i++){
            subTotal = subTotal + listaCarta().get(i).valorMenu;
        }
    }    
    
    public void establecerMenu(ArrayList <Menu> lista) {
        menu = lista;
    }
    
    public String obtenerNombreCliente(){
        return nombreCliente;
    }
    
    public double obtenerIva(){
        return iva;
    }
    
    public double obtenerValorTotal(){
        return valorTotal;
    }
    
    public double obtenerSubTotal(){
        return subTotal;
    }
    
    public ArrayList <Menu> listaCarta() {
        return menu;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\tCuenta a pagar\n"
                + "Nombre: %s\n" + "Menú:\n\n", 
                obtenerNombreCliente());

        for (int i = 0; i < listaCarta().size(); i++) {
            cadena = String.format("%s" + "%s\n", cadena,
                    listaCarta().get(i));
        }
        cadena = String.format("\n%sSubtotal de cuenta: %.2f\n"
                + "Iva: %.2f\n"
                + "Total de cuenta: %.2f\n",
                cadena,
                obtenerSubTotal(), obtenerIva(), obtenerValorTotal());   
        return cadena;
    }
}

