package abstrataReceitaFederal;

public class Auditor extends Funcionario {
    protected static Double gratificacao;
    private Auditoria auditoria;

    public Double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(Double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public Auditoria getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(Auditoria auditoria) {
        this.auditoria = auditoria;
    }
    
    public Auditor(int matricula, String nome, Double salario, Endereco endereco, Double gratificacao, Auditoria auditoria){
        super(matricula, nome, salario, endereco);
        this.gratificacao=gratificacao;
        this.auditoria=auditoria;        
    }
    
    @Override
    public Double calculaSalario() {
        return (salario+(salario*gratificacao)+gratificacao);
    }
    
    @Override
    public String toString(){
        return  "\n\n-- Dados do Funcionario Auditor --"+
                "\nMatrícula:" + getMatricula()+
                "\nNome:" + getNome()+
                "\nSalário:" + getSalario()+
                "\nEndereço:" + getEndereco()+
                "\nGratificação:" + getGratificacao()+
                "\nAuditoria:"+  getAuditoria();
    }
}