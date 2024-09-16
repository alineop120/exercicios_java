package classeAbstrataPessoa;

public class Filiacao {
    //Atribudos
    private String nomePai;
    private String nomeMae;

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
    
    //Construtor
    public Filiacao(String nomePai, String nomeMae) {
        this.nomePai=nomePai;
        this.nomeMae=nomeMae;
    }
    
    @Override
    public String toString() {
        return "\nNome do Pai: "+getNomePai()+
                "\nNome da Mãe: "+getNomeMae();
    }
}
