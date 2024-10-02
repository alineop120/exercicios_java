package abstrataReceitaFederal;

public abstract class Funcionario {
    private int matricula;
    private String nome;
    protected static Double salario;
    private Endereco endereco;

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Funcionario(int matricula, String nome, Double salario, Endereco endereco) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.endereco = endereco;
    }
    
    public abstract Double calculaSalario();
}
