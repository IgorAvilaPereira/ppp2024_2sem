package negocio;

public class ContaCorrente {
    private String nomeTitular;
    private int nro;
    private double saldo;
    private double limiteCartaoCredito;
    private double limiteDiarioDePix;
    private String telefoneDeContato;
    private double limiteChequeEspecial;


    private ContaCorrente(String nomeTitular, int nro, double saldo, double limiteCartaoCredito,
            double limiteDiarioDePix, String telefoneDeContato, double limiteChequeEspecial) {
        this.nomeTitular = nomeTitular;
        this.nro = nro;
        this.saldo = saldo;
        this.limiteCartaoCredito = limiteCartaoCredito;
        this.limiteDiarioDePix = limiteDiarioDePix;
        this.telefoneDeContato = telefoneDeContato;
        this.limiteChequeEspecial = limiteChequeEspecial;
    }


    public String getNomeTitular() {
        return nomeTitular;
    }


    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }


    public int getNro() {
        return nro;
    }


    public void setNro(int nro) {
        this.nro = nro;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public double getLimiteCartaoCredito() {
        return limiteCartaoCredito;
    }


    public void setLimiteCartaoCredito(double limiteCartaoCredito) {
        this.limiteCartaoCredito = limiteCartaoCredito;
    }


    public double getLimiteDiarioDePix() {
        return limiteDiarioDePix;
    }


    public void setLimiteDiarioDePix(double limiteDiarioDePix) {
        this.limiteDiarioDePix = limiteDiarioDePix;
    }


    public String getTelefoneDeContato() {
        return telefoneDeContato;
    }


    public void setTelefoneDeContato(String telefoneDeContato) {
        this.telefoneDeContato = telefoneDeContato;
    }


    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }


    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    

    
    @Override
    public String toString() {
        return "ContaCorrente [nomeTitular=" + nomeTitular + ", nro=" + nro + ", saldo=" + saldo
                + ", limiteCartaoCredito=" + limiteCartaoCredito + ", limiteDiarioDePix=" + limiteDiarioDePix
                + ", telefoneDeContato=" + telefoneDeContato + ", limiteChequeEspecial=" + limiteChequeEspecial + "]";
    }




    public static class Builder {
        private String nomeTitular;
        private int nro;
        private double saldo;
        private double limiteCartaoCredito;
        private double limiteDiarioDePix;
        private String telefoneDeContato;
        private double limiteChequeEspecial;

        public Builder nomeTitular(String nomeTitular){
            this.nomeTitular = nomeTitular;
            return this;
        }

        public Builder nro(int nro){
            this.nro = nro;
            return this;
        }

        public Builder saldo(double saldo) {
            this.saldo = saldo;
            return this;    
        }

        public Builder limiteDoCartaoCredito (double limiteCartaoCredito){
            this.limiteCartaoCredito = limiteCartaoCredito;
            return this;
        }

        public Builder limiteDiarioDePix (double limiteDiarioDePix){
            this.limiteDiarioDePix = limiteDiarioDePix;
            return this;
        }
        public Builder telefoneDeContato (String telefoneDeContato) {
            this.telefoneDeContato = telefoneDeContato;
            return this;
        }
        public Builder limiteChequeEspecial(double limiteChequeEspecial) {
            this.limiteChequeEspecial = limiteChequeEspecial;
            return this;
        }

        public ContaCorrente build(){
            ContaCorrente contaCorrente = new ContaCorrente(this.nomeTitular, this.nro, this.saldo, this.limiteCartaoCredito, this.limiteDiarioDePix, this.telefoneDeContato, this.limiteChequeEspecial);
            return contaCorrente;
        }

    }

    
    
}
