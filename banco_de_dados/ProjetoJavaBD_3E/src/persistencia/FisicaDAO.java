package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Fisica;

public class FisicaDAO {
    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;
    
    public static List<Fisica> leTodos() throws Exception
    {
        List<Fisica> listFisicas = new ArrayList<Fisica>();
        try
        {
            String sql = "SELECT * FROM FISICA";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
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
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return listFisicas;
        
    }
    
    public static Fisica leUm(String cpf) throws Exception
    {
        Fisica fisica = new Fisica();
        try
        {
            String sql = "SELECT * FROM Fisica WHERE cpf = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpf);
            rs = st.executeQuery();

            if (rs.next()) 
            {
                fisica.setCpf(rs.getString("cpf"));
                fisica.setNome(rs.getString("nome"));
                fisica.setIdade(rs.getInt("idade"));
                fisica.setAtendente(AtendenteDAO.leUm(rs.getInt("atendente_matr")));

            }
            st.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return fisica;
    }
    
    public static int grava(Fisica fisica) throws Exception 
    {
        int ret = 0;
        try 
        {
            String sql = "INSERT INTO Fisica (cpf,nome,idade,atendente_matr) VALUES (?, ?, ?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, fisica.getCpf());
            st.setString(2, fisica.getNome());
            st.setInt(3, fisica.getIdade());
            st.setInt(4, fisica.getAtendente().getMatr());
            ret = st.executeUpdate();
            st.close();

        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());

        }
        return ret;

    }
    
    public static int altera(Fisica fisica) throws Exception 
    {
        int ret = 0;

        try 
        {
            String sql = "UPDATE Fisica SET nome = ?, idade = ?, atendente_matr = ? WHERE cpf = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, fisica.getNome());
            st.setInt(2, fisica.getIdade());
            st.setInt(3, fisica.getAtendente().getMatr());
            st.setString(4, fisica.getCpf());
            ret = st.executeUpdate();
            st.close();

        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());

        }
        return ret;

    }
    
    public static int exclui(String cpf) throws Exception 
    {
        int ret = 0;
        try 
        {
            String sql = "DELETE FROM Fisica WHERE cpf = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpf);
            ret = st.executeUpdate();
            st.close();

        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        
        }
        return ret;

    }
}
