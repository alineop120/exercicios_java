package heranca51;

public class Funcionario extends Pessoa {
    private int matr;
    private Double salario;

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public Funcionario(String nome, String endereco, int matr, Double salario) {
        super(nome, endereco);
        this.matr=matr;
        this.salario=salario;
    }
    
}
