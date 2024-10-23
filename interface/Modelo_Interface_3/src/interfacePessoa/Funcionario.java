package interfacePessoa;

/**
 *
 * @author 364975
 */
public class Funcionario extends Pessoa implements Comissao {
    private int matr;
    private Double valorComissao;

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public Double getValorComissao() {
        return valorComissao;
    }

    public void setValorComissao(Double valorComissao) {
        this.valorComissao = valorComissao;
    }
    
    public Funcionario(String cpf, String nome, Endereco endereco, int matr, Double valorComissao) {
        super(cpf, nome, endereco);
        this.matr = matr;
        this.valorComissao = valorComissao;
    }
    
    @Override
    public Double calculaSalComissao() {
        return (SAL + valorComissao);
    }
    
    @Override
    public String toString() {
        return "-- Dados da Pessoa: Funcionario --"+
                "\nCPF: "+getCpf()+
                "\nNome: "+getNome()+
                "\nMatricula: "+getMatr()+
                "\nSalario: "+SAL+
                "\nValor da Comissão: "+getValorComissao()+
                "\nSalario da comissão: "+calculaSalComissao()+
                "\n\n-- Dados do Endereço da Pessoa: Funcionario --"+getEndereco();
    }
}
