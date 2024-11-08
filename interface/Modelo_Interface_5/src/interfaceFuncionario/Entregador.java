package interfaceFuncionario;

public class Entregador extends Funcionario implements PercentInss, Pagamento {
    private String veiculoUtilizado;
    private Medicamento medicamento;
    
    public String getVeiculoUtilizado() {
        return veiculoUtilizado;
    }

    public void setVeiculoUtilizado(String veiculoUtilizado) {
        this.veiculoUtilizado = veiculoUtilizado;
    }
    
    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    
    public Entregador(String matr, String nome, Double salario, Endereco endereco, String veiculoUtilizado, Medicamento medicamento) {
        super(matr, nome, salario, endereco);
        this.veiculoUtilizado = veiculoUtilizado;
        this.medicamento = medicamento;
    }
    
    @Override
    public Double inss() {
        return (salario  *  PERCENTREGADOR);
    }
    
    @Override
    public Double salarioFinal() {
        return (salario - (salario * PERCENTREGADOR));
    }
    
    @Override
    public String toString() {
        return "-- Dados do Funcionario: Entregador --"+
                "\nMatricula: "+getMatr()+
                "\nNome: "+getNome()+
                "\nVeiculo Utilizado: "+getVeiculoUtilizado()+
                "\nSalario: "+getSalario()+
                "\nPercentual do Vendedor: "+PERCENTREGADOR+
                "\nINSS: "+inss()+
                "\nSalario Final: "+salarioFinal()+
                "\n\n-- Dados do Endereço do Entregador --"+getEndereco()+
                "\n\n-- Dados do Medicamento do Entregador --"+getMedicamento();
    }
}
