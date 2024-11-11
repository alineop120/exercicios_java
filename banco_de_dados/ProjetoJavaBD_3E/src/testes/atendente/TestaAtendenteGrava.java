package testes.atendente;

import modelo.Atendente;

import persistencia.AtendenteDAO;

public class TestaAtendenteGrava {

    public static void main(String[] args) throws Exception {
        Atendente atendente = new Atendente();
        atendente.setMatr(33);
        atendente.setNome("Amaroneide");
        
        System.out.println(AtendenteDAO.grava(atendente));
    }
    
}
