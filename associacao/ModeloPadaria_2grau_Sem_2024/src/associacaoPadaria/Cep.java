package associacaoPadaria;

public class Cep {
    //Variaveis
    private String numero;

    //Refatorar e Encapsular
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    //Construtor
    public Cep(String numero) {
        this.numero=numero;
    }
    
    //Saída de dados
    @Override
    public String toString() {
        return "\n Número: "+getNumero();
    }
    
    
}
