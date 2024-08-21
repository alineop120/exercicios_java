package heranca_2_2024_03;

public class Produto {
    //Variaveis
    private String dataFabricacao, dataValidade;
    private int codigo;

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public Produto(String dataFabricacao, String dataValidade, int codigo){
        this.dataFabricacao=dataFabricacao;
        this.dataValidade=dataValidade;
        this.codigo=codigo;        
    }
    
}
