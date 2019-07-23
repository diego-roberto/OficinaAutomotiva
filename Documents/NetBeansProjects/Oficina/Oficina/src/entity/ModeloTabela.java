package entity;

import javax.swing.table.AbstractTableModel;

public class ModeloTabela extends AbstractTableModel {

    protected String[] columns;
    protected Object[][] rows;

    public ModeloTabela(String[] columns, Object[][] rows) {
        this.columns = columns;
        this.rows = rows;
    }

    @Override
    public int getRowCount() {
        return this.rows.length;
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.rows[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int coluna) {
        return columns[coluna];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public Class getColumnClass(int coluna) {
        return getValueAt(0, coluna).getClass();
    }
}
