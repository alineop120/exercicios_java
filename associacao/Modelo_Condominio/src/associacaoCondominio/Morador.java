package associacaoCondominio;

public class Morador {
    //Variaveis
    private String nome;
    private String cpf;
    private String dataNascimento;
    
    //Refatorar e Encapsular
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    //Construtor
    public Morador(String nome, String cpf, String dataNascimento) {
        this.nome=nome;
        this.cpf=cpf;
        this.dataNascimento=dataNascimento;
    }
    
    //Saída de Dados
    @Override
    public String toString() {
        return "\nNome: "+getNome()+
                "\nCPF: "+getCpf()+
                "\nData de Nascimento: "+getDataNascimento();
    }
    
}
