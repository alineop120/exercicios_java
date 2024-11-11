package testes.atendente;

import persistencia.AtendenteDAO;

public class TestaAtendenteAltera {

    public static void main(String[] args) throws Exception {
        System.out.println(AtendenteDAO.altera("Francinete", 33));
    }
    
}
