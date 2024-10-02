package abstrataReceitaFederal;

public class Dependente {
    private int codigo;
    private String nome;
    private int idade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Dependente(int codigo, String nome, int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
    }
    
    @Override
    public String toString() {
        return "\nCodigo: "+getCodigo()+
                "\nNome: "+getNome()+
                "\nIdade: "+getIdade();
    }
}
