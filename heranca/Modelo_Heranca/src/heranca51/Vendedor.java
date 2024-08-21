package heranca51;

public class Vendedor extends Funcionario {
    private String setorVendas;
    private Double comissao;
    private Double totalVendido;

    public String getSetorVendas() {
        return setorVendas;
    }

    public void setSetorVendas(String setorVendas) {
        this.setorVendas = setorVendas;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public Double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(Double totalVendido) {
        this.totalVendido = totalVendido;
    }
    
    public Vendedor(String nome, String endereco, int matr, Double salario, String setorVendas, Double comissao, Double totalVendido) {
        super(nome, endereco, matr, salario);
        this.setorVendas=setorVendas;
        this.comissao=comissao;
        this.totalVendido=totalVendido;
    }
    
    @Override
    public String toString() {
        return "\n--- DADOS DO VENDEDOR ---"+
                "\nNome: "+getNome()+
                "\nEndereço: "+getEndereco()+
                "\nMatrícula: "+getMatr()+
                "\nSalário: "+getSalario()+
                "\nSetor de Vendas: "+getSetorVendas()+
                "\nComissão: "+getComissao()+
                "\nTotal Vendido: "+getTotalVendido();
    }
}
