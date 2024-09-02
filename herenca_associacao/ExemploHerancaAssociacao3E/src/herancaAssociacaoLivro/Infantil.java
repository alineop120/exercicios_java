package herancaAssociacaoLivro;

public class Infantil extends Livro{
    private String faixaEtaria;

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
    
    public Infantil(String nome, Autor autor, Editora editora, String faixaEtaria) {
        super(nome, autor, editora);
        this.faixaEtaria=faixaEtaria;
    }
    
    @Override
    public String toString() {
        return "\n--- Dados do Livro Infantil ---"+
                "\nNome do Livro: "+getNome()+
                "\n\n--- Autor do Livro ---"+getAutor()+
                "\n\n--- Editora do Livro ---"+getEditora()+
                "\nFaixa Etaria: "+getFaixaEtaria();
    }
}
