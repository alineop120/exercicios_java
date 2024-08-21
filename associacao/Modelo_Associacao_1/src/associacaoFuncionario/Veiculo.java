package associacaoFuncionario;

public class Veiculo {
    //Variáveis
    private String modelo;
    private Porta porta;
    
    //Refatoração e Encapsulação
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Porta getPorta() {
        return porta;
    }

    public void setPorta(Porta porta) {
        this.porta = porta;
    }
    
    //Construtor
    public Veiculo(String modelo, Porta porta) {
        this.modelo=modelo;
        this.porta=porta;
    }
    
    //Saída de Dados
    @Override
    public String toString() {
        return "\nModelo: "+getModelo()+
                "\n\n --- Dados de Porta ---"+getPorta();
    }
   
}
