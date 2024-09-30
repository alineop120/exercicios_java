package abstracaoBanco;

public class Fisica extends Pessoa {
    private String cpf;
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public Fisica(Double saldo, String nome, String telefone, Double limite, Double valorGasto, Conta conta, CartaoCredito cartaoCredito, Endereco endereco, String cpf) {
        super(saldo, nome, telefone, limite, valorGasto, conta, cartaoCredito, endereco);
        this.cpf = cpf;
    }
    
    public static Double saldoAtual() {
        return (saldo - valorGasto);
    }

    @Override
    public String toString() {
        return "\nSaldo: "+getSaldo()+
                "\nNome: "+getNome()+
                "\nTelefone: "+getTelefone()+
                "\nLimite: "+getLimite()+
                "\nValor do Gasto: "+getValorGasto()+
                "\n\n-- Dados da Conta --"+getConta()+
                "\n\n-- Dados do Cartão de credito --"+getCartaoCredito()+
                "\n\n-- Dados do Endereço --"+getEndereco();
    }
    
}
