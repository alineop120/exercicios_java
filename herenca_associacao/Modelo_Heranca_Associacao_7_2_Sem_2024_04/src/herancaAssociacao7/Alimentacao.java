package herancaAssociacao7;

public class Alimentacao extends Setor {
    private int quantidadesLoja;
    private DeAlimentacao deAlimentacao;
    
    public int getQuantidadesLoja() {
        return quantidadesLoja;
    }

    public void setQuantidadesLoja(int quantidadesLoja) {
        this.quantidadesLoja = quantidadesLoja;
    }

    public DeAlimentacao getDeAlimentacao() {
        return deAlimentacao;
    }

    public void setDeAlimentacao(DeAlimentacao deAlimentacao) {
        this.deAlimentacao = deAlimentacao;
    }
    
    public Alimentacao(int numero, int quantidadesLoja,
            DeAlimentacao deAlimentacao) {
        super(numero);
        this.quantidadesLoja=quantidadesLoja;
        this.deAlimentacao=deAlimentacao;
        
    }

    @Override
    public String toString() {
        return "\nNumero: "+getNumero()+
                "\n Quantidades de Lojas: "+getQuantidadesLoja()+
                "\n\n-- Dados de Alimentação --"+getDeAlimentacao();
    }
    
    
    
}
