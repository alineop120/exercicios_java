package classeAbstrataProduto;

public abstract class NotaFiscal {
    private int numero;
    private String data;
    protected Double valorInicial;
    
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

    public Double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(Double valorInicial) {
        this.valorInicial = valorInicial;
    }
    
    public NotaFiscal(int numero, String data, Double valorInicial) {
        this.numero = numero;
        this.data = data;
        this.valorInicial = valorInicial;
    }
    
    @Override
    public abstract String toString(); 
    public abstract Double valorFinal();

}
