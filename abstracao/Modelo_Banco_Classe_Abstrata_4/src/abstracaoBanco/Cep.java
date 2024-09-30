package abstracaoBanco;

public class Cep {
    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public Cep(String numero) {
        this.numero = numero;
    }
    
    @Override
    public String toString() {
        return "\nNumero: "+getNumero();
    }
}
