package interfaceMatematica;

/**
 *
 * @author 364975
 */
public abstract class FiguraGeometrica {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public FiguraGeometrica(String nome) {
        this.nome = nome;
    }
    
    @Override
    public abstract String toString();
}
