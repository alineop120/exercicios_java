/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca51;

/**
 *
 * @author 364975
 */
public class Diretor extends Funcionario {
    private Double gratificacao;

    public Double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(Double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public Diretor(String nome, String endereco, int matr, Double salario, Double gratificacao) {
        super(nome, endereco, matr, salario);
        this.gratificacao=gratificacao;
    }
    
    @Override
    public String toString() {
        return "\n--- DADOS DO DIRETOR ---"+
                "\nNome: "+getNome()+
                "\nEndereço: "+getEndereco()+
                "\nMatrícula: "+getMatr()+
                "\nSalário: "+getSalario()+
                "\nGratificação: "+getGratificacao();
    }
}
