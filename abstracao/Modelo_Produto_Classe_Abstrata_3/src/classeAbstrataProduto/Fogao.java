package classeAbstrataProduto;

public class Fogao extends Produto {
    private int qtdChamas;

    public int getQtdChamas() {
        return qtdChamas;
    }

    public void setQtdChamas(int qtdChamas) {
        this.qtdChamas = qtdChamas;
    }
    
    public Fogao(String codBarra, String descricao, Double preco, Fornecedor fornecedor, Fisica fisica, int qtdChamas) {
        super(codBarra, descricao, preco, fornecedor, fisica);
        this.qtdChamas = qtdChamas;
    }
    
    @Override
    public Double icms() {
        return (0.15);
    }
    
    @Override
    public Double ipi() {
        return (0.72);
    }
    
    @Override
    public Double precoFinal() {
        return (preco + icms() + ipi());
    }
    
    @Override
    public String toString() {
        return "\n\n-- Dados do Produto: Geladeira --"+
                "\nCódigo de Barra: "+getCodBarra()+
                "\nDescrição: "+getDescricao()+
                "\nPreço: "+getPreco()+
                "\nQuantidade das Chamas: "+getQtdChamas()+
                "\n\n-- Dados do Fornecedor --"+getFornecedor()+
                "\n\n-- Dados da Pessoa Fisica --"+getFisica();
    }
    
}
