package abstrataReceitaFederal;

public class Deducao {
    private int codigo;
    private String nome;
    protected static Double valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public Deducao(int codigo, String nome, Double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }
    
    public static Double calculaDeducao() {
        return(valor * 0.012);
    }
    
    @Override
    public String toString() {
        return "\nCodigo: "+getCodigo()+
                "\nNome: "+getNome()+
                "\nValor: "+getValor();
    }
}
