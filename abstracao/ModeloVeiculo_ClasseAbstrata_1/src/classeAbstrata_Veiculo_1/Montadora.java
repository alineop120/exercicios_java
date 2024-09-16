package classeAbstrata_Veiculo_1;

public class Montadora {
    private String cnpj;
    private String nome;
    private Endereco endereco;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
    
    public Montadora(String cnpj, String nome, Endereco endereco) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
    }
    
    @Override
    public String toString() {
        return "\nCNPJ: "+getCnpj()+
                "\nNome: "+getNome()+
                "\n\n-- Dados do Endereço --"+getEndereco();
    }
}
