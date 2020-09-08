package Model;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class FootballPlayerModel extends AbstractTableModel {

    String[] columnNames; //  = new String[] {"Name","Age","Address", "Credits"};

    ArrayList<FootballPlayer> data = new ArrayList();

    public FootballPlayerModel(FootballPlayerData fpdata) {
        this.data = fpdata.getTable();
        this.columnNames = new String[]{"number", "position", "name", "height", "weight", "hometown", "highSchool"};
        System.out.println(this.getColumnName(0));
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    //TODO Override getColumnClass function
    @Override
    public Class getColumnClass(int column) {
        return getValueAt(0, column).getClass();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        FootballPlayer fp = data.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return fp.getNumber();
            case 1:
                return fp.getPosition();
            case 2:
                return fp.getName();
            case 3:
                return fp.getHeight();
            case 4:
                return fp.getWeight();
            case 5:
                return fp.getHometown();
            case 6:
                return fp.getHighSchool();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    //TODO Override setValueAt Function(Object value, int rowIndex, int columnIndex)
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        FootballPlayer player = data.get(rowIndex);

        switch (columnIndex) {
            case 1:
                player.setPosition((PlayerPosition) value);
                break;
        }

    }

    //TODO write isCellEditable Function
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 1;
    }

}
