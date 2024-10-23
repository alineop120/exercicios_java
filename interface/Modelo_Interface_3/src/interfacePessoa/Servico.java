package interfacePessoa;

/**
 *
 * @author 364975
 */
public abstract class Servico {
    private String nome;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Servico(String nome) {
        this.nome = nome;
    }

    public abstract Double totalPagar(); 
    
    @Override
    public abstract String toString();

}
