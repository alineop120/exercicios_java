package associacaoClubeFutebol;

import associacaoClubeFutebol.Funcionario;
import associacaoClubeFutebol.Receita;

public class Diretoria {
    //variaveis
    private String nome;
    private Funcionario funcionario;
    private ComissaoTecnica comissaoTecnica;
    private Receita receita;

    //Refatorar e Encapsular
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ComissaoTecnica getComissaoTecnica() {
        return comissaoTecnica;
    }

    public void setComissaoTecnica(ComissaoTecnica comissaoTecnica) {
        this.comissaoTecnica = comissaoTecnica;
    }

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }
    
    //Construtor
    public Diretoria(String nome, Funcionario funcionario, 
            ComissaoTecnica comissaoTecnica, Receita receita) {
        this.nome=nome;
        this.funcionario=funcionario;
        this.comissaoTecnica=comissaoTecnica;
        this.receita=receita;
    }
    
    //Saida de Dados
    @Override
    public String toString() {
        return "-- Dados da Diretoria --"+
                "\nNome: "+getNome()+
                "\n\n--- Dados do Funcionário ---"+getFuncionario()+
                "\n\n--- Dados da Comissão Técnica ---"+getComissaoTecnica()+
                "\n\n--- Dados da Receita ---"+getReceita();
    }
    
    
}
