package classeAbstrataProduto;

public class Loja {
    private String cnpj;
    private String nome;
    private Geladeira geladeira;
    private Fogao fogao;
    private MaquinaLavar maquinaLavar;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Geladeira getGeladeira() {
        return geladeira;
    }

    public void setGeladeira(Geladeira geladeira) {
        this.geladeira = geladeira;
    }

    public Fogao getFogao() {
        return fogao;
    }

    public void setFogao(Fogao fogao) {
        this.fogao = fogao;
    }

    public MaquinaLavar getMaquinaLavar() {
        return maquinaLavar;
    }

    public void setMaquinaLavar(MaquinaLavar maquinaLavar) {
        this.maquinaLavar = maquinaLavar;
    }
    
    public Loja(String cnpj, String nome, Geladeira geladeira, Fogao fogao, MaquinaLavar maquinaLavar) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.geladeira = geladeira;
        this.fogao = fogao;
        this.maquinaLavar = maquinaLavar;
    }
    
    @Override
    public String toString() {
        return "\nCnpj: "+getCnpj()+
                "\nNome: "+getNome()+
                "\n\n-- Dados da Geladeira --"+getGeladeira()+
                "\n\n-- Dados do Fogao --"+getFogao()+
                "\n\n-- Dados da Maquina de Lavar --"+getMaquinaLavar();
    }  
}
