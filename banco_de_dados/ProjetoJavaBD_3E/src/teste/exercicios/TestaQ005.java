package teste.exercicios;

import persistencia.ExercicioDAO;

public class TestaQ005 {
    /*
       Faça uma consulta Exclusão com a tabela Atendente que exclua todos os 
       atendentes cuja matrícula esteja entre 2 e 8.
    
       Obs.: É necessário utilizar o operador between!
    */

    public static void main(String[] args) throws Exception {
        System.out.println(ExercicioDAO.excluiMatr(2, 8));
    }
    
}
