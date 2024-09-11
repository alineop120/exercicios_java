package herancaAssociacao7;

public class LojasTeste {

    public static void main(String[] args) {
        DeAlimentacao da = new DeAlimentacao(4, "descricao", 
                new Atendente(987, "Arthur", 1200.0), "Colombia", 
                new Cliente("123.654.789-95", "Gabriela", 
                        new Endereco("Rua da Alegria", 25, "45.692-1"),
                        new Produto(469, "Bola", 12.99, 
                                new Fornecedor("456.987/14-26", "Heitor", 
                                        new Endereco("Avenidade 280", 987, "75.618-06")))));
        System.out.println(da);
        
        DeLojas dl =new DeLojas(8, "descricao", 
                new DeUtilidades(46987, 
                        new Cliente("548.956.515-08", "Kelvin", 
                                new Endereco("Rua da Graça", 69, "8475184"),
                                new Produto(789, "Chaveiro", 30.90, 
                                        new Fornecedor("485.615/415-45", "Claudio", 
                                                new Endereco("Chacara 520", 1, "84.755-15")))), 
                        new Box(9, "descricao", 
                                new Locatario("4500", "locatario", 
                                        new Contrato(10, 5000.1)),
                                new Produto(90, "Mouse", 36.90, 
                                        new Fornecedor("879.551.510-90", "Joana", 
                                                new Endereco("Rua 80", 4, "58445151"))))),
                new DeCalcados(5, "descricao", 
                        new Atendente(84946, "Gloria", 5000.1), "tipo de produto",
                        new Cliente("845.151.848-04", "Pedro", 
                                new Endereco("Rua Antonia da Silva", 109, "84.515-01"),
                                new Produto(45698, "Baralho", 10.90, 
                                        new Fornecedor("841.551/544-65", "Rian", 
                                                new Endereco("Chacara 4569-B", 39, "84.891-88"))))));
    }
    
}
