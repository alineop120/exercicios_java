package herancaAssociacaoLivro;

public class Drama extends Livro {
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Drama(String nome, Autor autor, Editora editora, String descricao) {
        super(nome, autor, editora);
        this.descricao=descricao;
    }
    
    @Override
    public String toString() {
        return "\n--- Dados do Livro Drama ---"+
                "\nNome do Livro: "+getNome()+
                "\n\n--- Autor do Livro ---"+getAutor()+
                "\n\n--- Editora do Livro ---"+getEditora()+
                "\nDescrição: "+getDescricao();
    }
}
