package teste.exercicios;

import persistencia.ExercicioDAO;

public class TestaQ001 {
    /*
       Faça uma consulta Seleção com a tabela Atendente que liste todos os 
       atendentes que possuem matrícula >= 2. 
    */

    public static void main(String[] args) throws Exception {
        System.out.println(ExercicioDAO.leTodosMatr(2));
    }
    
}
