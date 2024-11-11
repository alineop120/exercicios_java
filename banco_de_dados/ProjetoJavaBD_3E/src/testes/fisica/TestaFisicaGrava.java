package testes.fisica;

import modelo.Atendente;
import modelo.Fisica;
import persistencia.FisicaDAO;

public class TestaFisicaGrava {

    public static void main(String[] args) throws Exception {
        Fisica fisica = new Fisica();
        fisica.setCpf("55555555555");
        fisica.setNome("Helio");
        fisica.setIdade(7);
        
        Atendente atendente = new Atendente();
        atendente.setMatr(2);
        
        fisica.setAtendente(atendente);
        
        System.out.println(FisicaDAO.grava(fisica));
    }
    
}
