package associacaoCondominio;

public class Apartamento {
    //Variaveis
    private int numero;
    private int andar;
    private Double tamanho;
    private Reserva reserva;
    private Morador morador;
    private Visita visita;
    private Solicitacao solicitacao;
    
    //Refatorar e Encapsular
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }
    
    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }

    public Visita getVisita() {
        return visita;
    }

    public void setVisita(Visita visita) {
        this.visita = visita;
    }

    public Solicitacao getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(Solicitacao solicitacao) {
        this.solicitacao = solicitacao;
    }    
    
    //Construtor
    public Apartamento(int numero, int andar, Double tamanho,  Reserva reserva,
            Morador morador, Visita visita, Solicitacao solicitacao) {
        this.numero=numero;
        this.andar=andar;
        this.tamanho=tamanho;
        this.reserva=reserva;
        this.morador=morador;
        this.visita=visita;
        this.solicitacao=solicitacao;
    }
    
    //Saída de Dados
    public String toString() {
        return "\nNúmero: "+getNumero()+
                "\nAndar: "+getAndar()+
                "\nTamanho: "+getTamanho()+
                "\n\n--- Dados de Reserva ---"+getReserva()+
                "\n\n--- Dados do Morador ---"+getMorador()+
                "\n\n--- Dados da Visita ---"+getVisita()+
                "\n\n--- Dados da Solicitação ---"+getSolicitacao();
    }

}
