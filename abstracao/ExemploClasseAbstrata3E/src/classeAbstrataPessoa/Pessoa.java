package classeAbstrataPessoa;

public abstract class Pessoa {
    //Atributos
    private String nome;
    protected double gratificacao;
    protected double salario;
    private Filiacao filiacao;

    //Refatorar => Encapsular Campos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Filiacao getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }
    
    //Construtor
    public Pessoa(String nome, double gratificacao, double salario,
            Filiacao filiacao) {
        this.nome = nome;
        this.gratificacao = gratificacao;
        this.salario = salario;
        this.filiacao = filiacao;
    }
    
    //Metodos Abstratos
    public abstract double salarioFinal();
}
