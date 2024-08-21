package heranca_2_2024_03;

public class Recheado extends DeDoce {
    private String descricaoRecheio;

    public String getDescricaoRecheio() {
        return descricaoRecheio;
    }

    public void setDescricaoRecheio(String descricaoRecheio) {
        this.descricaoRecheio = descricaoRecheio;
    }
    
    public Recheado(String dataFabricacao, String dataValidade, int codigo, String tempoFermentacao, String descricao) {
        super(dataFabricacao, dataValidade, codigo, tempoFermentacao, descricao);
        this.descricaoRecheio=descricaoRecheio;
    }
    
    public String toString() {
        return "\n---- DADOS DO PÃO DE DOCE RECHEADO ----"+
                "\nData de Fabricação: "+getDataFabricacao()+
                "\nData de Validação: "+getDataValidade()+
                "\nCódigo: "+getCodigo()+
                "\nTempoFermentação: "+getTempoFermentacao()+
                "\nDescrição: "+getDescricao()+
                "\nDescrição do Recheio: "+getDescricaoRecheio();
    }
    
}
