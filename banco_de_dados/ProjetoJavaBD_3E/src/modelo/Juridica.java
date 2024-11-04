package modelo;
public class Juridica extends Pessoa{
    
    private String cnpj;
    private Atendente atendente;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }
    
    public Juridica(){}
    
    public Juridica(String nome,int idade,String cnpj,Atendente atendente){
        super(nome,idade);
        this.cnpj=cnpj;
        this.atendente=atendente;
    }
    
    public String toString(){
        return "\n Dados da Pessoa Jurídica:" +
                "\n CNPJ:" + getCnpj() +
                "\n Nome:" + getNome() +
                "\n Idade:" + getIdade() +
                "\n Dados do Atendente:" + getAtendente();
    }
}
