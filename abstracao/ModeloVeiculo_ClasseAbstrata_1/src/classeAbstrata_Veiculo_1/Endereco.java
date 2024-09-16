package classeAbstrata_Veiculo_1;

public class Endereco {
    private String rua;
    private int numero;

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
    
    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\nRua: "+getRua()+
                "\nNúmero: "+getNumero();
    }
}
