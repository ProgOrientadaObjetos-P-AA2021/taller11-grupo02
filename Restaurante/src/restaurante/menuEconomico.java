/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author Usuario iTC
 */
public class menuEconomico extends Menu {
    
    protected double descuento;
    
    public menuEconomico(String nP, double vI, double d){
        super( nP, vI);
        establecerDescuento(d);
    }
    
    @Override
    public void establecerValorMenu(){
        valorMenu = valorInicial - ( valorInicial * (descuento / 100));
    }
    
    public void establecerDescuento(double tipo){
        descuento = tipo;
    }
    
    public double obtenerDescuento(){
        return descuento;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menú Económico: \n"
                + "Nombre del plato: %s\n"
                + "Valor inicial: %.2f\n" 
                + "Descuento: %.2f\n"
                + "Valor Menú: %.2f\n", 
                obtenerNombrePlato(),
                obtenerValorInicial(),
                obtenerDescuento(),
                obtenerValorMenu()); 
        return cadena;
    }
}

