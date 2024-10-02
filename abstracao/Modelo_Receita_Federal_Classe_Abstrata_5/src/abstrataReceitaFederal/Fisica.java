package abstrataReceitaFederal;

public class Fisica extends Pessoa {
    String cpf;
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public Fisica(String nome, Endereco endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }
    
    public String toString() {
        return "\n\n-- Dados da Pessoa Física --"+
                "\nNome: "+getNome()+
                "\n-- Dados do Endereço --"+getEndereco();
    }
}
