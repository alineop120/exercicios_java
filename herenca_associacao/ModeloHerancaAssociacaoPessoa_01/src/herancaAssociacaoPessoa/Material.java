package herancaAssociacaoPessoa;

public class Material {
    private String nome;
    private int quantidade;
    private Fornecedor fornecedor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public Material(String nome, int quantidade, Fornecedor fornecedor) {
        this.nome=nome;
        this.quantidade=quantidade;
        this.fornecedor=fornecedor;
    }
    
    @Override
    public String toString() {
        return "\nNome: "+getNome()+
                "\nQuantidade: "+getQuantidade()+
                "--- Dados do Fornecedor ---"+getFornecedor();
    }
}
