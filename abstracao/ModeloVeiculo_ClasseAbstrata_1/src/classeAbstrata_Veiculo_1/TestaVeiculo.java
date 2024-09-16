
package classeAbstrata_Veiculo_1;

public class TestaVeiculo {

    public static void main(String[] args) {
        DePasseio dp =  new DePasseio("459T75C", 2025, "prata", 1900.9, 
                new Proprietario("456987712", "Antonio", 
                        new Endereco("408", 5)), "Hydai", "versão 1.0", 
                new Montadora("84815151", "Veiculos plus", 
                        new Endereco("902", 70)));
        System.out.println(dp);
        
        Onibus o = new Onibus("8445858", 2000, "azul", 3009.7, 
                new Proprietario("8451155", "Jorge", 
                        new Endereco("603", 8)), 20, 
                new Montadora("846481", "Veiculos Plus",
                        new Endereco("304", 10)));
        System.out.println(o);
        
        Moto m = new Moto("844454", 2003, "preto", 1900.4, 
                new Proprietario("8465156", "Noé", 
                        new Endereco("705", 11)), 5);
        System.out.println(m);
    }
    
}
