package heranca_2_2024_03;

public class Pao extends Produto {
    private String tempoFermentacao;
    
    public String getTempoFermentacao() {
        return tempoFermentacao;
    }

    public void setTempoFermentacao(String tempoFermentacao) {
        this.tempoFermentacao = tempoFermentacao;
    }
    
    public Pao(String dataFabricacao, String dataValidade, int codigo, String tempoFermentacao) {
        super(dataFabricacao, dataValidade, codigo);
        this.tempoFermentacao=tempoFermentacao;
    }

    
}
