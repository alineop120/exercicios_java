package interfaceMatematica;

/**
 *
 * @author 364975
 */
public abstract class Disciplina {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina(String nome) {
        this.nome = nome;
    } 
    
    public abstract String toString();
}
