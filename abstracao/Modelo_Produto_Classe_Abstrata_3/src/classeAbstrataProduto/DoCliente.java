package classeAbstrataProduto;

public class DoCliente extends NotaFiscal {
    private String nomeEmpresa;
    
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    
    public DoCliente(int numero, String data, Double valorInicial, String nomeEmpresa) {
        super(numero, data, valorInicial);
        this.nomeEmpresa = nomeEmpresa;
    }
    
    @Override
    public Double valorFinal() {
        return (valorInicial * 0.05);
    } 
    
    @Override
    public String toString() {
        return "\n\n-- Dados da Nota Fiscal do Clinete --"+
                "\nNumero: "+getNumero()+
                "\nData: "+getData()+
                "\nValor Inicial: "+getValorInicial()+
                "\nNome da Empresa: "+getNomeEmpresa();
    }

}
