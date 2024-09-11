package modelo_Farmacia;

public class Receita {
    private String data;
    private Double valor;
    private Medicamento medicamento;
    private Farmaceutico farmaceutico;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    
    public Farmaceutico getFarmaceutico() {
        return farmaceutico;
    }

    public void setFarmaceutico(Farmaceutico farmaceutico) {
        this.farmaceutico = farmaceutico;
    }
    
    public Receita(String data, Double valor, Medicamento medicamento, 
            Farmaceutico farmaceutico) {
        this.data=data;
        this.valor=valor;
        this.medicamento=medicamento;
        this.farmaceutico=farmaceutico;
    }

    @Override
    public String toString() {
        return "\nData: "+getData()+
                "\nValor: "+getValor()+
                "\n\n-- Dados do Medicamento --"+getMedicamento();
    }
}
