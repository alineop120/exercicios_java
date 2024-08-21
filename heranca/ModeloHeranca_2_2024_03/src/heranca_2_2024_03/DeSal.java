package heranca_2_2024_03;

public class DeSal extends Pao {
    private int quantidade;
    private double tempoParaPassar;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTempoParaPassar() {
        return tempoParaPassar;
    }

    public void setTempoParaPassar(double tempoParaPassar) {
        this.tempoParaPassar = tempoParaPassar;
    }
    
    public DeSal(String dataFabricacao, String dataValidade, int codigo, String tempoFermentacao, int quantidade, double tempoParaPassar) {
        super(dataFabricacao, dataValidade, codigo, tempoFermentacao);
        this.quantidade=quantidade;
        this.tempoParaPassar=tempoParaPassar;
        
    }
    
    @Override
    public String toString() {
        return "\n---- DADOS DO PÃO DE SAL ----"+
                "\nData de Fabricação: "+getDataFabricacao()+
                "\nData de Validação: "+getDataValidade()+
                "\nCódigo: "+getCodigo()+
                "\nTempoFermentação: "+getTempoFermentacao()+
                "\nQuantidade: "+getQuantidade()+
                "\nTempo para passar: "+getTempoParaPassar();
    }
}
