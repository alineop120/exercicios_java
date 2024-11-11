package testes.fisica;

import modelo.Atendente;
import modelo.Fisica;
import persistencia.FisicaDAO;

public class TestaFisicaAltera {

    public static void main(String[] args) throws Exception {
        Fisica fisica = new Fisica();
        fisica.setNome("Glaubio");
        fisica.setIdade(70);
        
        Atendente atendente = new Atendente();
        atendente.setMatr(2);
        
        fisica.setAtendente(atendente);
        fisica.setCpf("55555555555");
        
        System.out.println(FisicaDAO.altera(fisica));
    }
    
}
