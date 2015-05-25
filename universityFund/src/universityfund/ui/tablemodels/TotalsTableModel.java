/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.ui.tablemodels;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tan
 */
public abstract class TotalsTableModel extends AbstractTableModel {

    protected String[] columnNames;
    protected Object[][] dataArray;
    protected List<Object> rows;

    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return dataArray[rowIndex][columnIndex];
    }
    
}
