package abstrataReceitaFederal;

public class Auditoria {
    private int numero;
    private String data;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public Auditoria(int numero, String data) {
        this.numero = numero;
        this.data = data;
    }
    
    @Override
    public String toString(){
        return "\nNumero: "+getNumero()+
                "\nData: "+getData();
    }
}
