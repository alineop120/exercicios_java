package teste.exercicios;

import persistencia.ExercicioDAO;

public class TestaQ009 {
    /*
        Faça uma consulta Seleção com a tabela Juridica que liste todas as 
        pessoas jurídicas que possuem cnpj igual à “101010” e “303030”.
    
        Obs.: É necessário utilizar o operador in(... , ...).
    */
    
    public static void main(String[] args) throws Exception {
        // leTodosPorCnpj(String cnpj1, String cnpj2)
        System.out.println(ExercicioDAO.leTodosPorCnpj("101010", "303030"));
    }
    
}
