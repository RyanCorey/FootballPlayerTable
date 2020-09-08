package View;

import Model.Model;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Model.PlayerPosition;

public class TablePanel extends JPanel {
	
	JTable table; 

	public TablePanel() {
		super();
        setBackground(Color.darkGray);
        setLayout(new BorderLayout());
          
        // Initializing the JTable 
        table = new JTable(); 
        table.setFillsViewportHeight(true);
        
        // Set the Cell Renderer
        table.setDefaultRenderer(Object.class, new FootballPlayerCellRenderer());
        
        // TODO set the Default Renderer for the PlayerPosition Class
        table.setDefaultRenderer(PlayerPosition.class, new PlayerPositionCellRenderer());
        // TODO set the Default Editor for the PlayerPosition Class
        table.setDefaultEditor(PlayerPosition.class, new PositionCellEditor());
        // TODO Add 1 line of code to enable Row Sorting on the table
        table.setAutoCreateRowSorter(true);
  
        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(table);
        // Using the borderlayout makes the ScrollPane fit the size of the TablePanel
        this.add(sp, BorderLayout.CENTER);  	
    }


}
