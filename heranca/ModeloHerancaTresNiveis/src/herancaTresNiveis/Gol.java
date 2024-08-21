package herancaTresNiveis;

public class Gol extends DePasseio {
    private int qtdePortas;

    public int getQtdePortas() {
        return qtdePortas;
    }

    public void setQtdePortas(int qtdePortas) {
        this.qtdePortas = qtdePortas;
    }
    
    public Gol(String chassi, String modelo, int ano, int qtdePortas) {
        super(chassi, modelo, ano);
        this.qtdePortas=qtdePortas;        
    }
    
    @Override
    public String toString() {
        return"\n------- VEÍCULO GOL -------"+
              "\nChassi: "+getChassi()+
              "\nModelo: "+getModelo()+
              "\nAno: "+getAno()+
              "\nQuantidade de Portas: "+getQtdePortas();
    }    
}
