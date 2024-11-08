package interfaceFuncionario;

public class Vendedor extends Funcionario implements PercentInss, Pagamento {
    private int idade;
    private Medicamento medicamento;
    private Cliente cliente;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Vendedor(String matr, String nome, Double salario, Endereco endereco, int idade, Medicamento medicamento, Cliente cliente) {
        super(matr, nome, salario, endereco);
        this.idade = idade;
        this.medicamento = medicamento;
        this.cliente = cliente;
    }
    
    @Override
    public Double inss() {
        return (salario  *  PERCVENDEDOR);
    }
    
    public Double comissao() {
        return (DoCliente.preco * PERCVENDEDOR);
    }
        
    @Override
    public Double salarioFinal() {
        return (salario + comissao() - (salario * PERCVENDEDOR));
    }
    
    @Override
    public String toString() {
        return "-- Dados do Funcionario: Vendedor --"+
               "\nMatricula: "+getMatr()+
               "\nNome: "+getNome()+
                "\nIdade: "+getIdade()+
                "\nSalario: "+getSalario()+
                "\nPercentual do Vendedor: "+PERCVENDEDOR+
                "\nINSS: "+inss()+
                "\nPreço do Cliente: "+DoCliente.preco+
                "\nComissão: "+comissao()+
                "\nSalario Final: "+salarioFinal()+
                "\n\n-- Dados do Endereço do Vendedor --"+getEndereco()+
                "\n\n-- Dados do Medicamneto do Vendedor --"+getMedicamento()+
                "\n\n-- Dados do Cliente --"+getCliente();
    }
}
