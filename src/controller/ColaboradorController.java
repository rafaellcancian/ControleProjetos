
package controller;

import dao.ColaboradorDao;
import java.util.Date;
import java.util.List;
import model.Colaborador;

public class ColaboradorController {

    public int incluir(String matricula, String nome, Date dataAdmissao, Date dataDesligamento) {
        Colaborador c = new Colaborador();
        c.setMatricula(matricula);
        c.setNome(nome);
        c.setDataAdmissao(dataAdmissao);
        c.setDataDesligamento(dataDesligamento);
        int erro = new ColaboradorDao().inserir(c);
        return erro;
    }

    public int alterar(int id, String matricula, String nome, Date dataAdmissao, Date dataDesligamento) {
        Colaborador c = new Colaborador();
        c.setIdColaborador(id);
        c.setMatricula(matricula);
        c.setNome(nome);
        c.setDataAdmissao(dataAdmissao);
        c.setDataDesligamento(dataDesligamento);
        int erro = new ColaboradorDao().alterar(c);
        return erro;
    }

    public int excluir(int id) {
        Colaborador c = new Colaborador();
        c.setIdColaborador(id);
        int erro = new ColaboradorDao().excluir(c);
        return erro;
    }

    public List<Colaborador> lstColaborador() {
        ColaboradorDao cDao = new ColaboradorDao();
        return cDao.getLista();
    }
    
    public List<Colaborador> getColaboradorNome(String nome) {
        ColaboradorDao cDao = new ColaboradorDao();
        return cDao.getColaboradorNome(nome);
    }
    
    public Colaborador getColaboradorId(int id) {
        ColaboradorDao cDao = new ColaboradorDao();
        return cDao.getColaboradorId(id);
    }

    public List<Colaborador> getColaboradorMatricula(String matricula) {
        ColaboradorDao cDao = new ColaboradorDao();
        return cDao.getColaboradorMatricula(matricula);
    }
    
}
