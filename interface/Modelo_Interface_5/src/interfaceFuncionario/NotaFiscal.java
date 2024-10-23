package interfaceFuncionario;

/**
 *
 * @author 364975
 */
public abstract class NotaFiscal {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public NotaFiscal(int numero) {
        this.numero = numero;
    }
}
