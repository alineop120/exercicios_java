package modelo_Farmacia;

public class Cliente {
    private String cpf;
    private String nome;
    private String dataNasc;
    private Pedido pedido;
    private Receita receita;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }
    
    public Cliente(String cpf, String nome, String dataNasc, Pedido pedido, Receita receita) {
        this.cpf=cpf;
        this.nome=nome;
        this.dataNasc=dataNasc;
        this.pedido=pedido;
        this.receita=receita;
    }
    
    @Override
    public String toString() {
        return "\nCPF: "+getCpf()+
                "\nNome: "+getNome()+
                "\nData de Nascimneto: "+getDataNasc()+
                "\n\n-- Dados do Pedido --"+getPedido()+
                "\n\n-- Dados da Receita --"+getReceita();
    }

    
}
