package interfaceMatematica;

/**
 *
 * @author 364975
 */
public class Retangulo extends FiguraGeometrica implements ObjetoGeometrico{
    private Double ladoMenor;
    private Double ladoMaior;

    public Double getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(Double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    public Double getLadoMaior() {
        return ladoMaior;
    }

    public void setLadoMaior(Double ladoMaior) {
        this.ladoMaior = ladoMaior;
    }
    
    public Retangulo(String nome, Double ladoMenor, Double ladoMaior) {
        super(nome);
        this.ladoMenor = ladoMenor;
        this.ladoMaior = ladoMaior;
    }
    
    @Override
    public Double calculaArea() { 
        return (ladoMenor * ladoMaior);
    }

    @Override
    public Double calculaPerimetro() {
        return (2 * ladoMenor) + (2 * ladoMaior);
    }
    
    @Override
    public String toString() {
        return "\nNome: "+getNome()+
                "\nLado Menor: "+getLadoMenor()+
                "\nLado Maior: "+getLadoMaior()+
                "\nArea: "+calculaArea()+
                "\nPerimetro: "+calculaPerimetro();
    }
}
