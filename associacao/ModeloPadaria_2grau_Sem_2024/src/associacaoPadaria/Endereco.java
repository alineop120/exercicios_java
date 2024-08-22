package associacaoPadaria;

public class Endereco {
    //Variaveis
    private String rua;
    private int numero;
    private Cep cep;
    
    //Refatorar e Encapsular
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

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }
    
    //Construtor
    public Endereco(String rua, int numero, Cep cep) {
        this.rua=rua;
        this.numero=numero;
        this.cep=cep;
    }

    //Saída de dados
    @Override
    public String toString() {
        return "\n Rua: "+getRua()+
                "\n Número: "+getNumero()+
                "\n\n --- Dados de CEP ---"+getCep();
    }

}
