package herancaTresNiveis;

public class Simples extends DeCarga {
    private double comprimento;

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    
    public Simples(String chassi, String modelo, double peso, double comprimento) {
        super(chassi, modelo, peso);
        this.comprimento=comprimento;
        
    }
    
    @Override
    public String toString() {
        return"---- VEÍCULO SIMPLES ----"+
              "\nChassi: "+getChassi()+
              "\nModelo: "+getModelo()+
              "\nPeso: "+getPeso()+
              "\nComprimento: "+getComprimento();
    }
    
}
