package herancaTresNiveis;

public class Moto extends De2Rodas {
    private double cilindrada;

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    public Moto(String chassi, String modelo, String placa, double cilindrada) {
        super(chassi, modelo, placa);
        this.cilindrada=cilindrada;
    }
    
    @Override
    public String toString() {
        return"\n---- VEÍCULO MOTO ----"+
              "\nChassi: "+getChassi()+
              "\nModelo: "+getModelo()+
              "\nPlaca: "+getPlaca()+
              "\nCilindrada: "+getCilindrada();
    }
}
