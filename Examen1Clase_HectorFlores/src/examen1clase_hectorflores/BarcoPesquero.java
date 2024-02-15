/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1clase_hectorflores;

import java.util.Calendar;

/**
 *
 * @author hecto
 */
public final class BarcoPesquero extends Barco{
    int pecesCapturados;
    TipoPesquero tipo;

    public BarcoPesquero(String nombre, TipoPesquero tipo) {
        super(nombre);
        this.pecesCapturados = 0;
        this.tipo = tipo;
    }
    
    @Override
    public void agregarElemento(){
        pecesCapturados ++;
    }
    
    @Override
    public double vaciarCobrar(){
        double total = 0;
        
        for (int i = 0; i < pecesCapturados; i++) {
            total += precioElemento();
        }
        
        pecesCapturados = 0;
        return total;
    }
    
    @Override
    public double precioElemento(){
        return tipo.getPrice();
    }
    
    @Override
    public String toString(){
        return super.toString() + " Tipo: " + tipo.name() + " Peces Capturados: " + pecesCapturados;
    }
}
