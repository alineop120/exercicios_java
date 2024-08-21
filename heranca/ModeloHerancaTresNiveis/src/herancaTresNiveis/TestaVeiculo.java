package herancaTresNiveis;

public class TestaVeiculo {

    public static void main(String[] args) {
        //Classe DeCarga
        Simples S = new Simples("X1234Y987", "Caminhão", 7.5, 20.9);
        System.out.println(S);
        Duplo D = new Duplo("U73R732", "Carreta", 4.6, 2);
        System.out.println(D);
        
        //Classe Passeio
        Gol G = new Gol("FY83654", "G4", 2007, 4);
        System.out.println(G);
        
        //Classe De2Rodas
        Moto M = new Moto("UHD3928A", "Scooter", "Y7213", 10);
        System.out.println(M);
    }
    
}
