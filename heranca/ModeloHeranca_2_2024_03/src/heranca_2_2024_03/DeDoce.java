package heranca_2_2024_03;

public class DeDoce extends Pao{
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public DeDoce (String dataFabricacao, String dataValidade, int codigo, String tempoFermentacao, String descricao) {
        super(dataFabricacao, dataValidade, codigo, tempoFermentacao);
        this.descricao=descricao;
    }
        
}
