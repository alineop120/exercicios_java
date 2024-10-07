package abstrataReceitaFederal;

public class TestaReceitaFederal {
    
    public static void main(String[] args){
        Auditor auditor = new Auditor(7894, "Marcos", 5000.6, 
                new Endereco("Rua da Onça", 9), 200.9,
                 new Auditoria(5, "09/06/22"));
        System.out.println(auditor);
    
         Atendente atendente = new Atendente(8, "Maria", 1500.0, 
                new Endereco("Rua da Conceição", 12), "Bancário", 
                new Fisica("João", 
                        new Endereco("Avenida Tecido", 33), "845.616.518-60", 
                        new ParaPessoaFisica(4, 2023, 2000.0, 
                                new Deducao(22, "...", 500.0), 
                                new Pagamento(44, "...", 350.0), 
                                new Bens(63, "...", 632.1), 5520.8, 
                                new Dependente(32, "Júlia", 25))));
        System.out.println(atendente);
        
        Juridica juridica = new Juridica("Flávia", 
                new Endereco("Maria das Graças", 26), "6666", 
                new ParaPessoaJuridica(6, 2002, 10000.5, 
                        new Deducao(63, "...", 525.5), 
                        new Pagamento(32, "...", 756.3), 
                        new Bens(72, "...", 750.0), "Nenhuma!"));
        System.out.println(juridica);  
    
    
    
    }      
}
