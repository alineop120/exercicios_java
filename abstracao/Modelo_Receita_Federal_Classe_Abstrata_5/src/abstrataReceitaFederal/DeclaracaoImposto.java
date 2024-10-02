package abstrataReceitaFederal;

public abstract class DeclaracaoImposto {
    private int numero;
    private int ano;
    protected static Double valorDeclarado;
    private Deducao deducao;
    private Pagamento pagamento;
    private Bens bens;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(Double valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    public Deducao getDeducao() {
        return deducao;
    }

    public void setDeducao(Deducao deducao) {
        this.deducao = deducao;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Bens getBens() {
        return bens;
    }

    public void setBens(Bens bens) {
        this.bens = bens;
    }
    
    public DeclaracaoImposto(int numero, int ano, Double valorDeclarado, Deducao deducao, Pagamento pagamento, Bens bens) {
        this.numero = numero;
        this.ano = ano;
        this.valorDeclarado = valorDeclarado;
        this.deducao = deducao;
        this.pagamento = pagamento;
        this.bens = bens;
    }
}
