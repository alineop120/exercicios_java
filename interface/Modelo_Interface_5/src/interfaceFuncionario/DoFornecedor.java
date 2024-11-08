package interfaceFuncionario;

public class DoFornecedor extends NotaFiscal {
    private String descricao;
    private String data;
    private Double preco;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public DoFornecedor(int numero, String descricao, String data, Double preco) {
        super(numero);
        this.descricao = descricao;
        this.data = data;
        this.preco = preco;
    }
    
    @Override
    public String toString() {
        return "\nNumero: "+getNumero()+
                "\nDescrição: "+getDescricao()+
                "\nData: "+getData()+
                "\nPreço: "+getPreco();
    }
}
