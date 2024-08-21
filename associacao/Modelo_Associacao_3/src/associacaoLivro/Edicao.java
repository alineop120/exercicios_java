package associacaoLivro;

public class Edicao {
    //Variáveis
    private int numero;
    private int ano;
    private Patrocinador patrocinador;
    
    //Refatorar e Encapsular
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public Patrocinador getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(Patrocinador patrocinador) {
        this.patrocinador = patrocinador;
    }
    
    //Construtor
    public Edicao(int numero, int ano, Patrocinador patrocinador) {
        this.numero=numero;
        this.ano=ano;
        this.patrocinador=patrocinador;
    }
    
    //Saída de Dados
    @Override
    public String toString() {
        return "\nNumero: "+getNumero()+
                "\nAno: "+getAno()+
                "\n\n --- Dados de Patrocinador --- "+getPatrocinador();
    }
   
}
