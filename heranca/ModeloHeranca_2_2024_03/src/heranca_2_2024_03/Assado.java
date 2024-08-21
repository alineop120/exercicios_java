package heranca_2_2024_03;

public class Assado extends Salgado {
    private double tempoDeEspera;

    public double getTempoDeEspera() {
        return tempoDeEspera;
    }

    public void setTempoDeEspera(double tempoDeEspera) {
        this.tempoDeEspera = tempoDeEspera;
    }
    
    public Assado(String dataFabricacao, String dataValidade, int codigo, String nome, double quantidade, double tempoDeEspera) {
        super(dataFabricacao, dataValidade, codigo, nome, quantidade);
        this.tempoDeEspera=tempoDeEspera;
    }
    
    @Override
    public String toString() {
        return "\n---- DADOS DO SALGADO ASSADO ----"+
                "\nData de Fabricação: "+getDataFabricacao()+
                "\nData de Validação: "+getDataValidade()+
                "\nCódigo: "+getCodigo()+
                "\nNome: "+getNome()+
                "\nQuantidade: "+getQuantidade()+
                "\nTempo de Espera: "+getTempoDeEspera();
    }
}
