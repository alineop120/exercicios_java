package associacaoClubeFutebol;

import associacaoClubeFutebol.Treino;

public class Funcionario {
    //Variaveis
    private String cargo;
    private String nome;
    private Double salario;
    private Treino treino;

    //Refatorar e Encapsular
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }
    
    //Construtor
    public Funcionario(String cargo, String nome, Double salario,
            Treino treino) {
        this.cargo=cargo;
        this.nome=nome;
        this.salario=salario;
        this.treino=treino;
    }
    
    //Saida de dados
    @Override
    public String toString() {
        return "\nCargo: "+getCargo()+
                "\nNome: "+getNome()+
                "\nSalário: "+getSalario()+
                "\n\n--- Dados do Treino ---"+getTreino();
    }

}
