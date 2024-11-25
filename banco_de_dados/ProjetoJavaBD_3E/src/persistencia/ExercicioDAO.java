package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Atendente;
import modelo.Fisica;
import exercicios.AtendenteComFisica;
import exercicios.AtendenteComJuridica;
import modelo.Juridica;

public class ExercicioDAO {
    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    // QUESTÃO 01
    public static List<Atendente> leMatr() throws Exception 
    {
        List<Atendente> listAtendentes = new ArrayList<>();
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
    public static List<Atendente> leNomeP() throws Exception 
    {
        List<Atendente> listAtendentes = new ArrayList<>();
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
    public static List<Atendente> atualizaMatrNome(int matrAntiga, int novaMatr, String novoNome) throws Exception 
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

    // QUESTÃO 07
    public static List<Fisica> leIdade() throws Exception 
    {
        List<Fisica> listFisicas = new ArrayList<>();
        try 
        {
            String sql = "SELECT * FROM Fisica WHERE idade BETWEEN ? AND ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, 15);
            st.setInt(2, 30);
            rs = st.executeQuery();
            
            while (rs.next())
            {
                Fisica fisica = new Fisica();
                fisica.setCpf(rs.getString("cpf"));
                fisica.setNome(rs.getString("nome"));
                fisica.setIdade(rs.getInt("idade"));
                fisica.setAtendente(AtendenteDAO.leUm(rs.getInt("atendente_matr")));
                listFisicas.add(fisica);
            }
            st.close();

        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return listFisicas;
    }
    
    // QUESTÃO 08
    /*
        Faça uma consulta Seleção com as tabelas Atendente e Física que mostre 
        matrícula e nome dos atendentes, e seus respectivos clientes pessoa 
        física com cpf e nome, cujo nome do atendente comece com a letra J e a 
        idade da pessoa física esteja entre 30 e 40.
    */
    public static List<AtendenteComFisica> consultaAtendenteFisica() throws Exception {
    List<AtendenteComFisica> listAtendentesComFisicas = new ArrayList<>();
        try 
        {
            // Consulta SQL com JOIN entre Atendente e Física
            String sql = "SELECT a.matr, a.nome AS atendente_nome, f.cpf, f.nome AS fisica_nome, f.idade " +
                         "FROM Atendente a " + 
                         "JOIN Fisica f ON a.matr = f.Atendente_matr " +
                         "WHERE a.nome LIKE 'J%' " +
                         "AND f.idade BETWEEN 30 AND 40;";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                AtendenteComFisica atendenteComFisica = new AtendenteComFisica();

                // Preenche os dados do Atendente
                Atendente atendente = new Atendente();
                atendente.setMatr(rs.getInt("matr"));  // Usa "matr" conforme a consulta
                atendente.setNome(rs.getString("atendente_nome"));

                // Preenche os dados da Fisica
                Fisica fisica = new Fisica();
                fisica.setCpf(rs.getString("cpf"));
                fisica.setNome(rs.getString("fisica_nome"));
                fisica.setIdade(rs.getInt("idade"));

                // Associa o Atendente e a Fisica
                atendenteComFisica.setAtendente(atendente);
                atendenteComFisica.setFisica(fisica);

                // Adiciona à lista
                listAtendentesComFisicas.add(atendenteComFisica);
            }

            rs.close();
            st.close();

        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return listAtendentesComFisicas;
    }

    
    // QUESTÃO 09
    public static List<Juridica> leCnpj() throws Exception {
        List<Juridica> listJuridicas = new ArrayList<>();
        try 
        {
            String sql = "SELECT * FROM Juridica WHERE cnpj IN ('101010', '303030')";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Juridica juridica = new Juridica();
                juridica.setCnpj(rs.getString("cnpj"));
                juridica.setNome(rs.getString("nome"));
                juridica.setIdade(rs.getInt("idade"));
                juridica.setAtendente(AtendenteDAO.leUm(rs.getInt("atendente_matr")));
                listJuridicas.add(juridica);
            }

            st.close();
        } catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return listJuridicas;
    }

    
    
    // QUESTÃO 10
    public static List<Juridica> leIdadeJuridica() throws Exception {
        List<Juridica> listJuridicas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Juridica WHERE cnpj = '404040' OR idade > 5";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Juridica j = new Juridica();
                j.setCnpj(rs.getString("cnpj"));
                j.setNome(rs.getString("nome"));
                j.setIdade(rs.getInt("idade"));
                j.setAtendente(AtendenteDAO.leUm(rs.getInt("atendente_matr")));
                listJuridicas.add(j);
            }

            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listJuridicas;
    }

    
    
    // QUESTÃO 11
    public static List<AtendenteComJuridica> consultaAtendenteJuridica() throws Exception {
        List<AtendenteComJuridica> listAtendentesComJuridicas = new ArrayList<>();
        try 
        {
            // Consulta SQL com INNER JOIN, IN e ">"
            String sql = "SELECT a.matr, a.nome AS atendente_nome, j.cnpj, j.nome AS juridica_nome, j.idade " +
                         "FROM Atendente a " + 
                         "INNER JOIN Juridica j ON a.matr = j.Atendente_matr " +
                         "WHERE a.matr IN (1, 3) " + 
                         "AND j.idade = 10";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) 
            {
                AtendenteComJuridica atendenteComJuridica = new AtendenteComJuridica();

                Atendente atendente = new Atendente();
                atendente.setMatr(rs.getInt("matr"));
                atendente.setNome(rs.getString("atendente_nome"));

                Juridica juridica = new Juridica();
                juridica.setCnpj(rs.getString("cnpj"));
                juridica.setNome(rs.getString("juridica_nome"));
                juridica.setIdade(rs.getInt("idade"));

                atendenteComJuridica.setAtendente(atendente);
                atendenteComJuridica.setJuridica(juridica);

                listAtendentesComJuridicas.add(atendenteComJuridica);
            }

            st.close();
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return listAtendentesComJuridicas;
    }
}
