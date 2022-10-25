package View;

import javax.swing.*;
import java.awt.*;

public class MyJFrames extends JFrame {

    private JButton loadFile;
    private JButton saveFile;
    private JButton createInvoice;
    private JButton deleteInvoice;
    private JTable invoice;

    private JTextField invoiceDate;
    private JTextField customerName;

    private JButton saveButton;
    private JButton cancelButton;

    public MyJFrames(){
        super("Sales Invoice Generator");
        this.Left();
        this.Right();

        setSize(800, 1000);
        setLocation(50,50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    /**
     * Group code from java doc, to be applied
     */
    private void GroupJFrames(){
//        layout.setHorizontalGroup(
//                layout.createSequentialGroup()
//                        .addComponent(c1)
//                        .addComponent(c2)
//                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                                .addComponent(c3)
//                                .addComponent(c4))
//        );
//        layout.setVerticalGroup(
//                layout.createSequentialGroup()
//                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                                .addComponent(c1)
//                                .addComponent(c2)
//                                .addComponent(c3))
//                        .addComponent(c4)
//        );
    }
    private void Left(){

//        setLayout(new GridLayout(2,1));
        this.InvoiceTable();
        this.LeftInvoiceButtons();
        pack();
    }

    private void Right(){
        this.InvoiceTextFields();
        this.InvoiceItemsTable();
        this.RightInvoiceButtons();
        pack();
    }

    /**
     * Load and Save buttons
      */

    private void FileButtons(){

//        setLayout(new FlowLayout());
        loadFile = new JButton("Load File");
        add(loadFile);
        setLayout(new FlowLayout());
        saveFile = new JButton("Save File");
        add(saveFile);

    }

    private void LeftInvoiceButtons(){

//        setLayout(new FlowLayout());
        createInvoice = new JButton("Create New Invoice");
        add(createInvoice);
        setLayout(new FlowLayout());
        deleteInvoice = new JButton("Delete Invoice");
        add(deleteInvoice);
    }

    /**
     *
     * The Table data
     */
    private String[] columns = {"Invoice Number", "Invoice Date" , "Customer Name", "Total Amount"};

    //the data that appears in the table
    private String[][] data = {
            {"001" , "25/10/2022" , "Allam Corp", "10,000 USD"}
    };

    private void InvoiceTable(){
        JTable invoiceTable = new JTable();
        invoiceTable.setName("Invoice Details");
        //add the table to the view and add a scroll action
        invoice = new JTable(data, columns);
        add(invoice);
        add(new JScrollPane((invoice)));

        setSize(400, 500);
        setLocation(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    /**
     *
     * The Items Table
     */
    private String[] itemsColumns = {"Invoice No", "Item Name" , "Item Price", "Item Total"};

    //the data that appears in the table
    private String[][] itemsData = {
            {"001" , "test" , "10,000 USD", "10,000 USD"}
    };

    private void InvoiceItemsTable(){
        JTable invoiceTable = new JTable();
        invoiceTable.setName("Invoice Items");
        //add the table to the view and add a scroll action
        invoice = new JTable(data, columns);
        add(invoice);
        add(new JScrollPane((invoice)));

        setSize(400, 500);
        setLocation(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    private void InvoiceTextFields() {

        invoiceDate = new JTextField(15);
        add(new JLabel("Invoice Date"));
        add(invoiceDate);
        setSize(400, 500);
        setLocation(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        customerName = new JTextField(15);
        add(new JLabel("Customer Name"));
        add(customerName);
        setSize(400, 500);
        setLocation(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    private void RightInvoiceButtons(){

        setLayout(new FlowLayout());
        saveButton = new JButton("Save");
        add(saveButton);
        setLayout(new FlowLayout());
        cancelButton = new JButton("Cancel");
        add(cancelButton);
    }


}
