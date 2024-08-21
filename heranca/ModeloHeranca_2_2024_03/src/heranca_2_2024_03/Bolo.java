package heranca_2_2024_03;

public class Bolo extends Produto {
    private String nome;
    private double peso, preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public Bolo(String dataFabricacao, String dataValidade, int codigo, String nome, double peso, double preco) {
        super(dataFabricacao, dataValidade, codigo);
        this.nome=nome;
        this.peso=peso;
        this.preco=preco;
    }
    
    @Override
    public String toString() {
        return "\n---- DADOS DO BOLO ----"+
                "\nData de Fabricação: "+getDataFabricacao()+
                "\nData de Validação: "+getDataValidade()+
                "\nCódigo: "+getCodigo()+
                "\nNome: "+getNome()+
                "\nPeso: "+getPeso()+
                "\nPreço: "+getPreco();
    }
}
