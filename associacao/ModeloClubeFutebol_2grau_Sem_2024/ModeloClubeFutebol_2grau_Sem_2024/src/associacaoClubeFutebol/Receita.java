package associacaoClubeFutebol;

public class Receita {
    //Variaveis
    private Double transferencia;
    private Double contrato;

    //Refatorar e Encapsular
    public Double getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(Double transferencia) {
        this.transferencia = transferencia;
    }

    public Double getContrato() {
        return contrato;
    }

    public void setContrato(Double contrato) {
        this.contrato = contrato;
    }
    
    //Construtor
    public Receita(Double transferencia, Double contrato) {
        this.transferencia=transferencia;
        this.contrato=contrato;
    }
    
    public String toString() {
        return "\nTransferência: "+getTransferencia()+
                "\nContrato: "+getContrato();
    }
}
