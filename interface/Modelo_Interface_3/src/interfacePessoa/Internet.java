package interfacePessoa;

/**
 *
 * @author 364975
 */
public class Internet extends Servico implements HoraExtra {
    protected static Double valorHora;

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
    
    public Internet(String nome, Double valorHora) {
        super(nome);
        this.valorHora = valorHora;
    }
    
    @Override
    public Double totalPagar(){
        return (valorHora * QTDHORAEXTRA);
    } 
    
    @Override
    public String toString(){
        return "\nNome: "+getNome()+
                "\nValor por Hora: "+getValorHora()+
                "\nQuantidade de horas extras: "+QTDHORAEXTRA+
                "\nTotal a Pagar: "+totalPagar();
    }
}
