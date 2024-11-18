package testes.atendente;

import persistencia.AtendenteDAO;

public class TestaAtendenteAtualizaMatrNome {

    public static void main(String[] args) throws Exception {
        // atualizaMatr_e_Nome(int matrAntiga, int novaMatr, String novoNome)
        System.out.println(AtendenteDAO.atualizaMatr_e_Nome(33, 3, "Paula"));
    }
    
}
