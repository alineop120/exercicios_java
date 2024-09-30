package classeAbstrataProduto;

public class Fisica extends Pessoa {
    private String cpf;
    private DoCliente doCliente;
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public DoCliente getDoCliente() {
        return doCliente;
    }

    public void setDoCliente(DoCliente doCliente) {
        this.doCliente = doCliente;
    }
    
    public Fisica(String nome, Double altura, Double peso, int anoNasc, int anoAtual, String cpf, DoCliente doCliente) {
        super(nome, altura, peso, anoNasc, anoAtual);
        this.cpf =cpf;
        this.doCliente = doCliente;
    }
    
    @Override
    public Double pesoIdeal() {
        return (((altura * altura) * peso) /2);
    } 
    
    @Override
    public int idade() {
        return (anoAtual - anoNasc);
    }
    
    @Override
    public String toString() {
        return "\n\n-- Dados da Pessoa Fisica --"+
                "\nCpf: "+getCpf()+
                "\n\n-- Dados do Cliente --"+getDoCliente();
    }
    
}
