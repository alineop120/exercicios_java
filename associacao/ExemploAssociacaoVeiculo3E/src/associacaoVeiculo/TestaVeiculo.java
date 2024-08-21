package associacaoVeiculo;
public class TestaVeiculo {
    public static void main(String[] args) {

        Veiculo V = new Veiculo("JJJ-0001","Azul",
                new Motor(110.0, "Flex"),
                new Roda(15,5),
                new Porta("Esquerdo"));
        
        System.out.println(V);
    }
    
}
