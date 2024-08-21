package associacaoLivro;

public class Editora {
    //Variaveis
    private String codigo;
    private String nome;
    private Endereco endereco;

    //Refatoração e Encapsulação
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    //Construtor
    public Editora(String codigo, String nome, Endereco endereco) {
        this.codigo=codigo;
        this.nome=nome;
        this.endereco=endereco;
    }
    
    //Saída de Dados
    @Override
    public String toString() {
        return "\nCodigo: "+getCodigo()+
                "\nNome: "+getNome()+
                "\n\n --- Dados de Endereço ---"+getEndereco();
    }

}
