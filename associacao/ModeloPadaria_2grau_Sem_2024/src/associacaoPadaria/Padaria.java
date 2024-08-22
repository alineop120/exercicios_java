package associacaoPadaria;

public class Padaria {
    //Variaveis
    private String cnpj;
    private String nome;
    private String telefone;
    private Cliente cliente;
    private Endereco endereco;
    
    //Refatorar e Encapsular
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    //Construtor
    public Padaria(String cnpj, String nome, String telefone, Cliente cliente, 
            Endereco endereco) {
        this.cnpj=cnpj;
        this.nome=nome;
        this.telefone=telefone;
        this.cliente=cliente;
        this.endereco=endereco;
    }

    //Saída de dados
    public String toString() {
        return "\n CNPJ: "+getCnpj()+
                "\n Nome: "+getNome()+
                "\n Telefone: "+getTelefone()+
                "\n\n -- Dados do Cliente --"+getCliente()+
                "\n\n -- Dados do Endereço --"+getEndereco();
    }
    
}
