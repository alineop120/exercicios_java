package associacaoClubeFutebol;

public class Elenco {
    //Variaveis
    private String nome;
    private String posicao;
    private Double salario;
    private Treino treino;
    private Competicao competicao;

    //Refatorar e Encapsular
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }

    public Competicao getCompeticao() {
        return competicao;
    }

    public void setCompeticao(Competicao competicao) {
        this.competicao = competicao;
    }
    
    //Contrutor
    public Elenco(String nome, String posicao, Double salario, Treino treino, 
            Competicao competicao) {
        this.nome=nome;
        this.posicao=posicao;
        this.salario=salario;
        this.treino=treino;
        this.competicao=competicao;
    }
    
    //Saida de dados
    @Override
    public String toString() {
        return "\nNome: "+getNome()+
                "\nPosição: "+getPosicao()+
                "\nSalário: "+getSalario()+
                "\n\n-- Dados do Treino --"+getTreino()+
                "\n\n-- Dados da Competição --"+getCompeticao();
    }
}
