package herancaTresNiveis;

public class De2Rodas extends Veiculo {
    private String placa;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public De2Rodas(String chassi, String modelo, String placa) {
        super(chassi, modelo);
        this.placa=placa;
    }
    
}
