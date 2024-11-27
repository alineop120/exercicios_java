package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Atendente;
import modelo.Fisica;
import modelo.Juridica;

public class ExercicioDAO {
    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    // QUESTÃO 01
    public static List<Atendente> leTodosMatr(int matr) throws Exception {
        List<Atendente> listAtendentes = new ArrayList<>();

        try {
            String sql = "SELECT * FROM ATENDENTE where matr >= ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, matr);
            rs = st.executeQuery();

            while (rs.next()) {
                Atendente a = new Atendente();
                a.setMatr(rs.getInt("matr"));
                a.setNome(rs.getString("nome"));
                listAtendentes.add(a);
            }
            st.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listAtendentes;
    }
    
    // QUESTÃO 02
    public static List<Atendente> leTodosLike(String letra) throws Exception{
        List<Atendente> listAtendentes = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ATENDENTE where nome like ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, "%" + letra + "%");
            rs = st.executeQuery();

            while (rs.next()) {
                Atendente a = new Atendente();
                a.setMatr(rs.getInt("matr"));
                a.setNome(rs.getString("nome"));
                listAtendentes.add(a);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listAtendentes;
    }
    
    // QUESTÃO 03
    public static int alteraMatr(int novaMatr,int matr) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE atendente SET matr = ? WHERE matr = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, novaMatr);
            st.setInt(2, matr);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    // QUESTÃO 04
    public static int alteraMatrNome(int novaMatr,String novoNome, int matr) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE atendente SET matr = ?, nome = ? WHERE matr = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, novaMatr);
            st.setString(2, novoNome);
            st.setInt(3,matr);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    // QUESTÃO 05
    public static int excluiMatr(int matr1, int matr2) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM atendente WHERE matr between ? and ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, matr1);
            st.setInt(2, matr2);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }  
    
    // QUESTÃO 06
    public static int excluiLike(String letra) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM atendente WHERE nome like ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1,'%'+ letra + '%');
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    } 

    // QUESTÃO 07
    public static List<Fisica> leTodosIdadeBetween(int idade1, int idade2) throws Exception{
        List<Fisica> listFisicas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM fisica where idade between ? and ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idade1);
            st.setInt(2, idade2);
            rs = st.executeQuery();
            while (rs.next()) {
                Fisica f = new Fisica();
                f.setCpf(rs.getString("cpf"));
                f.setNome(rs.getString("nome"));
                f.setIdade(rs.getInt("idade"));
                f.setAtendente(AtendenteDAO.leUm(rs.getInt("Atendente_matr")));
                listFisicas.add(f);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listFisicas;
    }
    
    // QUESTÃO 08
    public static List<Fisica> leTodosInnerJoinLikeBetween(String letra, int idade1, int idade2) throws Exception{
        List<Fisica> listFisicas = new ArrayList<>();
        try {
            String sql = "select  f.cpf, f.nome, a.matr, a.nome from atendente a " +
                         "inner join fisica f on a.matr = f.atendente_matr " +
                         "where a.nome like ? and f.idade between ? and ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1,'%'+ letra +'%');
            st.setInt(2, idade1);
            st.setInt(3, idade2);
            rs = st.executeQuery();

            while (rs.next()) {
                Fisica f = new Fisica();
                f.setCpf(rs.getString("cpf"));
                f.setNome(rs.getString("nome"));
                f.setAtendente(AtendenteDAO.leUm(rs.getInt("matr")));
                listFisicas.add(f);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listFisicas;
    }
    
    // QUESTÃO 09
    public static List<Juridica> leTodosPorCnpj(String cnpj1, String cnpj2) throws Exception{
        List<Juridica> listJuridicas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM JURIDICA where cnpj in(?,?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cnpj1);
            st.setString(2, cnpj2);
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
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listJuridicas;
    }

    // QUESTÃO 10
    public static List<Juridica> leTodosPorCnpjOuIdade(String cnpj, int idade) throws Exception{
        List<Juridica> listJuridicas = new ArrayList<Juridica>();
        try {
            String sql = "SELECT * FROM JURIDICA where cnpj = ? or idade = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cnpj);
            st.setInt(2, idade);
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
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listJuridicas;
    }
    
    // QUESTÃO 11
    public static List<Juridica> leTodosInnerJoinInMaiorIgual(int matr1, int matr2, int idade) throws Exception{
        List<Juridica> listJuridicas = new ArrayList<>();
        try {
            String sql = "select j.cnpj, j.nome, j.idade, a.matr, a.nome from atendente a " +
                         "inner join juridica j on a.matr = j.Atendente_matr " +
                         "where a.matr in(?,?) and j.idade >= ? ";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, matr1);
            st.setInt(2, matr2);
            st.setInt(3, idade);
            rs = st.executeQuery();
            while (rs.next()) {
                Juridica j = new Juridica();
                j.setCnpj(rs.getString("cnpj"));
                j.setNome(rs.getString("nome"));
                j.setIdade(rs.getInt("idade"));
                j.setAtendente(AtendenteDAO.leUm(rs.getInt("matr")));
                listJuridicas.add(j);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listJuridicas;
    }
}
