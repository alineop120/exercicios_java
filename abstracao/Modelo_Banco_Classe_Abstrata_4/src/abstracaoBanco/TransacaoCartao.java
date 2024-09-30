package abstracaoBanco;

public class TransacaoCartao {
    private int numero;
    protected static Double valor;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public TransacaoCartao(int numero, Double valor) {
        this.numero = numero;
        this.valor = valor;
    }
    
    public static Double saldoFuturo() {
        return (CartaoCredito.saldoParcial() - valor);
    }
    
    @Override
    public String toString() {
        return "\nNome: "+getNumero()+
                "\nValor: "+getValor();
    }
}
