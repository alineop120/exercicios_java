package interfaceMatematica;

/**
 *
 * @author 364975
 */
public class TestaMatematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica matematica = new Matematica("Algebra", 72.100, 
                new AplicacaoPratica("Calcular a area e perimetro", 
                        new Circulo("circulo", 15.0), 
                        new Retangulo("pararelepipedo", 4.0, 9.0), 
                        new Quadrado("de 4 lados", 6.0)));
        System.out.println(matematica);
    }
    
}
