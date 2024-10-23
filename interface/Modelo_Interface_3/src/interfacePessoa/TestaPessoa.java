package interfacePessoa;

/**
 *
 * @author 364975
 */
public class TestaPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dados da Pessoa
        Funcionario func = new Funcionario("123.456.789-91", "Galvao", 
                new Endereco("Rua da Flor de Liz", 45), 754698, 957.6);
        System.out.println(func);
        System.out.println("\n");
        
        Tecnico tec = new Tecnico("568.412.367-20", "Ana", 
                new Endereco("Rua 7", 7), "81531", 400.6, 
                new Equipamento("Sony", "7895C-X"));
        System.out.println(tec);
        System.out.println("\n");
        
        Cliente clnt = new Cliente("942.651.679-99", "Jordana", 
                new Endereco("Rua 44", 6), 120.6, 20, 
                new Internet("Gigas+", 50.7), 
                new Impressao("Impressão Design", 50.4));
        System.out.println(clnt);
        
    }
    
}
