
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

    public List<Alocacao> lstAlocacao() {
        AlocacaoDao pDao = new AlocacaoDao();
        return pDao.getLista();
    }
    
}
