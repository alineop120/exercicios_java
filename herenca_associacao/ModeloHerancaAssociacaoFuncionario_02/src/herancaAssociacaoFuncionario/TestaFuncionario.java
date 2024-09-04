package herancaAssociacaoFuncionario;

public class TestaFuncionario {

    public static void main(String[] args) {
        Analista A = new Analista(12000, 
                new OrgaoPublico("Bombeiro"), "Analizar dados", 2000);
        System.out.println(A);
        
        Tecnico T = new Tecnico(5000, 
                new OrgaoPublico("Policia"), "Coronel", 1200);
        System.out.println(T);
        
        Terceirizado TZ = new Terceirizado(1900, 
                new OrgaoPublico("Segurança"), "Detran", 
                new Formacao("Multa de transito"), 
                new Endereco("Clara Rosa", 4), "Fiscalização");
        System.out.println(TZ);
    }
    
}
