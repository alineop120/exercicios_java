package associacaoCondominio;

public class Condominio {
    //Variaveis
    private String nome;
    private String dataFundacao;
    private Predio predio;
    private Sindico sindico;
    
    //Refatorar e Encapsular
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(String dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Predio getPredio() {
        return predio;
    }

    public void setPredio(Predio predio) {
        this.predio = predio;
    }

    public Sindico getSindico() {
        return sindico;
    }

    public void setSindico(Sindico sindico) {
        this.sindico = sindico;
    }
    
    //Construtor
    public Condominio(String nome, String dataFundacao, Predio predio,
            Sindico sindico) {
        this.nome=nome;
        this.dataFundacao=dataFundacao;
        this.predio=predio;
        this.sindico=sindico;
    }
    
    //Saída de Dados
    @Override
    public String toString() {
        return "Nome: "+getNome()+
                "\nData da Fundação: "+getDataFundacao()+
                "\n\n --- Dados do Prédio ---"+getPredio()+
                "\n\n--- Dados do Síndico ---"+getSindico();
    }
}
