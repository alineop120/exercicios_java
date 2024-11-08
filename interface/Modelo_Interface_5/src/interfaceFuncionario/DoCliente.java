package interfaceFuncionario;

/**
 *
 * @author 364975
 */
public class DoCliente extends NotaFiscal {
    private String descricao;
    protected static Double preco;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        DoCliente.preco = preco;
    }
    
    public DoCliente(int numero, String descricao, Double preco) {
        super(numero);
        this.descricao = descricao;
        DoCliente.preco = preco;
    }
    
    @Override
    public String toString() {
        return "\nNumero: "+getNumero()+
                "\nDescrição: "+getDescricao()+
                "\nPreço: "+getPreco();
    }
}
