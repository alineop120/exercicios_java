package abstracaoBanco;

public abstract class Pessoa {
    protected static Double saldo;
    private String nome;
    private String telefone;
    private Double limite;
    protected static Double valorGasto;
    private Conta conta;
    private CartaoCredito cartaoCredito;
    private Endereco endereco;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(Double valorGasto) {
        this.valorGasto = valorGasto;
    }
    
    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public CartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Pessoa(Double saldo, String nome, String telefone, Double limite, Double valorGasto, Conta conta, CartaoCredito cartaoCredito, Endereco endereco) {
        this.saldo = saldo;
        this.nome = nome;
        this.telefone = telefone;
        this.limite = limite;
        this.valorGasto = valorGasto;
        this.conta = conta;
        this.cartaoCredito = cartaoCredito;
        this.endereco = endereco;
    }
    
    @Override
    public abstract String toString();
}
