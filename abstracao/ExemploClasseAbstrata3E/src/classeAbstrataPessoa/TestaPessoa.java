package classeAbstrataPessoa;

public class TestaPessoa {

    public static void main(String[] args) {
        //Classes Herdeiras
        Professor professor = new Professor("Pedro", 1000, 5000,
                new Filiacao("Joaquim", "Joana"), "Mestre", "Educação");
        System.out.println(professor);
        
        Empregado empregado = new Empregado("Kelvin", 1000, 6000,
                new Filiacao("Mateus", "Adriane"), "456931-E", "Gestor");
        System.out.println(empregado);
    }
    
}
