package associacaoLivro;

public class Patrocinador {
    //Variáveis
    private String nome;
    private Editora editora;
    private Endereco endereco;
    
    //Refatorar e Encapsular
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    //Construtor
    public Patrocinador(String nome, Editora editora, Endereco endereco) {
        this.nome=nome;
        this.editora=editora;
        this.endereco=endereco;
    }
    
    //Saída de Dados
    @Override
    public String toString() {
        return "\nNome: "+getNome()+
                "\n\n --- Dados de Editora ---"+getEditora()+
                "\n\n --- Dados de Endereço ---"+getEndereco();
    }
    
}
