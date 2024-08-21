package heranca51;

public class PessoaFisica extends Cliente {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public PessoaFisica(String nome, String endereco, int idade, String cpf) {
        super(nome, endereco, idade);
        this.cpf=cpf;
    }
    
    @Override
    public String toString() {
        return "\n--- DADOS DA PESSOA FÍSICA ---"+
                "\nNome: "+getNome()+
                "\nEndereço: "+getEndereco()+
                "\nIdade: "+getIdade()+
                "\nCPF: "+getCpf();
    }
}
