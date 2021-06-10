
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Colaborador;

public class ColaboradorTableModel extends AbstractTableModel {
    private List<Colaborador> lstColaborador;
    
    public ColaboradorTableModel() {
        lstColaborador = new ArrayList<Colaborador>();
    }
    
    public ColaboradorTableModel(List<Colaborador> lista) {
        this();
        lstColaborador.addAll(lista);
    }

    @Override
    public int getRowCount() {
        return lstColaborador.size();
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
        Colaborador p = lstColaborador.get(rowIndex);
        if (columnIndex == 0) {
            return p.getNome();
        } else if (columnIndex == 1) {
            return p.getMatricula();
        }
        return "";
    }
    
    public Colaborador getColaborador(int pos) {
        if (pos >= lstColaborador.size()) {
            return null;
        }
        return lstColaborador.get(pos);
    }
}
