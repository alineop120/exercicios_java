package teste.exercicios;

import persistencia.ExercicioDAO;

public class TestaQ004 {
    /*
       Faça uma consulta Atualização com a tabela Atendente que atualize a 
       matrícula e nome.
    */

    public static void main(String[] args) throws Exception {
        // atualizaMatr_e_Nome(int matrAntiga, int novaMatr, String novoNome)
        System.out.println(ExercicioDAO.atualizaMatrNome(33, 3, "Paula"));
    }
    
}
