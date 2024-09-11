package herancaAssociacao7;

public class Locatario {
    private String codigo;
    private String nome;
    private Contrato contrato;
    private Endereco endereco;

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

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
    
    public Locatario(String codigo, String nome, Contrato contrato) {
        this.codigo=codigo;
        this.nome=nome;
        this.contrato=contrato;
    }
    
    @Override
    public String toString() {
        return "\nCodigo: "+getCodigo()+
                "\nNome: "+getNome()+
                "\n\n--- Dados do Contrato ---"+getContrato();
    }   
    
}
