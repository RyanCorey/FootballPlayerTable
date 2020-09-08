package View;

import Model.PlayerPosition;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.AbstractCellEditor;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class PositionCellEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {

    private PlayerPosition position;
    private ArrayList<PlayerPosition> positionOptions;

    public PositionCellEditor() {
        this.positionOptions = positionOptions;

    }

    @Override
    public Object getCellEditorValue() {
        return this.position;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.positionOptions = new ArrayList<>();
        this.positionOptions.add(new PlayerPosition("S"));
        this.positionOptions.add(new PlayerPosition("CB"));
        this.positionOptions.add(new PlayerPosition("LB"));
        this.positionOptions.add(new PlayerPosition("RB"));
        this.positionOptions.add(new PlayerPosition("DT"));
        this.positionOptions.add(new PlayerPosition("G/C"));
        this.positionOptions.add(new PlayerPosition("T"));
        this.positionOptions.add(new PlayerPosition("WR"));
        this.positionOptions.add(new PlayerPosition("PK"));
        this.positionOptions.add(new PlayerPosition("TE/H"));
        this.positionOptions.add(new PlayerPosition("DE"));
        this.positionOptions.add(new PlayerPosition("DT"));
        this.positionOptions.add(new PlayerPosition("SN"));
        this.positionOptions.add(new PlayerPosition("K/P"));
        this.positionOptions.add(new PlayerPosition("QB"));
        this.positionOptions.add(new PlayerPosition("K"));
        this.positionOptions.add(new PlayerPosition("P"));
        this.positionOptions.add(new PlayerPosition("G"));
        this.positionOptions.add(new PlayerPosition("C"));

        if (value instanceof PlayerPosition) {
            this.position = (PlayerPosition) value;
        }

        JComboBox positionCombo = new JComboBox();

        for (PlayerPosition p : positionOptions) {
            positionCombo.addItem(p);
        }

        positionCombo.setSelectedItem(position);
        positionCombo.addActionListener(this);

        return positionCombo;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox positionCombo = (JComboBox) e.getSource();
        this.position = (PlayerPosition) positionCombo.getSelectedItem();
    }

}
