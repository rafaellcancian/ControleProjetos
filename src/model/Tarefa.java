
package model;

import java.math.BigDecimal;
import java.util.Date;

public class Tarefa {
    private int idTarefa;
    private String descricao;
    private Date dataInicio;
    private Date dataFim;
    private String status;
    private BigDecimal previsaoHoras;
    private BigDecimal qtdHoras;
    private Colaborador colaborador;
    private Projeto projeto;
    
    public Tarefa() {
        
    }

    public int getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getPrevisaoHoras() {
        return previsaoHoras;
    }

    public void setPrevisaoHoras(BigDecimal previsaoHoras) {
        this.previsaoHoras = previsaoHoras;
    }

    public BigDecimal getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(BigDecimal qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
    
}
