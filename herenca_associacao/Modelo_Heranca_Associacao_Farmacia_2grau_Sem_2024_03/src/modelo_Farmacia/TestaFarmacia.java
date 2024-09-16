package modelo_Farmacia;

public class TestaFarmacia {

    public static void main(String[] args) {
        Compra c = new Compra(5, "20/09", 106.8, 
                new Pagamento("a vista"),
                new Cliente("744.851.484-16", "Roberta", "04/06/1950", 
                        new Pedido(56, 50.90, 
                                new Atendente(45562, "Ana", 1500.9, 50), 
                                new Perfumaria("456987", "Gabriel", 15.01, 
                                        new Fornecedor("45321", "Fabiana", "Rua 9"), 50.9, "prateleira 10")), 
                        new Receita("02/10", 40.5, 
                                new Medicamento("456987", "nome", 50.4, 
                                        new Fornecedor("45321", "Fabiana", "Rua 9"), "tarja", "doenca"), 
                                new Farmaceutico(56987, "Adriana", 5000.7, "Medica"))));        
        System.out.println(c);
    }
    
}
