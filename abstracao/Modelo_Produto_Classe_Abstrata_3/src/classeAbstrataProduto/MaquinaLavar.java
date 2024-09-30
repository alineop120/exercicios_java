package classeAbstrataProduto;

public class MaquinaLavar extends Produto {
    private int qtdKg;

    public int getQtdKg() {
        return qtdKg;
    }

    public void setQtdKg(int qtdKg) {
        this.qtdKg = qtdKg;
    }
    
    public MaquinaLavar(String codBarra, String descricao, Double preco, Fornecedor fornecedor, Fisica fisica, int qtdKg) {
        super(codBarra, descricao, preco, fornecedor, fisica);
        this.qtdKg = qtdKg;
    }
    
    @Override
    public Double icms() {
        return (0.25);
    }
    
    @Override
    public Double ipi() {
        return (0.0675);
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
                "\nQuantidade dos Kg: "+getQtdKg()+
                "\n\n-- Dados do Fornecedor --"+getFornecedor()+
                "\n\n-- Dados da Pessoa Fisica --"+getFisica();
    }
        
}
