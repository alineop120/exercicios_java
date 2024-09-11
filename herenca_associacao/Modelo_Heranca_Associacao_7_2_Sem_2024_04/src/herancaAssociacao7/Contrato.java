package herancaAssociacao7;

public class Contrato {
    private int numero;
    private Double valor;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public Contrato(int numero, Double valor) {
        this.numero=numero;
        this.valor= valor;
    }
    
    @Override
    public String toString() {
        return "\nNumero: "+getNumero()+
                "\nValor: "+getValor();
    }
}
