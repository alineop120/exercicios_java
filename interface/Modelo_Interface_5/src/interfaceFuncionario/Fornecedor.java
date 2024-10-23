package interfaceFuncionario;

/**
 *
 * @author 364975
 */
public class Fornecedor {
    private String descricao;
    private String nome;
    private DoFornecedor doFornecedor;
    private Endereco endereco;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DoFornecedor getDoFornecedor() {
        return doFornecedor;
    }

    public void setDoFornecedor(DoFornecedor doFornecedor) {
        this.doFornecedor = doFornecedor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Fornecedor(String descricao, String nome, DoFornecedor doFornecedor, Endereco endereco) {
        this.descricao = descricao; 
        this.nome = nome; 
        this.doFornecedor = doFornecedor; 
        this.endereco = endereco;
    }
    
    @Override
    public String toString() {
        return "\nDescricao: "+getDescricao()+
                "\nNome: "+getNome()+
                "\n\n-- Dados do Forncedor --"+getDoFornecedor()+
                "\n\n-- Dados do Endereco --"+getEndereco();
    }
}
