package herancaPessoa;

public class Aluno extends Pessoa{
    //Variáveis
    private String matricula;

    //Refatorar e Encapsular
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    //Construtor
    public Aluno(String nome, String cpf, String matricula){
        super(nome, cpf);
        this.matricula = matricula;
    }
    
    public String toString(){
        return "\n-- Dados do Aluno --" +
               "\nNome: " + getNome() +
               "\nCPF: " + getCpf() +
               "\nDisciplina: " + getMatricula();
    }
    
}
