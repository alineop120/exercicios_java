package interfacePessoa;

/**
 *
 * @author 364975
 */
public class Impressao extends Servico {
    private Double valorImpressao;

    public Double getValorImpressao() {
        return valorImpressao;
    }

    public void setValorImpressao(Double valorImpressao) {
        this.valorImpressao = valorImpressao;
    }
    
    public Impressao(String nome, Double valorImpressao) {
        super(nome);
        this.valorImpressao = valorImpressao;
    }
    
    @Override
    public Double totalPagar() {
        return (Internet.valorHora * HoraExtra.QTDHORAEXTRA);
    }
    
    @Override
    public String toString() {
        return "\nNome: "+getNome()+
                "\nValor da Impressão: "+getValorImpressao()+
                "\nValor por Hora: "+Internet.valorHora+
                "\nQuantidade de horas extras: "+HoraExtra.QTDHORAEXTRA+
                "\nTotal a pagar: "+totalPagar();
    }
}
