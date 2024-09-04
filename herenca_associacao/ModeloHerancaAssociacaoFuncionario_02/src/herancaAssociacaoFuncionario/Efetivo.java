package herancaAssociacaoFuncionario;

public class Efetivo {
    private double salario;
    private OrgaoPublico orgaopublico;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public OrgaoPublico getOrgaopublico() {
        return orgaopublico;
    }

    public void setOrgaopublico(OrgaoPublico orgaopublico) {
        this.orgaopublico = orgaopublico;
    }
    
    public Efetivo(double salario, OrgaoPublico orgaopublico) {
        this.salario=salario;
        this.orgaopublico=orgaopublico;
    }
}
