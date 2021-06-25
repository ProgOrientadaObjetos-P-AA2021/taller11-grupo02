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
public class MenuCarta extends Menu {


    private double valorPorcionGuarnicion;
    private double valorBebida;
    private double porcentajeAdicion;
    
    public MenuCarta(String nP, double vI, double vP, double vB){
        super(nP,vI);
        establecerValorGuarnicion(vP);
        establecerValorBebidas(vB);
      
    }
    
    @Override
    public void establecerNombrePlato(String nP){
        nombrePlato= nP;
    }
    
    @Override
    public void establecerValorMenu(){
        valorMenu = valorPorcionGuarnicion + valorBebida + 
                valorInicial + porcentajeAdicion;
       
    }    

    
    public void establecerValorGuarnicion(double vP){
        valorPorcionGuarnicion = vP;
    }
    
    public void establecerValorBebidas(double vH){
        valorBebida = vH;
    }
    
    public void establecerPorcentajeAdicion(){
        porcentajeAdicion = valorInicial*0.20 ;
    }
    
    public double obtenerValorGuarnicion(){
        return valorPorcionGuarnicion;
    }
    
    public double obtenerValorBebidas(){
        return valorBebida;
    }
    
    public double obtenerPorcentajeAdicion(){
        return porcentajeAdicion;
    }
    
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