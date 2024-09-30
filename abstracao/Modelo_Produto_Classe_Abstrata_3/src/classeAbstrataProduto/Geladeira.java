package classeAbstrataProduto;

public class Geladeira extends Produto {
    private String marca;
    private int qtdPortas;
    private Loja loja;
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }
    
    public Geladeira(String codBarra, String descricao, Double preco, Fornecedor fornecedor, Fisica fisica, String marca, int qtdPortas, Loja loja) {
        super(codBarra, descricao, preco, fornecedor, fisica);
        this.marca = marca;
        this.qtdPortas = qtdPortas;
        this.loja = loja;
    }
     
    @Override
    public Double icms() {
        return (0.1);
    }
    
    @Override
    public Double ipi() {
        return (0.55);
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
                "\nMarca: "+getMarca()+
                "\nQuantidade das Portas: "+getQtdPortas()+
                "\n\n-- Dados da Loja --"+getLoja()+
                "\n\n-- Dados do Fornecedor --"+getFornecedor()+
                "\n\n-- Dados da Pessoa Fisica --"+getFisica();
    }
    
}
