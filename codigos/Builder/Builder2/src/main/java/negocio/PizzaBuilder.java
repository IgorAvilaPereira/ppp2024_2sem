/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;


public class PizzaBuilder {

    private int tamanho = 10;
    private boolean queijo;
    private boolean tomate;
    private boolean bacon;
    private boolean cebola;

    public PizzaBuilder() {
    }

    public PizzaBuilder tamanho(int tamanho) {
        this.tamanho = tamanho;
        return this;
    }

    public PizzaBuilder queijo(boolean queijo) {
        this.queijo = queijo;
        return this;
    }

    public PizzaBuilder tomate(boolean tomate) {
        this.tomate = tomate;
        return this;
    }

    public PizzaBuilder bacon(boolean bacon) {
        this.bacon = bacon;
        return this;
    }

    public PizzaBuilder cebola(boolean cebola) {
        this.cebola = cebola;
        return this;
    }

    public Pizza build() {
        return new Pizza(tamanho, queijo, tomate, bacon, cebola);
    }
    
}
