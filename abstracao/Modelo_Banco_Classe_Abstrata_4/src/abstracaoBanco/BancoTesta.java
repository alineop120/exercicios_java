package abstracaoBanco;

public class BancoTesta {

    public static void main(String[] args) {
        Fisica fis =  new Fisica(500.9, "Rorge", "6248-8139", 50000.9, 50.2, 
                new Conta(7894, 200.5, 
                        new Transacao("pix", 350.1), 
                        new Agencia(67, "Banco")), 
                new CartaoCredito(98, "20/09", 460.5, 
                        new TransacaoCartao(90, 120.7)),
                new Endereco("Rua da Misericordia", 254, 
                        new Cep("7598.954-789")), "841.841.515-14");
        System.out.println(fis);
    }
    
}
