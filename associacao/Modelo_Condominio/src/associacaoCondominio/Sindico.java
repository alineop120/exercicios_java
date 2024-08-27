package associacaoCondominio;

public class Sindico {
    //Variaveis
    private String nome;
    private String cpf;
    private String mandato;
    
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

    public String getMandato() {
        return mandato;
    }

    public void setMandato(String mandato) {
        this.mandato = mandato;
    }
    
    //Construtor
    public Sindico(String nome, String cpf, String mandato) {
        this.nome=nome;
        this.cpf=cpf;
        this.mandato=mandato;
    }
    
    //Saída de Dados
    @Override
    public String toString() {
        return "\nNome: "+getNome()+
                "\nCPF: "+getCpf()+
                "\nMandato: "+getMandato();
    }
    
}
