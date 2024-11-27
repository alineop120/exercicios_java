package teste.exercicios;

import persistencia.ExercicioDAO;

public class TestaQ006 {
    /*
       Faça uma consulta Exclusão com a tabela Atendente que exclua todos os 
       atendentes cujo nome começa com a letra M.
    
       Obs.: É necessário utilizar o operador like!
    */

    public static void main(String[] args) throws Exception {
        System.out.println(ExercicioDAO.excluiLike("M"));
    }
    
}
