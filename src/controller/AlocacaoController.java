
package controller;

import dao.AlocacaoDao;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import model.Alocacao;
import model.Projeto;
import model.Colaborador;

public class AlocacaoController {

    public int incluir(BigDecimal horasSemana, BigDecimal valorHora, Date dataInicio, 
                       Date dataFim, Projeto projeto, Colaborador colaborador) {
        Alocacao a = new Alocacao();
        a.setHorasSemana(horasSemana);
        a.setValorHora(valorHora);
        a.setDataInicio(dataInicio);
        a.setDataFim(dataFim);
        a.setProjeto(projeto);
        a.setColaborador(colaborador);
        int erro = new AlocacaoDao().inserir(a);
        return erro;
    }
/*
    public int alterar(int id, BigDecimal horasSemana, BigDecimal valorHora, Date dataInicio, 
                                Date dataConclusao, Projeto projeto, Colaborador colaborador) {
        Alocacao a = new Alocacao();
        a.setIdAlocacao(id);
        a.setHorasSemana(horasSemana);
        a.setValorHora(valorHora);
        a.setDataInicio(dataInicio);
        a.setDataFim(dataConclusao);
        a.setProjeto(projeto);
        a.setColaborador(colaborador);
        int erro = new AlocacaoDao().alterar(a);
        return erro;
    }

    public int excluir(int id) {
        Alocacao a = new Alocacao();
        a.setIdAlocacao(id);
        int erro = new AlocacaoDao().excluir(a);
        return erro;
    }
*/
    public List<Alocacao> lstAlocacao() {
        AlocacaoDao pDao = new AlocacaoDao();
        return pDao.getLista();
    }
 /*  
    public List<Alocacao> getAlocacaoNome(String nome) {
        AlocacaoDao pDao = new AlocacaoDao();
        return pDao.getAlocacaoNome(nome);
    }
    
    public Projeto getAlocacaoId(int id) {
        AlocacaoDao pDao = new AlocacaoDao();
        return pDao.getAlocacaoId(id);
    }

    public List<Alocacao> getAlocacaoMatricula(String matricula) {
        AlocacaoDao pDao = new AlocacaoDao();
        return pDao.getAlocacaoMatricula(matricula);
    }
*/ 
}
