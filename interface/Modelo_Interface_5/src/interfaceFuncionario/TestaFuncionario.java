package interfaceFuncionario;

public class TestaFuncionario {
  
    public static void main(String[] args) {
        Vendedor ven = new Vendedor("8545", "Fabio", 2000.4, 
                new Endereco("rua", 7), 38, 
                new Medicamento("69876-K", "nome", 54.99, 
                        new Fornecedor("descricao", "nome", 
                                new DoFornecedor(46, "descricao", "data", 29.90), 
                                new Endereco("rua", 4))), 
                new Cliente("863.216.544-84", "Monica", 41, 
                        new Endereco("rua", 456), 
                        new DoCliente(60, "descricao", 50.4), 
                        new Medicamento("69876-K", "nome", 54.99, 
                        new Fornecedor("descricao", "nome", 
                                new DoFornecedor(46, "descricao", "data", 29.90), 
                                new Endereco("rua", 4)))));
        System.out.println(ven);
        
        Entregador ent = new Entregador("78965413-X", "Antonia", 4500.1, 
                new Endereco("rua", 789), "gol",
                new Medicamento("7991264", "nome", 50.4, 
                        new Fornecedor("descricao", "nome", 
                                new DoFornecedor(46, "descricao", "data", 76.4), 
                                new Endereco("rua", 64))));
        System.out.println(ent);
    }
    
}
