package associacaoPadaria;

public class Fornecedor {
    //Variaveis
    private String cnpj;
    private String nome;
    private String telefone;
    private Endereco endereco;
    
    //Refatorar e Encapsular
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    //Construtor
    public Fornecedor(String cnpj, String nome, String telefone, Endereco endereco) {
        this.cnpj=cnpj;
        this.nome=nome;
        this.telefone=telefone;
        this.endereco=endereco;
    }
    
    //Saída de dados
    @Override
    public String toString() {
        return "\n CNPJ: "+getCnpj()+
                "\n Nome: "+getNome()+
                "\n Telefone: "+getTelefone()+
                "\n\n -- Dados de Endereço --"+getEndereco();
    }
 
}
