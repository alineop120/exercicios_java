package associacaoCondominio;

public class Predio {
    //Variaveis
    private int numero;
    private int numeroDeAndares;
    private Apartamento apartamento;
    private Administrador administrador;
    
    //Refatorar e Encapsular
        public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumeroDeAndares() {
        return numeroDeAndares;
    }

    public void setNumeroDeAndares(int numeroDeAndares) {
        this.numeroDeAndares = numeroDeAndares;
    }

    public Apartamento getApartamento() {
        return apartamento;
    }

    public void setApartamento(Apartamento apartamento) {
        this.apartamento = apartamento;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    
    //Construtor
    public Predio(int numero, int numeroDeAndares, Apartamento apartamento,
            Administrador administrador) {
        this.numero=numero;
        this.numeroDeAndares=numeroDeAndares;
        this.apartamento=apartamento;
        this.administrador=administrador;
    }
    
    //Saída de Dados
    @Override
    public String toString() {
        return "\nNúmero: "+getNumero()+
                "\nNúmero de Andares: "+getNumeroDeAndares()+
                "\n\n--- Dados do Apartamento ---"+getApartamento()+
                "\n\n--- Dados do Administrador ---"+getAdministrador();
    }
    
}
