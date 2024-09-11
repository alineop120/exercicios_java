package associacaoClubeFutebol;

public class Olheiro {
    //Variaveis
    private String nome;

    //Refatorar e Encapsular
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //Contrutor
    public Olheiro(String nome) {
        this.nome=nome;
    }
    
    @Override
    public String toString() {
        return "\nNome: "+getNome();
    }
}
