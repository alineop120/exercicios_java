package classeAbstrata_Veiculo_1;

public class DePasseio extends Veiculo {
    private String marca;
    private String descricao;
    private Montadora montadora;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }
    
    public DePasseio(String placa, int ano, String cor, Double preco, Proprietario proprietario, String marca, String descricao, Montadora montadora) {
        super(placa, ano, cor, preco, proprietario);
        this.marca = marca;
        this.descricao = descricao;
        this.montadora = montadora;
    }
    
    @Override
    public Double ipva() {
        return (preco * 0.03);
    }
    
    @Override
    public Double seguro() {
        return (preco * 0.015);
    }
    
    @Override
    public String toString() {
        return "-- Dados do Veículo de Passeio --"+
                "\nPlaca: "+getPlaca()+
                "\nAno: "+getAno()+
                "\nCor: "+getCor()+
                "\nPreço: "+getPreco()+
                "\n-- Dados do Proprietário --"+getProprietario()+
                "\nMarca: "+getMarca()+
                "\nDescrição: "+getDescricao()+
                "\n-- Dados da Montadora --"+getMontadora();
    }
}
