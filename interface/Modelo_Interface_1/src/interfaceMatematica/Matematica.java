package interfaceMatematica;

/**
 *
 * @author 364975
 */
public class Matematica extends Disciplina {
    private Double cargaHoraria;
    private AplicacaoPratica aplicacaoPratica; 

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public AplicacaoPratica getAplicacaoPratica() {
        return aplicacaoPratica;
    }

    public void setAplicacaoPratica(AplicacaoPratica aplicacaoPratica) {
        this.aplicacaoPratica = aplicacaoPratica;
    }
    
    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public Matematica(String nome, Double cargaHoraria, AplicacaoPratica aplicacaoPratica) {
        super(nome);
        this.cargaHoraria = cargaHoraria;
        this.aplicacaoPratica = aplicacaoPratica;
    }
    
    @Override
    public String toString() {
        return "-- Dados da Disciplina: Matematica --"+
                "\nNome: "+getNome()+
                "\n\n"+getAplicacaoPratica();
    }

}
