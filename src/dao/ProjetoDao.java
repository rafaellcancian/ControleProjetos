
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Projeto;
import model.Cliente;
import model.Colaborador;

public class ProjetoDao implements IProjetoDao {
    private Connection con;

    public ProjetoDao() {
        con = (Connection) ConnectionFactory.getConnection();
    }

    @Override
    public int inserir(Projeto projeto) {
        Object parProjeto[] = {projeto.getCliente().getIdCliente(), projeto.getLider().getIdColaborador(), projeto.getMatricula(), projeto.getNome(),
            projeto.getEscopo(), projeto.getDataInicio(), projeto.getDataPrevConclusao(), projeto.getDataConclusao(), projeto.getTipoCliente()};
        PreparedStatement pstmt = null;

        try {
            con.setAutoCommit(false);
            String sql1 = "INSERT INTO Projeto(idCliente, idLider, matricula, nome, escopo, dataInicio, dataPrevConclusao, dataConclusao, tipoCliente) values (?,?,?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(sql1);
            for (int i = 0; i < parProjeto.length; i++) {
                pstmt.setObject(i + 1, parProjeto[i]);
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

    @Override
    public int alterar(Projeto projeto) {
        Object parProjeto[] = {projeto.getCliente().getIdCliente(), projeto.getLider().getIdColaborador(), projeto.getMatricula(), projeto.getNome(),
            projeto.getEscopo(), projeto.getDataInicio(), projeto.getDataPrevConclusao(), projeto.getDataConclusao(), projeto.getTipoCliente(), projeto.getIdProjeto()};
        PreparedStatement pstmt = null;

        try {
            con.setAutoCommit(false);
            String sql1 = "UPDATE Projeto SET idCliente=?, idLider=?, matricula=?, nome=?, escopo=?, dataInicio=?, dataPrevConclusao=?, dataConclusao=?, tipoCliente=? WHERE idProjeto=?";
            pstmt = con.prepareStatement(sql1);
            for (int i = 0; i < parProjeto.length; i++) {
                pstmt.setObject(i + 1, parProjeto[i]);
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

    @Override
    public int excluir(Projeto projeto) {
        PreparedStatement pstmt = null;

        try {
            con.setAutoCommit(false);
            String sql1 = "DELETE FROM Projeto WHERE idProjeto=?";
            pstmt = con.prepareStatement(sql1);
            pstmt.setInt(1, projeto.getIdProjeto());
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

    @Override
    public List<Projeto> getLista() {
        try {
            List<Projeto> lstProjeto = new ArrayList<>();
            String sql1 = "SELECT * FROM Projeto ORDER BY Nome";
            PreparedStatement pstmt = con.prepareStatement(sql1);
            ResultSet rs = pstmt.executeQuery();           
            while (rs.next()) {
                Projeto p = new Projeto();
                p.setIdProjeto(rs.getInt("idProjeto"));
                p.setMatricula(rs.getString("matricula"));
                p.setNome(rs.getString("nome"));
                p.setEscopo(rs.getString("escopo"));
                p.setDataInicio(rs.getDate("dataInicio"));
                p.setDataPrevConclusao(rs.getDate("dataPrevConclusao"));
                p.setDataConclusao(rs.getDate("dataConclusao"));
                p.setTipoCliente(rs.getInt("tipoCliente"));
                p.setCliente(new Cliente(rs.getInt("idCliente")));
                p.setLider(new Colaborador(rs.getInt("idLider")));
                lstProjeto.add(p);
            }
            rs.close();
            pstmt.close();
            return lstProjeto;
        } catch (SQLException e) {
            System.out.println("Erro número: " + e.getErrorCode() + " - Mensagem: " + e.getMessage());
            return null;
        }
    }

    @Override
    public Projeto getProjetoId(int id) {
        try {
            Projeto p = null;
            String sql1 = "SELECT * FROM Projeto ORDER BY Nome";
            PreparedStatement pstmt = con.prepareStatement(sql1);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                p = new Projeto();
                p.setIdProjeto(rs.getInt("idProjeto"));
                p.setMatricula(rs.getString("matricula"));
                p.setNome(rs.getString("nome"));
                p.setEscopo(rs.getString("escopo"));
                p.setDataInicio(rs.getDate("dataInicio"));
                p.setDataPrevConclusao(rs.getDate("dataPrevConclusao"));
                p.setDataConclusao(rs.getDate("dataConclusao"));
                p.setTipoCliente(rs.getInt("tipoCliente"));
                p.setCliente(new Cliente(rs.getInt("idCliente")));
                p.setLider(new Colaborador(rs.getInt("idLider")));
            }
            rs.close();
            pstmt.close();
            return p;
        } catch (SQLException e) {
            System.out.println("Erro número: " + e.getErrorCode() + " - Mensagem: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Projeto> getProjetoNome(String nome) {
        try {
            List<Projeto> lstProjeto = new ArrayList<>();
            String sql1 = "SELECT * FROM Projeto WHERE nome LIKE ?";
            PreparedStatement pstmt = con.prepareStatement(sql1);
            pstmt.setString(1, "%" + nome + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Projeto p = new Projeto();
                p.setIdProjeto(rs.getInt("idProjeto"));
                p.setMatricula(rs.getString("matricula"));
                p.setNome(rs.getString("nome"));
                p.setEscopo(rs.getString("escopo"));
                p.setDataInicio(rs.getDate("dataInicio"));
                p.setDataPrevConclusao(rs.getDate("dataPrevConclusao"));
                p.setDataConclusao(rs.getDate("dataConclusao"));
                p.setTipoCliente(rs.getInt("tipoCliente"));
                p.setCliente(new Cliente(rs.getInt("idCliente")));
                p.setLider(new Colaborador(rs.getInt("idLider")));
                lstProjeto.add(p);
            }
            rs.close();
            pstmt.close();
            return lstProjeto;
        } catch (SQLException e) {
            System.out.println("Erro número: " + e.getErrorCode() + " - Mensagem: " + e.getMessage());
            return null;
        }     
    }

    public List<Projeto> getProjetoMatricula(String matricula) {
        try {
            List<Projeto> lstProjeto = new ArrayList<>();
            String sql1 = "SELECT * FROM Projeto WHERE matricula LIKE ?";
            PreparedStatement pstmt = con.prepareStatement(sql1);
            pstmt.setString(1, "%" + matricula + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Projeto p = new Projeto();
                p.setIdProjeto(rs.getInt("idProjeto"));
                p.setMatricula(rs.getString("matricula"));
                p.setNome(rs.getString("nome"));
                p.setEscopo(rs.getString("escopo"));
                p.setDataInicio(rs.getDate("dataInicio"));
                p.setDataPrevConclusao(rs.getDate("dataPrevConclusao"));
                p.setDataConclusao(rs.getDate("dataConclusao"));
                p.setTipoCliente(rs.getInt("tipoCliente"));
                p.setCliente(new Cliente(rs.getInt("idCliente")));
                p.setLider(new Colaborador(rs.getInt("idLider")));
                lstProjeto.add(p);
            }
            rs.close();
            pstmt.close();
            return lstProjeto;
        } catch (SQLException e) {
            System.out.println("Erro número: " + e.getErrorCode() + " - Mensagem: " + e.getMessage());
            return null;
        }     
    }

}
