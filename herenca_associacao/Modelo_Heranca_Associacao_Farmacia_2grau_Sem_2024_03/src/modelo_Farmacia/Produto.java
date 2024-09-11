
package modelo_Farmacia;

public class Produto {
    private String codigo;
    private String nome;
    private Double preco;
    private Fornecedor fornecedor;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public Produto(String codigo, String nome, Double preco, 
            Fornecedor fornecedor) {
        this.codigo=codigo;
        this.nome=nome;
        this.preco=preco;
        this.fornecedor=fornecedor;
    }

    
}
