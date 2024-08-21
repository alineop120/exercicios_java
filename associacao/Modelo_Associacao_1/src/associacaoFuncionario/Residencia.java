package associacaoFuncionario;

public class Residencia {
    //Variáveis
    private String endereco;
    private Porta porta;
    
    //Refatoração e Encapsulação
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Porta getPorta() {
        return porta;
    }

    public void setPorta(Porta porta) {
        this.porta = porta;
    }
    
    //Construtor
    public Residencia(String endereco, Porta porta) {
        this.endereco=endereco;
        this.porta=porta;
    }
    
    //Saída de Dados
    @Override
    public String toString() {
        return "\nEndereço: "+getEndereco()+
                "\n\n --- Dados de Porta ---"+getPorta();
    }

}
