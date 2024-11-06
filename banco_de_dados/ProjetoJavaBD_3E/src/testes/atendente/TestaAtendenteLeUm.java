package testes.atendente;

import persistencia.AtendenteDAO;


public class TestaAtendenteLeUm {
    
    public static void main(String[] args) throws Exception {
        System.out.println(AtendenteDAO.leUm(2));
    }
}
