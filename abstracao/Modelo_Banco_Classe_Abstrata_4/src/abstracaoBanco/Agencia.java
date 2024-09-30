package abstracaoBanco;

public class Agencia {
    private int numAgencia;
    private String nome;

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Agencia(int numAgencia, String nome) {
        this.numAgencia = numAgencia;
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "\nNumero da Agencia: "+getNumAgencia()+
                "\nNome: "+getNome();
    }
}
