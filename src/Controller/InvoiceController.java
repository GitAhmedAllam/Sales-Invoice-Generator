package Controller;

/**
 * Controller handles user input and communicates with the model
 */

import View.MyJFrames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class InvoiceController implements ActionListener, ListSelectionListener {


    private MyJFrames invframe;
    public InvoiceController(MyJFrames invframe)
    {
        this.invframe=invframe;
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }

    @Override
    public void valueChanged(ListSelectionEvent e) {

    }
}