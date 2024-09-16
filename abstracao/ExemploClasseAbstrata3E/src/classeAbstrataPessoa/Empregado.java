package classeAbstrataPessoa;

public class Empregado extends Pessoa{
    //Atributos
    private String matr;
    private String setor;

    //Refatorar => Encapsular Campos
    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    //Construtor
    public Empregado(String nome, double gratificacao, double salario,
            Filiacao filiacao, String matr, String setor) {
        super(nome, gratificacao, salario, filiacao);
        this.matr = matr;
        this.setor = setor;
    }
    
    //Metodos Abstrato da super classe Pessoa
    @Override
    public double salarioFinal(){
        return (salario + (salario * 0.1) + gratificacao);
    }
    
    @Override
    public String toString() {
        return "\n\n-- Dados da Pessoa: Empregado --"+
                "\nNome: "+getNome()+
                "\n\n-- Dados da Filação --"+getFiliacao()+
                "\n\nMatrícula: "+getMatr()+
                "\nSalário: "+getSalario()+
                "\nGrafificação: "+getGratificacao()+
                "\nSetor: "+getSetor()+
                "\nValor Final do Sálario: "+salarioFinal();
    }
}
