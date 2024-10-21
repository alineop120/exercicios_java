package interfaceMatematica;

/**
 *
 * @author 364975
 */
public class Circulo extends FiguraGeometrica implements ObjetoGeometrico {
    private Double raio;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
    
    public Circulo(String nome, Double raio) {
        super(nome);
        this.raio = raio;
    }
    
    @Override
    public Double calculaArea(){
        return (Math.PI * (raio * raio));
    }
    @Override
    public Double calculaPerimetro() {
        return ((2 * Math.PI) * raio);
    }
    
    @Override
    public String toString() {
        return "\nNome: "+getNome()+
                "\nRaio: "+getRaio()+
                "\nArea: "+calculaArea()+
                "\nPerimetro: "+calculaPerimetro();
    }
}
