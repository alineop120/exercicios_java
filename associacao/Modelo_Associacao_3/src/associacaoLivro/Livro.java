package associacaoLivro;

public class Livro {
    //Variáveis
    private String titulo;
    private int numeroPaginas;
    private Edicao edicao;
    
    //Refatorar e Encapsular
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Edicao getEdicao() {
        return edicao;
    }

    public void setEdicao(Edicao edicao) {
        this.edicao = edicao;
    }
    
    //Construtor
    public Livro(String titulo,int numeroPaginas, Edicao edicao) {
        this.titulo=titulo;
        this.numeroPaginas=numeroPaginas;
        this.edicao=edicao;
    }            
    
    //Saída de Dados
    @Override
    public String toString() {
        return "\nTítulo: "+getTitulo()+
                "\nNúmero de Páginas: "+getNumeroPaginas()+
                "\n\n --- Dados de Edição ---"+getEdicao();
    }

}
