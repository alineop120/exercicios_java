package heranca51;

public class TestaPessoa {

    public static void main(String[] args) {
        //Classe Vendedor
        Vendedor V = new Vendedor("Jorge", "Rua da Graça", 2345, 2000.0, "Hortifrutes", 6500.0, 500.0);
        System.out.println(V);
        
        //Classe Diretor
        Diretor D = new Diretor("Gabriel", "Chacára 200-X", 6984, 4000.0, 400.0);
        System.out.println(D);
        
        //Classe PessoaFisica
        PessoaFisica PF = new PessoaFisica("Tori", "Cidade Rodinha da Alegria", 34, "999.999-09");
        System.out.println(PF);
        
        //Classe PessoaJuridica
        PessoaJuridica PJ = new PessoaJuridica("Carlos", "Chacára 52-F", 90, "482.309-12");
        System.out.println(PJ);
    }
    
}
