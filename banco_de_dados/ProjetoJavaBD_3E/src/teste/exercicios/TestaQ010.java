package teste.exercicios;

import persistencia.ExercicioDAO;

public class TestaQ010 {
    /*
        Faça uma consulta Seleção com a tabela Juridica que liste todas as 
        pessoas jurídicas que possuem cnpj igual à “404040” ou a idade seja 
        superior a 5.
    
        Obs.: É necessário utilizar os operadores: = e >!
    */
    
    public static void main(String[] args) throws Exception {
        System.out.println(ExercicioDAO.leIdadeJuridica());
    }
    
}
