package herancaAssociacaoFuncionario;

public class Tecnico extends Efetivo {
    private String setor;
    private double auxTransporte;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getAuxTransporte() {
        return auxTransporte;
    }

    public void setAuxTransporte(double auxTransporte) {
        this.auxTransporte = auxTransporte;
    }
    
    public Tecnico(double salario, OrgaoPublico orgaopublico, String setor, 
            double auxTransporte) {
        super(salario, orgaopublico);
        this.setor=setor;
        this.auxTransporte=auxTransporte;
    }
    
    @Override
    public String toString() {
        return "\n\n--- Dados do Funcionario Terceirizado ---"+
                "\nSalario: "+getSalario()+
                "\n--- Dados do Orgao Publico ---"+getOrgaopublico()+
                "\nFunção: "+getSetor()+
                "\nAux. Transporte: "+getAuxTransporte();
    }
}
