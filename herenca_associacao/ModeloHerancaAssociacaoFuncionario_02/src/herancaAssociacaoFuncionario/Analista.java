package herancaAssociacaoFuncionario;

public class Analista extends Efetivo {
    private String funcao;
    private double gratificacao;

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    public Analista(double salario, OrgaoPublico orgaopublico, String funcao,
            double gratificacao) {
        super(salario, orgaopublico);
        this.funcao=funcao;
        this.gratificacao=gratificacao;
    }
    
    @Override
    public String toString() {
        return "\n\n--- Dados do Funcionario Terceirizado ---"+
                "\nSalario: "+getSalario()+
                "\n--- Dados do Orgao Publico ---"+getOrgaopublico()+
                "\nFunção: "+getFuncao()+
                "\nGratificação: "+getGratificacao();
    }
}
