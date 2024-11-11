package testes.juridica;

import modelo.Atendente;
import modelo.Juridica;
import persistencia.JuridicaDAO;

public class TestaJuridicaGrava {

    public static void main(String[] args) throws Exception {
        Juridica juridica = new Juridica();
        juridica.setCnpj("909090");
        juridica.setNome("Atendente Não Vende");
        juridica.setIdade(8);
        
        Atendente atendente = new Atendente();
        atendente.setMatr(1);
        
        juridica.setAtendente(atendente);
        
        System.out.println(JuridicaDAO.grava(juridica));
    }
    
}
