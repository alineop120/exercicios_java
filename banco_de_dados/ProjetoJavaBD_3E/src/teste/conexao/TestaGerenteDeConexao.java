package teste.conexao;

import java.sql.SQLException;
import persistencia.GerenteDeConexao;

public class TestaGerenteDeConexao {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println(GerenteDeConexao.getConnection());
        /**
         * SAIDA:
            com.mysql.jdbc.JDBC4Connection@41cf53f9
         */
    }
    
}
