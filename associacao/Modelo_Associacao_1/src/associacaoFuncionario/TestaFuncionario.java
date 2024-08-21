package associacaoFuncionario;

public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario F = new Funcionario("987654", "Fabiano",
                new Residencia("Rua do Jordão", 
                        new Porta(0.90, 2.15)), 
                new Veiculo("Mobi",
                        new Porta(2.7, 2.0)));
        System.out.println(F);
    }
    
}
