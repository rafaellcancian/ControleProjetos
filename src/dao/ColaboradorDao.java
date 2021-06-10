
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Colaborador;

public class ColaboradorDao {
    private Connection con;

    public ColaboradorDao() {
        con = (Connection) ConnectionFactory.getConnection();
    }

    public int inserir(Colaborador colaborador) {
        Object parColaborador[] = {colaborador.getMatricula(), colaborador.getNome(), 
                    colaborador.getDataAdmissao(), colaborador.getDataDesligamento()};
        
        PreparedStatement pstmt = null;
        
        try {
            con.setAutoCommit(false);
            String sql1 = "INSERT INTO Colaborador(matricula, nome, dataAdmissao, dataDesligamento) "
                        + "values (?,?,?,?)";
            pstmt = con.prepareStatement(sql1);
            for (int i = 0; i < parColaborador.length; i++) {
                pstmt.setObject(i + 1, parColaborador[i]);
            }
            pstmt.execute();

            con.commit();
            return -1;
        } catch (SQLException e) {
            try {
                con.rollback();
                return e.getErrorCode();
            } catch (SQLException ex) {
                return ex.getErrorCode();
            }
        } finally {
            try {
                pstmt.close();
                con.setAutoCommit(true);
                con.close();
            } catch (SQLException e) {
                return e.getErrorCode();
            }
        }
    }

    public int alterar(Colaborador colaborador) {
        Object parColaborador[] = {colaborador.getMatricula(), colaborador.getNome(), 
                    colaborador.getDataAdmissao(), colaborador.getDataDesligamento(),
                    colaborador.getIdColaborador()};
        
        PreparedStatement pstmt = null;

        try {
            con.setAutoCommit(false);
            String sql1 = "UPDATE Colaborador SET matricula=?, nome=?, dataAdmissao=?, dataDesligamento=? WHERE idColaborador=?";
            pstmt = con.prepareStatement(sql1);
            for (int i = 0; i < parColaborador.length; i++) {
                pstmt.setObject(i + 1, parColaborador[i]);
            }
            pstmt.execute();

            con.commit();
            return -1;
        } catch (SQLException e) {
            try {
                con.rollback();
                return e.getErrorCode();
            } catch (SQLException ex) {
                return ex.getErrorCode();
            }
        } finally {
            try {
                pstmt.close();
                con.setAutoCommit(true);
                con.close();
            } catch (SQLException e) {
                return e.getErrorCode();
            }
        }
    }

    public int excluir(Colaborador colaborador) {
        PreparedStatement pstmt = null;

        try {
            con.setAutoCommit(false);
            String sql1 = "DELETE FROM Colaborador WHERE idColaborador=?";
            pstmt = con.prepareStatement(sql1);
            pstmt.setInt(1, colaborador.getIdColaborador());
            pstmt.execute();

            con.commit();
            return -1;
        } catch (SQLException e) {
            try {
                con.rollback();
                return e.getErrorCode();
            } catch (SQLException ex) {
                return ex.getErrorCode();
            }
        } finally {
            try {
                pstmt.close();
                con.setAutoCommit(true);
                con.close();
            } catch (SQLException e) {
                return e.getErrorCode();
            }
        }
    }

    public List<Colaborador> getLista() {
        try {
            List<Colaborador> lstColaborador = new ArrayList<>();
            String sql1 = "SELECT * FROM Colaborador ORDER BY Nome";
            PreparedStatement pstmt = con.prepareStatement(sql1);
            ResultSet rs = pstmt.executeQuery();           
            while (rs.next()) {
                Colaborador c = new Colaborador();
                c.setIdColaborador(rs.getInt("idColaborador"));
                c.setMatricula(rs.getString("matricula"));
                c.setNome(rs.getString("nome"));
                c.setDataAdmissao(rs.getDate("dataAdmissao"));
                c.setDataDesligamento(rs.getDate("dataDesligamento"));
                lstColaborador.add(c);
            }
            rs.close();
            pstmt.close();
            return lstColaborador;
        } catch (SQLException e) {
            System.out.println("Erro número: " + e.getErrorCode() + " - Mensagem: " + e.getMessage());
            return null;
        }
    }

    public Colaborador getColaboradorId(int id) {
        try {
            Colaborador c = null;
            String sql1 = "SELECT * FROM Colaborador ORDER BY Nome";
            PreparedStatement pstmt = con.prepareStatement(sql1);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                c = new Colaborador();
                c.setIdColaborador(rs.getInt("idColaborador"));
                c.setMatricula(rs.getString("matricula"));
                c.setNome(rs.getString("nome"));
                c.setDataAdmissao(rs.getDate("dataAdmissao"));
                c.setDataDesligamento(rs.getDate("dataDesligamento"));
            }
            rs.close();
            pstmt.close();
            return c;
        } catch (SQLException e) {
            System.out.println("Erro número: " + e.getErrorCode() + " - Mensagem: " + e.getMessage());
            return null;
        }
    }

    public List<Colaborador> getColaboradorNome(String nome) {
        try {
            List<Colaborador> lstColaborador = new ArrayList<>();
            String sql1 = "SELECT * FROM Colaborador WHERE nome LIKE ?";
            PreparedStatement pstmt = con.prepareStatement(sql1);
            pstmt.setString(1, "%" + nome + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Colaborador c = new Colaborador();
                c.setIdColaborador(rs.getInt("idColaborador"));
                c.setMatricula(rs.getString("matricula"));
                c.setNome(rs.getString("nome"));
                c.setDataAdmissao(rs.getDate("dataAdmissao"));
                c.setDataDesligamento(rs.getDate("dataDesligamento"));
                lstColaborador.add(c);
            }
            rs.close();
            pstmt.close();
            return lstColaborador;
        } catch (SQLException e) {
            System.out.println("Erro número: " + e.getErrorCode() + " - Mensagem: " + e.getMessage());
            return null;
        }     
    }

    public List<Colaborador> getColaboradorMatricula(String matricula) {
        try {
            List<Colaborador> lstColaborador = new ArrayList<>();
            String sql1 = "SELECT * FROM Colaborador WHERE matricula LIKE ?";
            PreparedStatement pstmt = con.prepareStatement(sql1);
            pstmt.setString(1, "%" + matricula + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Colaborador c = new Colaborador();
                c.setIdColaborador(rs.getInt("idColaborador"));
                c.setMatricula(rs.getString("matricula"));
                c.setNome(rs.getString("nome"));
                c.setDataAdmissao(rs.getDate("dataAdmissao"));
                c.setDataDesligamento(rs.getDate("dataDesligamento"));
                lstColaborador.add(c);
            }
            rs.close();
            pstmt.close();
            return lstColaborador;
        } catch (SQLException e) {
            System.out.println("Erro número: " + e.getErrorCode() + " - Mensagem: " + e.getMessage());
            return null;
        }     
    }

}
