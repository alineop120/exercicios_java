package herancaPessoa;

public class Funcionario extends Pessoa{
    //Variaveis
    private String cargo;
    private Double salario; //Double = 10.0 e double = 10

    //Refatorar e Encapsular
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    //Construtor
    public Funcionario(String nome, String cpf, String cargo, Double salario){
        super(nome, cpf);
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public String toString(){
        return "-- Dados do Funcionário --" +
               "\nNome: " + getNome() +
               "\nCPF: " + getCpf() +
               "\nCargo: " + getCargo() +
               "\nSalário: " + getSalario();
    }
    
}
