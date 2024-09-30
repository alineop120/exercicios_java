package classeAbstrataProduto;

public class Fornecedor {
    private String cnpj;
    private String nome;
    private Endereco endereco;
    private DoFornecedor doFornecedor;

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

    public DoFornecedor getDoFornecedor() {
        return doFornecedor;
    }

    public void setDoFornecedor(DoFornecedor doFornecedor) {
        this.doFornecedor = doFornecedor;
    }
    
    public Fornecedor(String cnpj, String nome, Endereco endereco, DoFornecedor doFornecedor) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.doFornecedor = doFornecedor;
    }
    
    @Override
    public String toString() {
        return "\nCNPJ: "+getCnpj()+
                "\nNome: "+getNome()+
                "\n\n-- Dados do Endereço --"+getEndereco()+
                "\n\n-- Dados do Fornecedor --"+getDoFornecedor();
    }
}