
package model;

import java.math.BigDecimal;
import java.util.Date;

public class Alocacao {
    private int idAlocacao;
    private Date dataInicio;
    private Date dataFim;
    private BigDecimal horasSemana;
    private BigDecimal valorHora;
    private Projeto projeto;
    private Colaborador colaborador;
    
    public Alocacao() {
        
    }

    public int getIdAlocacao() {
        return idAlocacao;
    }

    public void setIdAlocacao(int idAlocacao) {
        this.idAlocacao = idAlocacao;
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

    public BigDecimal getHorasSemana() {
        return horasSemana;
    }

    public void setHorasSemana(BigDecimal horasSemana) {
        this.horasSemana = horasSemana;
    }

    public BigDecimal getValorHora() {
        return valorHora;
    }

    public void setValorHora(BigDecimal valorHora) {
        this.valorHora = valorHora;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }
    
}
