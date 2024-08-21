package herancaPessoa;

public class Pessoa {
    //Variaveis
    private String nome, cpf;

    public String getNome() {
        return nome;
    }
    
    //Refatorar e Encapsular
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    //Construtor
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
}
