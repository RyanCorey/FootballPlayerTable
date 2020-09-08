package View;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

import Model.FootballPlayerModel;

public class View
{

    private MainFrame mf;
    private TablePanel tp;

    public View(){
        mf = new MainFrame();
        tp = new TablePanel();
        mf.add(tp, BorderLayout.CENTER);
        mf.setVisible(true);
    }

    public void console(String text){
        System.out.println(text);
    }
    
    public void TableSetup(FootballPlayerModel dataModel) {
    	System.out.println("Rows:" + dataModel.getRowCount());
    	this.tp.table.setModel(dataModel);
    }
}