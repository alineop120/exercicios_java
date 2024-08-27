package associacaoCondominio;

public class Visita {
    //Variaveis
    private String nome;
    private String dataVisita;
    private String motivo;
    
    //Refatorar e Encapsular
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataVisita() {
        return dataVisita;
    }

    public void setDataVista(String dataVista) {
        this.dataVisita = dataVista;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    //Construtor
    public Visita(String nome, String dataVisita, String motivo) {
        this.nome=nome;
        this.dataVisita=dataVisita;
        this.motivo=motivo;
    }

    //Saída de Dados
    @Override
    public String toString() {
        return "\nNome: "+getNome()+
                "\nData de Visita: "+getDataVisita()+
                "\nMotivo: "+getMotivo();
    }
    
}
