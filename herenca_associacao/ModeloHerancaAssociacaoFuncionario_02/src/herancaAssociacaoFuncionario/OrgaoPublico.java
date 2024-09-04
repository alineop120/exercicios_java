package herancaAssociacaoFuncionario;

public class OrgaoPublico {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public OrgaoPublico(String nome) {
        this.nome=nome;
    }
    
    @Override
    public String toString() {
        return "\nNome: "+getNome();
    }
}
