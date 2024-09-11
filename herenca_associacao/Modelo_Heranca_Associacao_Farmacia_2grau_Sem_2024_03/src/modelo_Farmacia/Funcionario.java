package modelo_Farmacia;

public class Funcionario {
    private int matricula;
    private String nome;
    private Double salario;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public Funcionario(int matricula, String nome, Double salario) {
        this.matricula=matricula;
        this.nome=nome;
        this.salario=salario;
    }
}
