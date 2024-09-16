package classeAbstrata_Veiculo_1;

public class Onibus extends Veiculo {
    private int qtdePassageiros;
    private Montadora montadora;

    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }
    
    public Onibus(String placa, int ano, String cor, Double preco, Proprietario proprietario, int qtdePassageiros, Montadora montadora) {
        super(placa, ano, cor, preco, proprietario);
        this.qtdePassageiros = qtdePassageiros;
        this.montadora = montadora;
    }
    
    @Override
    public Double ipva() {
        return (preco * 0.05);
    }
    
    @Override
    public Double seguro() {
        return (preco * 0.025);
    }
    
    @Override
    public String toString() {
        return "-- Dados do Veículo: Onibus --"+
                "\nPlaca: "+getPlaca()+
                "\nAno: "+getAno()+
                "\nCor: "+getCor()+
                "\nPreço: "+getPreco()+
                "\n-- Dados do Proprietário --"+getProprietario()+
                "\nQtde de Passageiros: "+getQtdePassageiros()+
                "\n-- Dados da Montadora --"+getMontadora();
    }
}
