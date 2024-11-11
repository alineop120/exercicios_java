package testes.juridica;

import modelo.Atendente;
import modelo.Juridica;
import persistencia.JuridicaDAO;

public class TestaJuridicaAltera {

    public static void main(String[] args) throws Exception {
        Juridica juridica = new Juridica();
        juridica.setNome("Atacadão Vende Demais");
        juridica.setIdade(80);
        
        Atendente atendente = new Atendente();
        atendente.setMatr(2);
        
        juridica.setAtendente(atendente);
        juridica.setCnpj("909090");
        
        System.out.println(JuridicaDAO.altera(juridica));
    }
    
}
