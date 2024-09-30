package abstracaoBanco;

public class Conta {
    private int numCartao;
    private Double saldo;
    private Transacao transacao;
    private Agencia agencia;

    public int getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(int numCartao) {
        this.numCartao = numCartao;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Transacao getTransacao() {
        return transacao;
    }

    public void setTransacao(Transacao transacao) {
        this.transacao = transacao;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    
    public Conta (int numCartao, Double saldo, Transacao transacao, Agencia agencia) {
        this.numCartao = numCartao;
        this.saldo = saldo;
        this.transacao = transacao;
        this.agencia = agencia;
    }
    
    public static Double saldoConta() {
        return (TransacaoCartao.saldoFuturo() - TransacaoCartao.valor);
    }
    
    @Override
    public String toString() {
        return "\nNumero do Cartao: "+getNumCartao()+
                "\nSaldo: "+getSaldo()+
                "\n\n-- Dados da Transação --"+getTransacao()+
                "\n\n-- Dados da Agencia --"+getAgencia();
    }
}
