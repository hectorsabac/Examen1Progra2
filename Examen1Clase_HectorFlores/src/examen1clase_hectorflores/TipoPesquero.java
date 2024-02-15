/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1clase_hectorflores;


public enum TipoPesquero {
    PEZ(15), CAMARON(10), LANGOSTA(50);
    
    public final double price;

    private TipoPesquero(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
