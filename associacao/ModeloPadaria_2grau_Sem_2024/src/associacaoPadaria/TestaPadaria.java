package associacaoPadaria;

public class TestaPadaria {

    public static void main(String[] args) {
        System.out.print("--- Dados da Padaria ---");
        Padaria p = new Padaria("987.965.324/0020-74", "Pedro", "(27) 3522-4756", 
                new Cliente("789.654.268-52", "Dafne", 17, 
                        new Produto("45689", "Pão", 61.4, 
                                new TipoProduto("Pão de sal"),
                                new Fornecedor("799.466.697/9126-09", "Iasmin", "(87) 5461-5414", 
                                    new Endereco("Quadra Quadra 104", 30,
                                        new Cep("72859-628"))))), 
                new Endereco("Rua 400", 54, 
                        new Cep("66812-087")));
        System.out.println(p);
    }
    
}
