package testes.exercicios;

import persistencia.ExercicioDAO;

public class TestaQ008 {
    /*
        Faça uma consulta Seleção com as tabelas Atendente e Física que mostre 
        matrícula e nome dos atendentes, e seus respectivos clientes pessoa 
        física com cpf e nome, cujo nome do atendente comece com a letra J e a 
        idade da pessoa física esteja entre 30 e 40.
    */

    public static void main(String[] args) throws Exception {
        //                              leTodosInnerJoinLikeBetween(String letra, int idade1, int idade2)
        System.out.println(ExercicioDAO.leTodosInnerJoinLikeBetween("J", 30, 40));
    }
    
}
