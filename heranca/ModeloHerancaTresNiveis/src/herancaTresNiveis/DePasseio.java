package herancaTresNiveis;

public class DePasseio extends Veiculo {
    private int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public DePasseio(String chassi, String modelo, int ano) {
        super(chassi, modelo);
        this.ano=ano;
    }
}
