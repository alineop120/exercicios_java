package herancaTresNiveis;

public class Duplo extends DeCarga {
    private int qtdeEixos;

    public int getQtdeEixos() {
        return qtdeEixos;
    }

    public void setQtdeEixos(int qtdeEixos) {
        this.qtdeEixos = qtdeEixos;
    }
    
    public Duplo(String chassi, String modelo, double peso, int qtdeEixos) {
        super(chassi, modelo, peso);
        this.qtdeEixos=qtdeEixos;
    }
    
    @Override
    public String toString() {
        return"\n------ VEÍCULO DUPLO ------"+
              "\nChassi: "+getChassi()+
              "\nModelo: "+getModelo()+
              "\nPeso: "+getPeso()+
              "\nQuantidade de Eixos: "+getQtdeEixos();
    }   
    
}
