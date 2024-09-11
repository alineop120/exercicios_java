package herancaAssociacao7;

public class Endereco {
    private String rua;
    private int numero;
    private String cep;

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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public Endereco(String rua, int numero, String cep) {
        this.rua=rua;
        this.numero=numero;
        this.cep=cep;
    }
    
    @Override
    public String toString() {
        return "\nRua: "+getRua()+
                "\nNumero: "+getNumero()+
                "\nCep: "+getCep();
    }
}
