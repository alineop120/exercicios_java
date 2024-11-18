package testes.atendente;

import persistencia.AtendenteDAO;

public class TestaAtendenteAtualizaMatricula {

    public static void main(String[] args) throws Exception {
        // atualizaMatr(int matrAntiga, int novaMatr)
        System.out.println(AtendenteDAO.atualizaMatr(4,2));
    }
}
