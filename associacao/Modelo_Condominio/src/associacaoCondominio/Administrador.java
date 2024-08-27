package associacaoCondominio;

public class Administrador {
    //Variaveis
    private String nome;
    private String cpf;
    private String cargo;
    
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    //Construtor
    public Administrador(String nome, String cpf, String cargo) {
        this.nome=nome;
        this.cpf=cpf;
        this.cargo=cargo;
    }
    
    //Saída de Dados
    @Override
    public String toString() {
        return "\nNome: "+getNome()+
                "\nCPF: "+getCpf()+
                "\nCargo: "+getCargo();
    }
    
}
