/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1clase_hectorflores;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author hecto
 */
public class BarcoPasajero extends Barco{
    String [] nombresPasajeros;
    int max;
    double precioBoleto;
    int contador;

    public BarcoPasajero(String nombre, int max, double precioBoleto) {
        super(nombre);
        this.nombresPasajeros = new String [max];
        this.max = max;
        this.precioBoleto = precioBoleto;
        this.contador = 0;
    }
    
    @Override
    public void agregarElemento(){
        if (contador < max){
            String pasajeroNuevo = JOptionPane.showInputDialog("Nombre del pasajero: ");
            nombresPasajeros[contador - 1] = pasajeroNuevo;
        } else {
            JOptionPane.showMessageDialog(null, "No hay espacio en el barco");
        }
    }
    
    @Override
    public double vaciarCobrar(){
        double total = contador * precioBoleto;
        contador = 0;
        
        return total;
    }
    
    @Override
    public double precioElemento(){
        return precioBoleto;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Cantidad de pasajeros que compraron boleto: " + contador;
    }
    
    private void listarPasajeros(String [] pasajeros, int pos){
        if (pos < pasajeros.length){
            JOptionPane.showMessageDialog(null, "Pasajero: " + pasajeros[pos]);
            listarPasajeros(pasajeros, pos + 1);
        }
    }
    
}
