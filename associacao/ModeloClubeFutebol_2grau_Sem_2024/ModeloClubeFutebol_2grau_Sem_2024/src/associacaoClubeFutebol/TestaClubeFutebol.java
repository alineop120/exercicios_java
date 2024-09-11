package associacaoClubeFutebol;

import associacaoClubeFutebol.Treino;

public class TestaClubeFutebol {

    public static void main(String[] args) {
        Diretoria D = new Diretoria("Diretoria", 
                new Funcionario("Gerente", "Adilson", 2500.0,
                    new Treino("Futebol")), 
                new ComissaoTecnica("Comissão Técnica", "50 membros", 
                        new Treino("Futebol"),
                        new Elenco("Time", "5ª", 4000.0, 
                                new Treino("Futebol"), 
                                new Competicao("2ª",4)), 
                        new Olheiro("Fábio"), 
                        new Calendario("Time4", "Gol Mais")),
                new Receita(50000.0, 12346789.0));
        System.out.println(D);
    }
    
}
