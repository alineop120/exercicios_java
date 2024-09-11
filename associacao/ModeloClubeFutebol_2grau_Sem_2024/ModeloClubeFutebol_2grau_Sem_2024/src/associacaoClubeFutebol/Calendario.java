package associacaoClubeFutebol;

public class Calendario {
    //Variaveis
    private String adversario;
    private String estadio;

    //Refatorar e Encapsular
    public String getAdversario() {
        return adversario;
    }

    public void setAdversario(String adversario) {
        this.adversario = adversario;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
    
    //Construtor
    public Calendario(String adversario, String estadio) {
        this.adversario=adversario;
        this.estadio=estadio;
    }
    
    @Override
    public String toString() {
        return "\nAdversário: "+getAdversario()+
                "\nEstádio: "+getEstadio();
    }
}
