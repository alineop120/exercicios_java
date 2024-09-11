package modelo_Farmacia;

public class Pedido {
    private int numero;
    private Double valor;
    private Atendente atendente;
    private Perfumaria perfumaria;

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

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }
    
    public Perfumaria getPerfumaria() {
        return perfumaria;
    }

    public void setPerfumaria(Perfumaria perfumaria) {
        this.perfumaria = perfumaria;
    }
    
    public Pedido(int numero, Double valor, Atendente atendente, 
            Perfumaria perfumaria) {
        this.numero=numero;
        this.valor=valor;
        this.atendente=atendente;
        this.perfumaria=perfumaria;

    }
    
    @Override
    public String toString() {
        return "\nNúmero: "+getNumero()+
                "\nValor: "+getValor()+
                "\n\n-- Dados do Atendente --"+getAtendente()+
                "\n\n-- Dados do Perfumaria --"+getPerfumaria();
    }

   
}
