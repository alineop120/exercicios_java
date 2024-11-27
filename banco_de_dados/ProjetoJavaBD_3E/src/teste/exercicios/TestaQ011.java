package teste.exercicios;

import persistencia.ExercicioDAO;

public class TestaQ011 {
    /*
        Faça uma consulta Seleção com as tabelas Atendente e Jurídica que 
        mostre matrícula e nome dos atendentes, e seus respectivos clientes 
        pessoa jurídica com cnpj, nome e idade, cuja matrícula do atendente 
        seja igual a 1 ou 3, e a idade da pessoa jurídica seja igual a 10.
    
        Obs.: É necessário utilizar os operadores inner join, in(... , ...) 
        e > na primeira condição!
    */
    
    public static void main(String[] args) throws Exception {
        //leTodosInnerJoinInMaiorIgual(int matr1, int matr2, int idade)
        System.out.println(ExercicioDAO.leTodosInnerJoinInMaiorIgual(1, 3, 10));
    }
    
}

