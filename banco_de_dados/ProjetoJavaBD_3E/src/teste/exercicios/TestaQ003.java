package teste.exercicios;

import persistencia.ExercicioDAO;

public class TestaQ003 {
    /*
       Faça uma consulta Atualização com a tabela Atendente que atualize a 
       matrícula.
    */

    public static void main(String[] args) throws Exception {
        // atualizaMatr(int matrAntiga, int novaMatr)
        System.out.println(ExercicioDAO.atualizaMatr(4,2));
    }
}
