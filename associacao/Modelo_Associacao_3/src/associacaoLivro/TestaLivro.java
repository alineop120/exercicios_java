package associacaoLivro;

public class TestaLivro {

    public static void main(String[] args) {
        Livro L = new Livro("Amanhecer",2200, 
                new Edicao(654321, 2160, 
                        new Patrocinador("Rafael", 
                                new Editora("52A9-32", "Publicadora Brasiliense", 
                                        new Endereco("Avenida Jabuticada", 90)), 
                                new Endereco("Quadra 41", 5)))); 
        System.out.println(L);
    }
    
}
