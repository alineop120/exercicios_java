package associacaoCondominio;

public class Reserva {
    //Variaveis
    private String dataReserva;
    private String sala;
    private String horario;
    private Morador morador;

    //Refatorar e Encapsular
    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }    
    
    //Construtor
    public Reserva(String dataReserva, String sala, String horario, Morador morador) {
        this.dataReserva=dataReserva;
        this.sala=sala;
        this.horario=horario;
        this.morador=morador;
    }
    
    //Saída de Dados
    @Override
    public String toString() {
        return "\nData da Reserva: "+getDataReserva()+
                "\nSala: "+getSala()+
                "\nHorário: "+getHorario()+
                "\n\n-- Dados da Morador ---"+getMorador();
    }
    
}
