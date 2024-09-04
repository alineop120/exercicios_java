/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancaAssociacaoFuncionario;

/**
 *
 * @author 364975
 */
public class Terceirizado extends Funcionario{
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public Terceirizado(double salario, OrgaoPublico orgaopublico, String nome, 
            Formacao formacao, Endereco endereco, String cargo) {
        super(salario, orgaopublico, nome, formacao, endereco);
        this.cargo=cargo;
    }
    
    @Override
    public String toString() {
        return "\n\n--- Dados do Funcionario Terceirizado ---"+
                "\nSalario: "+getSalario()+
                "\n--- Dados do Orgao Publico ---"+getOrgaopublico()+
                "\nNome: "+getNome()+
                "\n--- Dados da Formação ---"+getFormacao()+
                "\n--- Dados do Endereco ---"+getEndereco()+
                "\nCargo: "+getCargo();
    }
}
