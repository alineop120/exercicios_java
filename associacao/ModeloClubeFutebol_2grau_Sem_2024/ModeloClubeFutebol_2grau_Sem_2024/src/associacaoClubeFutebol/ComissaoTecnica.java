package associacaoClubeFutebol;

public class ComissaoTecnica {
    //Variaveis
    private String nome;
    private String qtdeMembros;
    private Treino treino;
    private Elenco elenco;
    private Olheiro olheiro;
    private Calendario calendario;

    //Refatorar e Encapsular
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQtdeMembros() {
        return qtdeMembros;
    }

    public void setQtdeMembros(String qtdeMembros) {
        this.qtdeMembros = qtdeMembros;
    }
    
    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }

    public Elenco getElenco() {
        return elenco;
    }

    public void setElenco(Elenco elenco) {
        this.elenco = elenco;
    }

    public Olheiro getOlheiro() {
        return olheiro;
    }

    public void setOlheiro(Olheiro olheiro) {
        this.olheiro = olheiro;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }
    
    //Contrutor
    public ComissaoTecnica(String nome, String qtdeMembros, Treino treino,
            Elenco elenco, Olheiro olheiro, Calendario calendario) {
        this.nome=nome;
        this.qtdeMembros=qtdeMembros;
        this.treino=treino;
        this.elenco=elenco;
        this.olheiro=olheiro;
        this.calendario=calendario;
    }
    
    public String toString() {
        return "\nNome: "+getNome()+
                "\nQuantidade de Membros: "+getQtdeMembros()+
                "\n\n--- Dados do Treino ---"+getTreino()+
                "\n\n--- Dados do Elenco ---"+getElenco()+
                "\n\n--- Dados de Olheiro ---"+getOlheiro()+
                "\n\n--- Dados do Calendário ---"+getCalendario();
    }
    
}
