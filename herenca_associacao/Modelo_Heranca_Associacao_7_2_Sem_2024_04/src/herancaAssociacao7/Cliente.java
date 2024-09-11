package herancaAssociacao7;

public class Cliente {
    private String cpf;
    private String nome;
    private Endereco endereco;
    private Produto produto;

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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public Cliente(String cpf, String nome, Endereco endereco,
            Produto produto) {
        this.cpf=cpf;
        this.nome=nome;
        this.endereco=endereco;
        this.produto=produto;
    }
    
    @Override
    public String toString() {
        return "\nCpf: "+getCpf()+
                "\nNome: "+getNome()+
                "\n\n-- Dados do Endereco --"+getEndereco()+
                "\n\n--- Dados do Produto --"+getProduto();
    }
}
