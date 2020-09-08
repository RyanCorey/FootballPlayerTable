package Controller;

import Model.Model;
import View.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;

public class Controller
{

    Model model;
    View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        
        view.console("Columns: " + model.getPlayerModel().getColumnCount());
        view.console("Rows: " + model.getPlayerModel().getRowCount());
        
        view.TableSetup(model.getPlayerModel());
        
       //  addListeners();
    }

}
