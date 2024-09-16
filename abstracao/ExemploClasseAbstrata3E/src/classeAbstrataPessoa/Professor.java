package classeAbstrataPessoa;

public class Professor extends Pessoa{
    //Atributo
    private String titulo;   
    private String areaAtuacao;

    //Refatorar => Encapsular Campos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    
    //Construtor
    public Professor(String nome, double gratificacao, double salario,
            Filiacao filiacao, String titulo, String areaAtuacao) {
        super(nome, gratificacao, salario, filiacao);
        this.titulo = titulo;
        this.areaAtuacao = areaAtuacao;        
    }
    
    //Metodos Abstrato da super classe Pessoa
    @Override
    public double salarioFinal(){
        return (salario + (salario * 0.1) + gratificacao);
    }
    
    @Override
    public String toString() {
        return "-- Dados da Pessoa: Professor --"+
                "\nNome: "+getNome()+
                "\n\n-- Dados da Filação --"+getFiliacao()+
                "\n\nÁrea de Atuação: "+getAreaAtuacao()+
                "\nSalário: "+getSalario()+
                "\nGrafificação: "+getGratificacao()+
                "\nTítulo: "+getTitulo()+
                "\nValor Final do Sálario: "+salarioFinal();
    }
}
