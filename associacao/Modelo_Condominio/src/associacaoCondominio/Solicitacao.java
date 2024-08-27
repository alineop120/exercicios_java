package associacaoCondominio;

public class Solicitacao {
    //Variaveis
    private String descricao;
    private String dataSolicitacao;
    private String status;
    
    //Refatorar e Encapsular
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(String dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    //Construtor
    public Solicitacao(String descricao, String dataSolicitacao, String status) {
        this.descricao=descricao;
        this.dataSolicitacao=dataSolicitacao;
        this.status=status;
    }
    
    //Saída de Dados
    public String toString() {
        return "\nDescrição: "+getDescricao()+
                "\nData de Solicitação: "+getDataSolicitacao()+
                "\nStatus: "+getStatus();
    }
    
}
