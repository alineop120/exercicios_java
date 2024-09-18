package classeAbstrataProduto;

public class Loja {
    private String cnpj;
    private String nome;

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
    
    public Loja(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "\nCnpj: "+getCnpj()+
                "\nNome: "+getNome();
    }
}
