package classeAbstrataProduto;

public class ProdutoTesta {

    public static void main(String[] args) {
        Loja loja = new Loja("8475118", "Casas Bahia", 
                new Geladeira("841561184", "cor prata", 5000.9, 
                        new Fornecedor("8525817548", "Marcio", 
                                new Endereco("Rua da Joia", 4), 
                                new DoFornecedor(7, "30/09", 1200.4, "30/12")), 
                        new Fisica("Noe", 1.90, 96.4, 1985, 2024, "495.488.487-07", 
                                new DoCliente(75, "05/04", 2009.7, "Joia eu e voce")), "Electrolux", 3), 
                new Fogao("951515", "cooktop", 8000.7, 
                        new Fornecedor("8525817548", "Marcio", 
                                new Endereco("Rua da Joia", 4), 
                                new DoFornecedor(7, "30/09", 1200.4, "30/12")), 
                        new Fisica("Noe", 1.90, 96.4, 1985, 2024, "495.488.487-07", 
                                new DoCliente(75, "05/04", 2009.7, "Joia eu e voce")), 5), 
                new MaquinaLavar("48945618", "Lava e Seca Branca Perfect Care Inverter com Água Quente/Vapor", 3700.99, 
                        new Fornecedor("8525817548", "Marcio", 
                                new Endereco("Rua da Joia", 4), 
                                new DoFornecedor(7, "30/09", 1200.4, "30/12")), 
                        new Fisica("Noe", 1.90, 96.4, 1985, 2024, "495.488.487-07", 
                                new DoCliente(75, "05/04", 2009.7, "Joia eu e voce")), 11));
    }
    
}
