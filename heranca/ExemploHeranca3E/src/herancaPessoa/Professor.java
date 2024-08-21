package herancaPessoa;

public class Professor extends Pessoa{
    //Variáveis
    private String disciplina;
    private Double salario;

    //Refatorar e Encapsular
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    //Construtor
    public Professor(String nome, String cpf, String disciplina, Double salario){
        super(nome, cpf);
        this.disciplina = disciplina;
        this.salario = salario;
    }
    
    public String toString(){
        return "\n-- Dados do Professor --" +
               "\nNome: " + getNome() +
               "\nCPF: " + getCpf() +
               "\nDisciplina: " + getDisciplina() +
               "\nSalário: " + getSalario();
    }
    
}
