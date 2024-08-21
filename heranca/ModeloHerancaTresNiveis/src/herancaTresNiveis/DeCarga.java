package herancaTresNiveis;

public class DeCarga extends Veiculo {
    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public DeCarga(String chassi, String modelo, double peso) {
        super(chassi, modelo);
        this.peso=peso;
    }
    
}
