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
public abstract class Barco {
    String nombre;
    Calendar circulacion;

    public Barco(String nombre) {
        this.nombre = nombre;
        this.circulacion = Calendar.getInstance();
    }

    public final String getNombre() {
        return nombre;
    }

    public final Calendar getCirculacion() {
        return circulacion;
    }
    
    @Override
    public String toString(){
        return this.nombre;
    }
    
    public abstract void agregarElemento();
    public abstract double vaciarCobrar();
    public abstract double precioElemento();
}
