package heranca51;

public class Pessoa {
    private String nome, endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public Pessoa(String nome, String endereco) {
        this.nome=nome;
        this.endereco=endereco;
    }
}
