package herancaAssociacaoLivro;

public class TestaLivro {

    public static void main(String[] args) {
        Infantil I = new Infantil("Colorindo", 
                new Autor("999.999.999-99", "Fabio"),
                new Editora("Brasileira Plus", "Rua da Graça"), "De 0 a 5 anos");
        System.out.println(I);
        
        Drama D = new Drama("A culpa é das estrelas", 
                new Autor("123.456.78-90", "Clara Rocha"), 
                new Editora("Editora Brasil", "Avenida Ponte do Sol"), "História trágica");
        System.out.println(D);
        
        Suspense S = new Suspense("O Misterio", 
                new Autor("987.654.321-01", "Claudio Gomes"), 
                new Editora("Livros Plus", "Avenida 25 - Q10"), 500);
        System.out.println(S);
        
        
    }
    
}
