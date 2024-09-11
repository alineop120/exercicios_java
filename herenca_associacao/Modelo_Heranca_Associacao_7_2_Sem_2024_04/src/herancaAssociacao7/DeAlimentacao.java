package herancaAssociacao7;

public class DeAlimentacao extends Loja {
    private String pais;
    private Cliente cliente;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }   
    
    public DeAlimentacao(int numero, String descricao, Atendente atendente,
            String pais, Cliente cliente) {
        super(numero, descricao, atendente);
        this.pais=pais;
        this.cliente=cliente;
    }
    
    @Override
    public String toString() {
        return "\nNumero: "+getNumero()+
                "\nDescrição: "+getDescricao()+
                "\n\n-- Dados do Atendente --"+getAtendente()+
                "\nPais: "+getPais()+
                "\n\n-- Dados do Cliente --"+getCliente();
    }

    
}
