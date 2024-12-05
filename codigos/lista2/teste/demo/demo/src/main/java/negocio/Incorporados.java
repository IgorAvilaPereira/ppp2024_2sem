package negocio;

public abstract class Incorporados extends Cargo {

    protected Cargo prox;

    public Incorporados(Cargo prox) {
        this.prox = prox;
        this.descricao = this.getClass().getSimpleName();
    }

    public String getDescricao() {
        return this.prox.getDescricao() + "\n"+ this.descricao;
    }

    public double salario(){
        return this.prox.salario() +  this.salario;
    }
    
}
