package associacaoClubeFutebol;

public class Competicao {
    //Variaveis
    private String nome;
    private int posicao;

    //Refatorar e Encapsular
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    
    //Construtor
    public Competicao(String nome, int posicao) {
        this.nome=nome;
        this.posicao=posicao;
    }
    
    //Saida de dados
    public String toString() {
        return "\nNome: "+getNome()+
                "\nPosição: "+getPosicao();
    }
        
    
}
