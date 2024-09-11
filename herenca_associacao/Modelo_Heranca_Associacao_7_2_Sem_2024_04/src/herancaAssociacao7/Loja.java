package herancaAssociacao7;

public class Loja {
    private int numero;
    private String descricao;
    private Atendente atendente;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }
    
    public Loja(int numero, String descricao, Atendente atendente) {
        this.numero=numero;
        this.descricao=descricao;
        this.atendente=atendente;
    }
}
