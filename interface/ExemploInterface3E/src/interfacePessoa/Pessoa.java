package interfacePessoa;

/**
 *
 * @author 364975
 */
public abstract class Pessoa {
    private String nome;
    protected static Double salario;

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
    
    public Pessoa(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public abstract Double calculaSalario();
}
