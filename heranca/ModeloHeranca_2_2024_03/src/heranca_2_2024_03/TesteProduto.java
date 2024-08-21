package heranca_2_2024_03;

public class TesteProduto {

    public static void main(String[] args) {
        //Classe De Sal
        DeSal DS = new DeSal("19/03/2034", "20/04/2034", 5698, "5min", 4, 1);
        System.out.println(DS);
        
        //Classe Recheado
        Recheado R = new Recheado("29/03/2034", "20/04/2034", 5698, "5min", "Pronto");
        System.out.println(R);
        
        //Classe Bolo
        Bolo B = new Bolo("09/03/2034", "29/04/2034", 5698, "Formigueiro", 4, 1);
        System.out.println(B);
        
        //Classe Assado
        Assado A = new Assado("31/03/2034", "12/05/2034", 5698, "5min", 6, 3);
        System.out.println(A);
        
        //Classe Frito
        Frito F = new Frito("19/03/2034", "20/03/2034", 5698, "5min", 4, "Crocante");
        System.out.println(F);
        
    }
    
}
