package herancaPessoa;

public class TestaPessoa {

    public static void main(String[] args) {
        Funcionario F = new Funcionario("Carolina", "999.999.999-99", "Vendedora", 1200.0);
        System.out.println(F);
        
        Professor P = new Professor("Julian", "999.999.999-99", "Geografia", 2200.0);
        System.out.println(P);
        
        Aluno A = new Aluno("Ari", "999.999.999-99", "99999-Z");
        System.out.println(A);
    }
    
}
