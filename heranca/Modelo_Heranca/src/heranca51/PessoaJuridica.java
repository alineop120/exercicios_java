package heranca51;

public class PessoaJuridica extends Cliente {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public PessoaJuridica(String nome, String endereco, int idade, String cnpj) {
        super(nome, endereco, idade);
        this.cnpj=cnpj;
    }
    
    @Override
    public String toString() {
        return "\n--- DADOS DA PESSOA JURÍDICA ---"+
                "\nNome: "+getNome()+
                "\nEndereço: "+getEndereco()+
                "\nIdade: "+getIdade()+
                "\nCNPF: "+getCnpj();
    }
    
}
