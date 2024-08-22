package associacaoPadaria;

public class TipoProduto {
    //Variaveis
    private String descricao;
    
    //Refatorar e Encapsular
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    //Construtor
    public TipoProduto(String descricao) {
        this.descricao=descricao;
    }
    
    //Saída de dados
    @Override
    public String toString() {
        return "\n Descrição: "+getDescricao();
    }
    
    
}
