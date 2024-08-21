package associacaoVeiculo;
public class Roda {

    private int aro;
    private int qtdParafusos;

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public int getQtdParafusos() {
        return qtdParafusos;
    }

    public void setQtdParafusos(int qtdParafusos) {
        this.qtdParafusos = qtdParafusos;
    }

public Roda(int aro,int qtdParafusos){
    this.aro=aro;
    this.qtdParafusos=qtdParafusos;
}

    @Override
    public String toString(){
    return "\n Aro:" + getAro() +
            "\n Quantidade de Parafusos:" + getQtdParafusos();
}
}
