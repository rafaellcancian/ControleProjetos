
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

    public List<Alocacao> getLista() {
        try {
            List<Alocacao> lstAlocacao = new ArrayList<>();
            String sql1 = "SELECT * FROM Alocacao ORDER BY idAlocacao";
            PreparedStatement pstmt = con.prepareStatement(sql1);
            ResultSet rs = pstmt.executeQuery();           
            while (rs.next()) {
                Alocacao p = new Alocacao();
                p.setIdAlocacao(rs.getInt("idAlocacao"));
                p.setDataInicio(rs.getDate("dataInicio"));
                p.setDataFim(rs.getDate("dataFim"));
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
}
