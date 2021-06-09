
package controller;

import dao.ProjetoDao;
import java.util.Date;
import java.util.List;
import model.Cliente;
import model.Colaborador;
import model.Projeto;

public class ProjetoController {

    public int incluir(String matricula, String nome, String escopo, Date dataInicio, Date dataPrevConclusao, Date dataConclusao, int tipoCliente, Cliente cliente, Colaborador lider) {
        Projeto p = new Projeto();
        p.setMatricula(matricula);
        p.setNome(nome);
        p.setEscopo(escopo);
        p.setDataInicio(dataInicio);
        p.setDataPrevConclusao(dataPrevConclusao);
        p.setDataConclusao(dataConclusao);
        p.setTipoCliente(tipoCliente);
        p.setCliente(cliente);
        p.setLider(lider);
        int erro = new ProjetoDao().inserir(p);
        return erro;
    }

    public int alterar(int id, String matricula, String nome, String escopo, Date dataInicio, Date dataPrevConclusao, Date dataConclusao, int tipoCliente, Cliente cliente, Colaborador lider) {
        Projeto p = new Projeto();
        p.setIdProjeto(id);
        p.setMatricula(matricula);
        p.setNome(nome);
        p.setEscopo(escopo);
        p.setDataInicio(dataInicio);
        p.setDataPrevConclusao(dataPrevConclusao);
        p.setDataConclusao(dataConclusao);
        p.setTipoCliente(tipoCliente);
        p.setCliente(cliente);
        p.setLider(lider);
        int erro = new ProjetoDao().alterar(p);
        return erro;
    }

    public int excluir(int id) {
        Projeto p = new Projeto();
        p.setIdProjeto(id);
        int erro = new ProjetoDao().excluir(p);
        return erro;
    }

    public List<Projeto> lstProjeto() {
        ProjetoDao pDao = new ProjetoDao();
        return pDao.getLista();
    }
    
    public List<Projeto> getProjetoNome(String nome) {
        ProjetoDao pDao = new ProjetoDao();
        return pDao.getProjetoNome(nome);
    }
    
    public Projeto getProjetoId(int id) {
        ProjetoDao pDao = new ProjetoDao();
        return pDao.getProjetoId(id);
    }

    public List<Projeto> getProjetoMatricula(String matricula) {
        ProjetoDao pDao = new ProjetoDao();
        return pDao.getProjetoMatricula(matricula);
    }
    
}
