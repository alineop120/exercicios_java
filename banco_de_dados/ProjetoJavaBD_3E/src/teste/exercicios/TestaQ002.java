package teste.exercicios;

import persistencia.ExercicioDAO;

public class TestaQ002 {
    /*
       Faça uma consulta Seleção com a tabela Atendente que liste todos os 
       atendentes cujo nome começa com a letra P.
    
       Obs.: É necessário utilizar o operador like!
    */
    
    public static void main(String[] args) throws Exception{
        System.out.println(ExercicioDAO.leTodosLike("P"));
    }
}
