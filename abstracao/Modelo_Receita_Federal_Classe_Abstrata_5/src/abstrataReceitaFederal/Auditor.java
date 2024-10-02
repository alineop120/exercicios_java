package abstrataReceitaFederal;

public class Auditor extends Funcionario {
    protected static Double gratificacao;

    public Double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(Double gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    public Auditor(int matricula, String nome, Double salario, Endereco endereco, Double gratificaca) {
        super(matricula, nome, salario, endereco);
        this.gratificacao = gratificacao;
    }
    
    @Override
    public Double calculaSalario() {
        return(salario+(salario*gratificacao)+gratificacao);
    }
}
