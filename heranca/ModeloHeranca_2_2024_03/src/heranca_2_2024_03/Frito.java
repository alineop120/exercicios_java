package heranca_2_2024_03;

public class Frito extends Salgado {
    private String tipoDaMassa;

    public String getTipoDaMassa() {
        return tipoDaMassa;
    }

    public void setTipoDaMassa(String tipoDaMassa) {
        this.tipoDaMassa = tipoDaMassa;
    }
    
    public Frito(String dataFabricacao, String dataValidade, int codigo, String nome, double quantidade, String tipoDaMassa) {
        super(dataFabricacao, dataValidade, codigo, nome, quantidade);
        this.tipoDaMassa=tipoDaMassa;
    }
    
    @Override
    public String toString() {
        return "\n---- DADOS DO SALGADO FRITO ----"+
                "\nData de Fabricação: "+getDataFabricacao()+
                "\nData de Validação: "+getDataValidade()+
                "\nCódigo: "+getCodigo()+
                "\nNome: "+getNome()+
                "\nQuantidade: "+getQuantidade()+
                "\nTipo da Massa: "+getTipoDaMassa();
    }
}