package associacaoClubeFutebol;

public class Treino {
    //Variaveis
    private String descricao;

    //Refatorar e Encapsular
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    //Contrustor
    public Treino(String descricao) {
        this.descricao=descricao;
    }
    
    //Saida de Dados
    @Override
    public String toString() {
        return "\nDescrição: "+getDescricao();
    }
}
