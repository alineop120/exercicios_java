package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Atendente;

public class AtendenteDAO {
    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    public static List<Atendente> leTodos() throws Exception
    {
        List<Atendente> listAtendentes = new ArrayList<Atendente>();
        try 
        {
            String sql = "SELECT * FROM ATENDENTE";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) 
            {
                Atendente a = new Atendente();
                a.setMatr(rs.getInt("matr"));
                a.setNome(rs.getString("nome"));
                listAtendentes.add(a);
            }
            st.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        return listAtendentes;
    }

    public static Atendente leUm(int matr) throws Exception 
    {
        Atendente atendente = new Atendente();
        try 
        {
            String sql = "SELECT * FROM Atendente WHERE matr = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, matr);
            rs = st.executeQuery();

            if (rs.next()) 
            {
                atendente.setMatr(rs.getInt("matr"));
                atendente.setNome(rs.getString("nome"));
            }
            st.close();

        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return atendente;

    }

    public static int grava(Atendente atendente) throws Exception 
    {
        int ret = 0;
        try 
        {
            String sql = "INSERT INTO Atendente (matr,nome) VALUES (?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, atendente.getMatr());
            st.setString(2, atendente.getNome());
            ret = st.executeUpdate();
            st.close();

        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return ret;

    }

    public static int altera(String nome,int matr) throws Exception {

    int ret = 0;
    try 
    {
        String sql = "UPDATE atendente SET nome = ? WHERE matr = ?";
        connection = GerenteDeConexao.getConnection();
        st = connection.prepareStatement(sql);
        st.setString(1, nome);
        st.setInt(2,matr);
        ret = st.executeUpdate();
        st.close();

    } 
    catch (SQLException e) 
    {
        System.out.println(e.getMessage());
    }
    return ret;
    
    }

    public static int exclui(int matr) throws Exception 
    {
        int ret = 0;
        try 
        {
            String sql = "DELETE FROM atendente WHERE matr = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, matr);
            ret = st.executeUpdate();
            st.close();

        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return ret;
    
    } 
    
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // QUESTÃO 01
    /*
       Faça uma consulta Seleção com a tabela Atendente que liste todos os 
       atendentes que possuem matrícula >= 2. 
    */
    public static List<Atendente> leMatr() throws Exception 
    {
        List<Atendente> listAtendentes = new ArrayList<Atendente>();
        try 
        {
            String sql = "SELECT * FROM Atendente WHERE matr >= 2";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Atendente a = new Atendente();
                a.setMatr(rs.getInt("matr"));
                a.setNome(rs.getString("nome"));
                listAtendentes.add(a);
            }
            st.close();

        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return listAtendentes;
    }
    
    // QUESTÃO 02
    /*
       Faça uma consulta Seleção com a tabela Atendente que liste todos os 
       atendentes cujo nome começa com a letra P.
    
       Obs.: É necessário utilizar o operador like!
    */
    public static List<Atendente> leNomeP() throws Exception 
    {
        List<Atendente> listAtendentes = new ArrayList<Atendente>();
        try 
        {
            String sql = "SELECT * FROM Atendente WHERE nome LIKE 'P%'";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Atendente a = new Atendente();
                a.setMatr(rs.getInt("matr"));
                a.setNome(rs.getString("nome"));
                listAtendentes.add(a);
            }
            st.close();

        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return listAtendentes;
    }
    
    // QUESTÃO 03
    /*
       Faça uma consulta Atualização com a tabela Atendente que atualize a 
       matrícula.
    */
    public static List<Atendente> atualizaMatr(int matrAntiga, int novaMatr) throws Exception 
    {
        List<Atendente> listAtendentes = new ArrayList<>();
        try 
        {
            String sqlUpdate = "UPDATE Atendente SET matr = ? WHERE matr = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sqlUpdate);
            st.setInt(1, novaMatr);
            st.setInt(2, matrAntiga);
            st.executeUpdate();

            st.close();

        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return listAtendentes;
    }

    // QUESTÃO 04
    /*
       Faça uma consulta Atualização com a tabela Atendente que atualize a 
       matrícula e nome.
    */
    public static List<Atendente> atualizaMatr_e_Nome(int matrAntiga, int novaMatr, String novoNome) throws Exception 
    {
        List<Atendente> listAtendentes = new ArrayList<>();
        try 
        {
            String sql = "UPDATE Atendente SET matr = ?, nome = ? WHERE matr = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, novaMatr);
            st.setString(2, novoNome);
            st.setInt(3, matrAntiga);
            st.executeUpdate();

            st.close();

        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return listAtendentes;
    } 
    
    // QUESTÃO 05
    /*
       Faça uma consulta Exclusão com a tabela Atendente que exclua todos os 
       atendentes cuja matrícula esteja entre 2 e 8.
    
       Obs.: É necessário utilizar o operador between!
    */
    public static List<Atendente> excluiMatri() throws Exception 
    {
        List<Atendente> listAtendentes = new ArrayList<>();
        try 
        {
            String sql = "DELETE FROM Atendente WHERE matr BETWEEN ? AND ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, 2);
            st.setInt(2, 8);
            st.executeUpdate();

            st.close();

        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return listAtendentes;
    }
    
    // QUESTÃO 06
    /*
       Faça uma consulta Exclusão com a tabela Atendente que exclua todos os 
       atendentes cujo nome começa com a letra M.
    
       Obs.: É necessário utilizar o operador like!
    */
    public static List<Atendente> excluiNome() throws Exception 
    {
        List<Atendente> listAtendentes = new ArrayList<>();
        try 
        {
            String sql = "DELETE FROM Atendente WHERE nome LIKE 'M%'";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.executeUpdate();

            st.close();

        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return listAtendentes;
    }    
    
    // QUESTÃO 08
    /*
        Faça uma consulta Seleção com as tabelas Atendente e Física que mostre 
        matrícula e nome dos atendentes, e seus respectivos clientes pessoa 
        física com cpf e nome, cujo nome do atendente comece com a letra J e a 
        idade da pessoa física esteja entre 30 e 40.
    */
    
    
    
    // QUESTÃO 09
    /*
        Faça uma consulta Seleção com a tabela Juridica que liste todas as 
        pessoas jurídicas que possuem cnpj igual à “101010” e “303030”.
    
        Obs.: É necessário utilizar o operador in(... , ...).
    */
    
    
    
    // QUESTÃO 10
    /*
        Faça uma consulta Seleção com a tabela Juridica que liste todas as 
        pessoas jurídicas que possuem cnpj igual à “404040” ou a idade seja 
        superior a 5.
    
        Obs.: É necessário utilizar os operadores: = e >!
    */
    
    
    
    // QUESTÃO 11
    /*
        Faça uma consulta Seleção com as tabelas Atendente e Jurídica que 
        mostre matrícula e nome dos atendentes, e seus respectivos clientes 
        pessoa jurídica com cnpj, nome e idade, cuja matrícula do atendente 
        seja igual a 1 ou 3, e a idade da pessoa jurídica seja igual a 10.
    
        Obs.: É necessário utilizar os operadores inner join, in(... , ...) 
        e > na primeira condição!
    */
    
    
    
}
