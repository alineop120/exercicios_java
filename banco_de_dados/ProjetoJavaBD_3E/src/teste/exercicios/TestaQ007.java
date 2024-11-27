package teste.exercicios;

import persistencia.ExercicioDAO;

public class TestaQ007 {
    /*
        Faça uma consulta Seleção com a tabela Física que liste todas as 
        pessoas física que possuem idade entre 15 e 30 anos.
    
        Obs.: É necessário utilizar o operador between!
    */

    public static void main(String[] args) throws Exception {
        System.out.println(ExercicioDAO.leTodosIdadeBetween(15, 30));
    }
    
}
