package associacaoLivro;

public class Endereco {
    //Variaveis
    private String rua;
    private int numero;

    //Refatoração e Encapsulação
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //Construtor
    public Endereco(String rua, int numero) {
        this.rua=rua;
        this.numero=numero;
    }
    
    //Saída de Dados
    @Override
    public String toString() {
        return "\nRua: "+getRua()+
                "\nNúmero: "+getNumero();
    }
}
