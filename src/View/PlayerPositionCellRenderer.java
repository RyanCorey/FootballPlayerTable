package View;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

import Model.PlayerPosition;

public class PlayerPositionCellRenderer extends DefaultTableCellRenderer {

    public PlayerPositionCellRenderer() {

    }
    
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        if (value instanceof PlayerPosition){
            PlayerPosition position = (PlayerPosition) value;
            setText(position.toString());
        }
        
        this.setToolTipText("Click the cell to change the player's position");
        return this;
    }

}
