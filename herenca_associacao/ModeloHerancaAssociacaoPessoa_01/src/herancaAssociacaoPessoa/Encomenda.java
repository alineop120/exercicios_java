package herancaAssociacaoPessoa;

public class Encomenda {
    private String descricao;
    private String dataEntrega;
    private Double valor;
    private Material material;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
    
    public Encomenda(String descricao, String dataEntrega, Double valor, Material material) {
        this.descricao=descricao;
        this.dataEntrega=dataEntrega;
        this.valor=valor;
        this.material=material;
    }
    
    @Override
    public String toString() {
        return "\nDescrição: "+getDescricao()+
                "\nData de Entrega: "+getDataEntrega()+
                "\nValor: "+getValor()+
                "\n\n--- Dados do Material ---"+getMaterial();
    }
}
