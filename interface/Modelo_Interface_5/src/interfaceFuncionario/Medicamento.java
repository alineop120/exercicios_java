package interfaceFuncionario;

/**
 *
 * @author 364975
 */
public class Medicamento implements PrecoVenda, Icms {
    private String codigo;
    private String nome;
    private Double precoFornecedor;

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

    public Double getPrecoFornecedor() {
        return precoFornecedor;
    }

    public void setPrecoFornecedor(Double precoFornecedor) {
        this.precoFornecedor = precoFornecedor;
    }
    
    public Medicamento(String codigo, String nome, Double precoFornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoFornecedor = precoFornecedor;
    }
    
    public Double calculaIcms(){
        return (getPrecoFornecedor() * ALIQUOTA);
    }

    public String toString() {
        
    }
}
