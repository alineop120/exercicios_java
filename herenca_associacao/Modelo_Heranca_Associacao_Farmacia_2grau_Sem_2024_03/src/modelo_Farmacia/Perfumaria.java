package modelo_Farmacia;

public class Perfumaria extends Produto {
    private Double desconto;
    private String secao;

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }
    
    public Perfumaria(String codigo, String nome, Double preco,
            Fornecedor fornecedor, Double desconto, String secao) {
        super(codigo, nome, preco, fornecedor);
        this.desconto=desconto;
        this.secao=secao;
    }
    
    @Override
    public String toString() {
        return "\n\n-- Dados do Protudo: Perfumaria --"+
                "\nCodigo: "+getCodigo()+
                "\nNome: "+getNome()+
                "\nPreço: "+getPreco()+
                "\n\n-- Dados do Fornecedor --"+getFornecedor()+
                "\nDesconto: "+getDesconto()+
                "\nSeção: "+getSecao();
        
    }
}
