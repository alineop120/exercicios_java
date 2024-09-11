package herancaAssociacao7;

public class DeCalcados extends Loja {
    private String tipoProduto;
    private Cliente cliente;

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public DeCalcados(int numero, String descricao, Atendente atendente,
            String tipoProduto, Cliente cliente) {
        super(numero, descricao, atendente);
        this.tipoProduto=tipoProduto;
        this.cliente=cliente;
    }
    
    @Override
    public String toString() {
        return "\nNumero: "+getNumero()+
                "\nDescricao: "+getDescricao()+
                "\n\n-- Dados do Atendente --"+getAtendente()+
                "\nTipo do produto: "+getTipoProduto()+
                "\n\n-- Dados do Cliente --"+getCliente();
    }
    
}
