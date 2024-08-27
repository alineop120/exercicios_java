
package associacaoCondominio;

public class TestaCondominio {

    public static void main(String[] args) {
        Condominio C = new Condominio("Redidencial Vista Bela", "20/03/1954",
                new Predio(1, 10,
                        new Apartamento(101, 1, 75.5,
                                new Reserva("31/08/2023", "Quadra de Esporte", "09:00",
                                        new Morador("Tônio Carlos", "564.646.451-78", "01/05/1979")),
                                new Morador("Geovana Costa", "871.215.958-03", "06/04/1990"), 
                                new Visita("Pedro Henrique", "452.665.845-14", "28/04/1995"),
                                new Solicitacao("Reparação de encanamento", "25/08/2024", "Andamente")),
                        new Administrador("Antônia da Silva", "325.454.584-08", "Adiministrador Financeiro")),
                new Sindico("Renato Queiroz", "11.222.333-44", "2023-2026"));
        
        System.out.println("--- Dados do Condomínio ---");
        System.out.println(C);
    }
    
}
