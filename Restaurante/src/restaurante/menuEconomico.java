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
public class MenuEconomico extends Menu {
    
    private double descuento;
    
    public MenuEconomico(String nP, double vI){
        super( nP, vI);
       
    }
    
    @Override
    public void establecerValorMenu(){
        valorMenu = valorInicial - descuento;
    }
    
    public void establecerDescuento(){
        descuento = valorInicial*0.1;
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

