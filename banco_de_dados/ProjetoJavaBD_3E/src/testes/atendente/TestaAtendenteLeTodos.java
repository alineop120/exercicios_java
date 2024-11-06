package testes.atendente;

import persistencia.AtendenteDAO;


public class TestaAtendenteLeTodos {
    
    public static void main(String[] args) throws Exception {
        System.out.println(AtendenteDAO.leTodos());
    }
}
