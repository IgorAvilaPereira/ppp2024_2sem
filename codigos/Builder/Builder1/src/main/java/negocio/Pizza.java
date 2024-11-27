package negocio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author iapereira
 */
public class Pizza {

    private int tamanho;

    private boolean queijo;
    private boolean tomate;
    private boolean bacon;
    private boolean cebola;

    Pizza(int tamanho, boolean queijo, boolean tomate, boolean bacon, boolean cebola) {
        this.tamanho = tamanho;
        this.queijo = queijo;
        this.tomate = tomate;
        this.bacon = bacon;
        this.cebola = cebola;
    }

    private Pizza(PizzaBuilder builder) {
        this.tamanho = builder.tamanho;
        this.queijo = builder.queijo;
        this.tomate = builder.tomate;
        this.cebola = builder.cebola;
        this.bacon = builder.bacon;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isQueijo() {
        return queijo;
    }

    public void setQueijo(boolean queijo) {
        this.queijo = queijo;
    }

    public boolean isTomate() {
        return tomate;
    }

    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }

    public boolean isBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public boolean isCebola() {
        return cebola;
    }

    public void setCebola(boolean cebola) {
        this.cebola = cebola;
    }

    @Override
    public String toString() {
        return "Pizza{" + "tamanho=" + tamanho + ", queijo=" + queijo + ", tomate=" + tomate + ", bacon=" + bacon + ", cebola=" + cebola + '}';
    }
    
    

    public static class PizzaBuilder {

        private int tamanho;
        private boolean queijo;
        private boolean tomate;
        private boolean bacon;
        private boolean cebola;

        public PizzaBuilder(int tamanho) {
            this.tamanho = tamanho;
        }

        public PizzaBuilder queijo() {
            this.queijo = true;
            return this;
        }

        public PizzaBuilder tomate() {
            this.tomate = true;
            return this;
        }

        public PizzaBuilder bacon() {
            this.bacon = true;
            return this;
        }

        public PizzaBuilder cebola() {
            this.cebola = true;
            return this;
        }
        
        public Pizza build(){
            return new Pizza(this);
        }

    }

    
}
