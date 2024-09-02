package herancaAssociacaoLivro;

public class Livro {
    private String nome;
    private Autor autor;
    private Editora editora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    
    public Livro(String nome, Autor autor, Editora editora) {
        this.nome=nome;
        this.autor=autor;
        this.editora=editora;
    }
   
}
