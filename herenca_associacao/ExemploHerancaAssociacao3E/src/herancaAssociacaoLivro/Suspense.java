package herancaAssociacaoLivro;

public class Suspense extends Livro {
    private int qtdePaginas;

    public int getQtdePaginas() {
        return qtdePaginas;
    }

    public void setQtdePaginas(int qtdePaginas) {
        this.qtdePaginas = qtdePaginas;
    }
    
    public Suspense(String nome, Autor autor, Editora editora, int qtdePaginas) {
        super(nome, autor, editora);
        this.qtdePaginas=qtdePaginas;
    }
    
    public String toString() {
        return "\n--- Dados do Livro Suspense ---"+
                "\nNome do Livro: "+getNome()+
                "\n\n--- Autor do Livro ---"+getAutor()+
                "\n\n--- Editora do Livro ---"+getEditora()+
                "\nQuantidade de Páginas: "+getQtdePaginas();
    }
}
