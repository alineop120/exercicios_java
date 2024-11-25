package modelo;
public class Fisica extends Pessoa{
    
    private String cpf;
    private Atendente atendente;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }
    
    public Fisica(){}
    
    public Fisica(String nome,int idade,String cpf,Atendente atendente){
        super(nome,idade);
        this.cpf=cpf;
        this.atendente=atendente;
    }
    
    @Override
    public String toString(){
        return "\nCPF: " + getCpf() +
                "\nNome: " + getNome() +
                "\nIdade: " + getIdade() +
                "\n\n -- Dados do Atendente --" + getAtendente();
    }

    
}
