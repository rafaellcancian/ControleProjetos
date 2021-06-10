
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Projeto;
import model.Alocacao;
import model.Colaborador;

public class AlocacaoDao {
    private Connection con;

    public AlocacaoDao() {
        con = (Connection) ConnectionFactory.getConnection();
    }

    public int inserir(Alocacao alocacao) {
        Object parAlocacao[] = {alocacao.getProjeto().getIdProjeto(), alocacao.getColaborador().getIdColaborador(),
            alocacao.getDataInicio(), alocacao.getDataFim(), alocacao.getHorasSemana(), alocacao.getValorHora()};
        PreparedStatement pstmt = null;

        try {
            con.setAutoCommit(false);
            String sql1 = "INSERT INTO Alocacao(idProjeto, idColaborador, dataInicio, dataFim, horasSemana, "
                        + "valorHora) "
                        + "values (?,?,?,?,?,?)";
            pstmt = con.prepareStatement(sql1);
            for (int i = 0; i < parAlocacao.length; i++) {
                pstmt.setObject(i + 1, parAlocacao[i]);
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
/*
    public int alterar(Alocacao projeto) {
        Object parAlocacao[] = {projeto.getCliente().getIdCliente(), projeto.getLider().getIdColaborador(), projeto.getMatricula(), projeto.getNome(),
            projeto.getEscopo(), projeto.getDataInicio(), projeto.getDataPrevConclusao(), projeto.getDataConclusao(), projeto.getTipoCliente(), projeto.getIdAlocacao()};
        PreparedStatement pstmt = null;

        try {
            con.setAutoCommit(false);
            String sql1 = "UPDATE Alocacao SET idCliente=?, idLider=?, matricula=?, nome=?, escopo=?, dataInicio=?, dataPrevConclusao=?, dataConclusao=?, tipoCliente=? WHERE idAlocacao=?";
            pstmt = con.prepareStatement(sql1);
            for (int i = 0; i < parAlocacao.length; i++) {
                pstmt.setObject(i + 1, parAlocacao[i]);
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

    public int excluir(Alocacao projeto) {
        PreparedStatement pstmt = null;

        try {
            con.setAutoCommit(false);
            String sql1 = "DELETE FROM Alocacao WHERE idAlocacao=?";
            pstmt = con.prepareStatement(sql1);
            pstmt.setInt(1, projeto.getIdAlocacao());
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
*/
    public List<Alocacao> getLista() {
        try {
            List<Alocacao> lstAlocacao = new ArrayList<>();
            String sql1 = "SELECT * FROM Alocacao ORDER BY idAlocacao";
            PreparedStatement pstmt = con.prepareStatement(sql1);
            ResultSet rs = pstmt.executeQuery();           
            while (rs.next()) {
                Alocacao p = new Alocacao();
                p.setIdAlocacao(rs.getInt("idAlocacao"));
               // p.setNome(rs.getString("nome"));
               // p.setEscopo(rs.getString("escopo"));
                p.setDataInicio(rs.getDate("dataInicio"));
               // p.setDataPrevConclusao(rs.getDate("dataPrevConclusao"));
                p.setDataFim(rs.getDate("dataFim"));
               // p.setTipoCliente(rs.getInt("tipoCliente"));
                //p.setProjeto(rs.getInt("idProjeto"));
                p.setColaborador(new Colaborador(rs.getInt("idColaborador")));
                lstAlocacao.add(p);
            }
            rs.close();
            pstmt.close();
            return lstAlocacao;
        } catch (SQLException e) {
            System.out.println("Erro número: " + e.getErrorCode() + " - Mensagem: " + e.getMessage());
            return null;
        }
    }
/*
    public Alocacao getAlocacaoId(int id) {
        try {
            Alocacao p = null;
            String sql1 = "SELECT * FROM Alocacao ORDER BY Nome";
            PreparedStatement pstmt = con.prepareStatement(sql1);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                p = new Alocacao();
                p.setIdAlocacao(rs.getInt("idAlocacao"));
                p.setMatricula(rs.getString("matricula"));
                p.setNome(rs.getString("nome"));
                p.setEscopo(rs.getString("escopo"));
                p.setDataInicio(rs.getDate("dataInicio"));
                p.setDataPrevConclusao(rs.getDate("dataPrevConclusao"));
                p.setDataConclusao(rs.getDate("dataConclusao"));
                p.setTipoCliente(rs.getInt("tipoCliente"));
                //p.setCliente(new Cliente(rs.getInt("idCliente")));
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

    public List<Alocacao> getAlocacaoNome(String nome) {
        try {
            List<Alocacao> lstAlocacao = new ArrayList<>();
            String sql1 = "SELECT * FROM Alocacao WHERE nome LIKE ?";
            PreparedStatement pstmt = con.prepareStatement(sql1);
            pstmt.setString(1, "%" + nome + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Alocacao p = new Alocacao();
                p.setIdAlocacao(rs.getInt("idAlocacao"));
                p.setMatricula(rs.getString("matricula"));
                p.setNome(rs.getString("nome"));
                p.setEscopo(rs.getString("escopo"));
                p.setDataInicio(rs.getDate("dataInicio"));
                p.setDataPrevConclusao(rs.getDate("dataPrevConclusao"));
                p.setDataConclusao(rs.getDate("dataConclusao"));
                p.setTipoCliente(rs.getInt("tipoCliente"));
                //p.setCliente(new Cliente(rs.getInt("idCliente")));
                p.setLider(new Colaborador(rs.getInt("idLider")));
                lstAlocacao.add(p);
            }
            rs.close();
            pstmt.close();
            return lstAlocacao;
        } catch (SQLException e) {
            System.out.println("Erro número: " + e.getErrorCode() + " - Mensagem: " + e.getMessage());
            return null;
        }     
    }

    public List<Alocacao> getAlocacaoMatricula(String matricula) {
        try {
            List<Alocacao> lstAlocacao = new ArrayList<>();
            String sql1 = "SELECT * FROM Alocacao WHERE matricula LIKE ?";
            PreparedStatement pstmt = con.prepareStatement(sql1);
            pstmt.setString(1, "%" + matricula + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Alocacao p = new Alocacao();
                p.setIdAlocacao(rs.getInt("idAlocacao"));
                p.setMatricula(rs.getString("matricula"));
                p.setNome(rs.getString("nome"));
                p.setEscopo(rs.getString("escopo"));
                p.setDataInicio(rs.getDate("dataInicio"));
                p.setDataPrevConclusao(rs.getDate("dataPrevConclusao"));
                p.setDataConclusao(rs.getDate("dataConclusao"));
                p.setTipoCliente(rs.getInt("tipoCliente"));
                //p.setCliente(new Cliente(rs.getInt("idCliente")));
                p.setLider(new Colaborador(rs.getInt("idLider")));
                lstAlocacao.add(p);
            }
            rs.close();
            pstmt.close();
            return lstAlocacao;
        } catch (SQLException e) {
            System.out.println("Erro número: " + e.getErrorCode() + " - Mensagem: " + e.getMessage());
            return null;
        }     
    }
*/
}
