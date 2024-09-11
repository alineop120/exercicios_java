package herancaAssociacao7;

public class DeUtilidades {
    private int quantidadeProduto;
    private Cliente cliente;
    private Box box;
    

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public DeUtilidades(int quantidadeProduto, Cliente cliente, Box box) {
        this.quantidadeProduto=quantidadeProduto;
        this.cliente=cliente;
        this.box=box;
    }

    @Override
    public String toString() {
        return "\nQuantidade dos produtos: "+getQuantidadeProduto()+
                "\n\n-- Dados do Cliente --"+getCliente()+
                "\n\n-- Dados do Box --"+getBox();
    }
   
}
