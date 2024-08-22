package associacaoPadaria;

public class Cliente {
    //Variaveis
    private String cpf;
    private String nome;
    private int idade;
    private Produto produto;
    
    //Refatorar e Encapsular
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    //Construtor
    public Cliente(String cpf, String nome, int idade, Produto produto) {
        this.cpf=cpf;
        this.nome=nome;
        this.idade=idade;
        this.produto=produto;
    }
    
    //Saída de dados
    @Override
    public String toString() {
        return "\n CPF: "+getCpf()+
                "\n Nome: "+getNome()+
                "\n Idade: "+getIdade()+
                "\n\n -- Dados de Produto --"+getProduto();
    }

    
 
}
