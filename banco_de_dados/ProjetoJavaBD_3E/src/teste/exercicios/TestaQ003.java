package teste.exercicios;

import persistencia.ExercicioDAO;

public class TestaQ003 {
    /*
       Faça uma consulta Atualização com a tabela Atendente que atualize a 
       matrícula.
    */

    public static void main(String[] args) throws Exception {
        // alteraMatr(int novaMatr,int matr)
        System.out.println(ExercicioDAO.alteraMatr(4, 2));
    }
}
