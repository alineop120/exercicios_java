package abstrataReceitaFederal;

public class ParaPessoaJuridica extends DeclaracaoImposto{
    private String observacao;

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public ParaPessoaJuridica(int numero, int ano, Double valorDeclarado, Deducao deducao, Pagamento pagamento, Bens bens, String observacao){
        super(numero, ano, valorDeclarado, deducao, pagamento, bens);
        this.observacao=observacao;
    }
    
    public static Double calculaParcial(){
        return (valorDeclarado + (Bens.valor * 2) + Bens.calculaTarifacao());
    }
    
    public static Double calculaImpostoPessoaJuridica(){
        return (ParaPessoaFisica.calculaParcial() - Deducao.calculaDeducao() + Pagamento.valor + valorDeclarado);
    }
     
    @Override
    public String toString(){
        return "\n\n-- Dados da Declaracao de Imposto para Pessoa Juridica --"+
                "\nNúmero:" + getNumero()+
                "\nAno:" + getAno()+
                "\nValor Declarado:" + getValorDeclarado()+
                "\nDedução:" + getDeducao()+
                "\nPagamento:" + getPagamento()+
                "\nBens:" + getBens()+
                "\nObservação:" + getObservacao();
     }
}