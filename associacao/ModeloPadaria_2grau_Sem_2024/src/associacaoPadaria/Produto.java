package associacaoPadaria;

public class Produto {
    //Variaveis
    private String codigo;
    private String nome;
    private Double preco;
    private TipoProduto tipoProduto;
    private Fornecedor fornecedor;
    
    //Refatorar e Encapsular
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

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoproduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    //Construtor
    public Produto(String codigo, String nome, Double preco, TipoProduto tipoProduto, Fornecedor fornecedor) {
        this.codigo=codigo;
        this.nome=nome;
        this.preco=preco;
        this.tipoProduto=tipoProduto;
        this.fornecedor=fornecedor;
    }
    
    //Saída de dados
    @Override
    public String toString() {
        return "\n Código: "+getCodigo()+
                "\n Nome: "+getNome()+
                "\n Preço: "+getPreco()+
                "\n\n -- Dados do Tipo de Produto --"+getTipoProduto()+
                "\n\n -- Dados do Fornecedor --"+getFornecedor();
    }

   
    
}
