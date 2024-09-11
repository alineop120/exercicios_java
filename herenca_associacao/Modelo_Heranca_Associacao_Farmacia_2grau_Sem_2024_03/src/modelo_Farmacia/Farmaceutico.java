package modelo_Farmacia;

public class Farmaceutico extends Funcionario {
    private String formacao;

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    public Farmaceutico(int matricula, String nome, Double salario,
            String formacao) {
        super(matricula, nome, salario);
        this.formacao=formacao;
    }
    
    @Override
    public String toString() {
        return "\n\n-- Dados do Funcionario: Farmaceutico"+
                "\nMatriucla: "+getMatricula()+
                "\nNome: "+getNome()+
                "\nSalario: "+getSalario()+
                "\nFormação: "+getFormacao();
    }
}
