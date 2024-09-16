package classeAbstrata_Veiculo_1;

public class Moto extends Veiculo {
    private int cilidrada;

    public int getCilidrada() {
        return cilidrada;
    }

    public void setCilidrada(int cilidrada) {
        this.cilidrada = cilidrada;
    }
    
    public Moto(String placa, int ano, String cor, Double preco, Proprietario proprietario, int cilidrada) {
        super(placa, ano, cor, preco, proprietario);
        this.cilidrada = cilidrada;
    }
    
    @Override
    public Double ipva() {
        return (preco * 0.08);
    }
    
    @Override
    public Double seguro() {
        return (preco * 0.005);
    }
    
    @Override
    public String toString() {
        return "-- Dados do Veículo: Moto --"+
                "\nPlaca: "+getPlaca()+
                "\nAno: "+getAno()+
                "\nCor: "+getCor()+
                "\nPreço: "+getPreco()+
                "\n-- Dados do Proprietário --"+getProprietario()+
                "\nCilidrada: "+getCilidrada();
    }
}
