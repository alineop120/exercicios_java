package modelo_Farmacia;

public class Compra {
    private int numero;
    private String data;
    private Double valor;
    private Pagamento pagamento;
    private Cliente cliente;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Compra(int numero, String data, Double valor, Pagamento pagamento,
            Cliente cliente) {
        this.numero=numero;
        this.data=data;
        this.valor=valor;
        this.pagamento=pagamento;
        this.cliente=cliente;
    }
    
    @Override
    public String toString() {
       return "\nNumero: "+getNumero()+
               "\nData: "+getData()+
               "\nValor: "+getValor()+
               "\n\n-- Dados do Pagamento --"+getPagamento()+
               "\n\n-- Dados do Cliente --"+getCliente(); 
    }
}
