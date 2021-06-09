
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Projeto;

public class ProjetoTableModel extends AbstractTableModel {
    private List<Projeto> lstProjeto;
    
    public ProjetoTableModel() {
        lstProjeto = new ArrayList<Projeto>();
    }
    
    public ProjetoTableModel(List<Projeto> lista) {
        this();
        lstProjeto.addAll(lista);
    }

    @Override
    public int getRowCount() {
        return lstProjeto.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Nome";
            case 1: return "Matrícula";
            default: return "";
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Projeto p = lstProjeto.get(rowIndex);
        if (columnIndex == 0) {
            return p.getNome();
        } else if (columnIndex == 1) {
            return p.getMatricula();
        }
        return "";
    }
    
    public Projeto getProjeto(int pos) {
        if (pos >= lstProjeto.size()) {
            return null;
        }
        return lstProjeto.get(pos);
    }
    
}
