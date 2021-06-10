
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Alocacao;

public class AlocacaoTableModel extends AbstractTableModel {
    private List<Alocacao> lstAlocacao;
    
    public AlocacaoTableModel() {
        lstAlocacao = new ArrayList<Alocacao>();
    }
    
    public AlocacaoTableModel(List<Alocacao> lista) {
        this();
        lstAlocacao.addAll(lista);
    }

    @Override
    public int getRowCount() {
        return lstAlocacao.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "idAlocacao";
            case 1: return "dataInicio";
            case 2: return "dataFim";
            default: return "";
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Alocacao p = lstAlocacao.get(rowIndex);
        if (columnIndex == 0) {
            return p.getIdAlocacao();
        } else if (columnIndex == 1) {
            return p.getDataInicio();
        }
        return "";
    }
    
    public Alocacao getAlocacao(int pos) {
        if (pos >= lstAlocacao.size()) {
            return null;
        }
        return lstAlocacao.get(pos);
    }
    
}
