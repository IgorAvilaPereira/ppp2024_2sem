package negocio;

public abstract class Cargo {
    protected double inicial;
    protected String descricao;
    protected double salario;

    public Cargo (){
        this.inicial = 1000;
        this.descricao = this.getClass().getSimpleName();
    }

    public String getDescricao() {
        return this.descricao;
    
    }    
    public double salario() {
        return this.inicial + this.salario;
    }    
}
