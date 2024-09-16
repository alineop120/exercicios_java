package classeAbstrata_Veiculo_1;

public class Proprietario {
    private String cpf;
    private String nome;
    private Endereco endereco;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Proprietario(String cpf, String nome, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco =endereco;
    }
    
    @Override
    public String toString() {
        return "\nCPF: "+getCpf()+
                "\nNome: "+getNome()+
                "\n-- Dados do Endereço --"+getEndereco();
    }
}
