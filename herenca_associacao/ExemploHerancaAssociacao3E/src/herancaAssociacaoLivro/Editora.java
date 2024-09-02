package herancaAssociacaoLivro;

public class Editora {
    private String nome;
    private String endereco;  

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
    
    public Editora(String nome, String endereco) {
        this.nome=nome;
        this.endereco=endereco;        
    }
    
    @Override
    public String toString() {
        return "\nNome: "+getNome()+
                "\nEndereço: "+getEndereco();
    }
}
