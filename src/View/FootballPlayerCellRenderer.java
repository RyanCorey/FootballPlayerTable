package View;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

import Model.PlayerPosition;

public class FootballPlayerCellRenderer implements TableCellRenderer {

    public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();

    public FootballPlayerCellRenderer() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
            int row, int column) {

        Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Apply zebra style on table rows
        if (row % 2 == 0) {
            c.setBackground(Color.WHITE);
        } else {
            c.setBackground(Color.decode("#f7f7f7"));
        }

        c.setForeground(Color.darkGray);

        return c;
    }

}
