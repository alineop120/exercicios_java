package associacaoFuncionario;

public class Porta {
    //Variáveis
    private Double largura;
    private Double altura;
    
    //Refatoração e Encapsulação
    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    //Construtor
    public Porta(Double largura, Double altura) {
        this.largura=largura;
        this.altura=altura;
    }
    
    //Saída de Dados
    @Override
    public String toString() {
        return "\nLargura: "+getLargura()+
                "\nAltura: "+getAltura();
    }
    
}
