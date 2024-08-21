package heranca_2_2024_03;

public class Salgado extends Produto {
    private String nome;
    private double quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    
    public Salgado(String dataFabricacao, String dataValidade, int codigo, String nome, double quantidade) {
        super(dataFabricacao, dataValidade, codigo);
        this.nome=nome;
        this.quantidade=quantidade;
    }
}
