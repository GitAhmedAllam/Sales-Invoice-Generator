package View;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Controller.InvoiceController;
import Model.InvoiceHeader;
import Model.TableOfInvoice;

/**
 The view displays data from the model to user
 */
public class MainFrame extends JFrame {

    private JLabel InvoiceNumLabel;
    private JButton createNewItem;
    private JButton createNewInvoice;
    private JLabel customerName;
    private JLabel customerNameLabel;
    private JButton deleteInvoice;
    private JButton deleteItem;
    private JLabel invoiceDate;
    private JLabel invoiceDateLabel;
    private JLabel invoiceNumber;
    private JMenu jMenu1;
    private JMenuBar jMenuBar1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTable lineTable;
    private JButton loadFile;
    private JButton saveFile;
    private JTable tableOfInvoice;
    private JLabel totalOfInvoice;
    private JLabel totalOfInvoiceLabel;
    private ArrayList<InvoiceHeader>Invoices;
    private Controller.InvoiceController InvoiceController = new InvoiceController(this) ;
    private TableOfInvoice tableOfTheInvoice;

    public MainFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableOfInvoice = new javax.swing.JTable();
        tableOfInvoice.getSelectionModel().addListSelectionListener(InvoiceController);
        createNewInvoice = new javax.swing.JButton();
        createNewInvoice.addActionListener(InvoiceController);
        deleteInvoice = new javax.swing.JButton();
        deleteInvoice.addActionListener(InvoiceController);
        invoiceNumber = new javax.swing.JLabel();
        invoiceDate = new javax.swing.JLabel();
        customerName = new javax.swing.JLabel();
        totalOfInvoice = new javax.swing.JLabel();
        InvoiceNumLabel = new javax.swing.JLabel();
        invoiceDateLabel = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        totalOfInvoiceLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lineTable = new javax.swing.JTable();
        createNewItem = new javax.swing.JButton();
        createNewItem.addActionListener(InvoiceController);
        deleteItem = new javax.swing.JButton();
        deleteItem.addActionListener(InvoiceController);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadFile = new javax.swing.JButton();
        loadFile.addActionListener(InvoiceController);
        saveFile = new javax.swing.JButton();
        saveFile.addActionListener(InvoiceController);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableOfInvoice.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
        jScrollPane1.setViewportView(tableOfInvoice);

        createNewInvoice.setText("Create New Invoice");

        deleteInvoice.setText("Delete Invoice");

        invoiceNumber.setText("InvoiceNumber");

        invoiceDate.setText("InvoiceDate");

        customerName.setText("CustomerName");

        totalOfInvoice.setText("TotalOfInvoice");

        lineTable.setModel(new DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
        jScrollPane2.setViewportView(lineTable);

        createNewItem.setText("Create New Item");

        deleteItem.setText("Delete Item");

        loadFile.setText("Load File");
        saveFile.setText("Save File");

        jMenu1.setText("File");

        loadFile.setText("Load File");
        jMenu1.add(loadFile);

        saveFile.setText("Save File");
        jMenu1.add(saveFile);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);


        /**
         * Group code from java doc
         */
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(createNewInvoice)
                                                .addGap(90, 90, 90)
                                                .addComponent(deleteInvoice))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(createNewItem)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                                                                .addComponent(deleteItem))
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                                .addGap(226, 226, 226))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(invoiceNumber)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(InvoiceNumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(customerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(customerNameLabel))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(totalOfInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(totalOfInvoiceLabel))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(invoiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(24, 24, 24)
                                                                .addComponent(invoiceDateLabel)))
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(invoiceNumber)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(InvoiceNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(invoiceDate)
                                                        .addComponent(invoiceDateLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(customerName)
                                                        .addComponent(customerNameLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(totalOfInvoice)
                                                        .addComponent(totalOfInvoiceLabel))
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(deleteItem)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(createNewItem)
                                                .addComponent(deleteInvoice)
                                                .addComponent(createNewInvoice)))
                                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });

    }



    public TableOfInvoice getTableOfTheInvoice() {
        return tableOfTheInvoice;
    }

    public void setTableOfTheInvoice(TableOfInvoice tableOfTheInvoice) {
        this.tableOfTheInvoice = tableOfTheInvoice;
    }

    public JTable getTableOfInvoice() {
        return tableOfInvoice;
    }


    public JTable getLineTable() {
        return lineTable;
    }

    public JLabel getInvoiceNumLabel() {
        return InvoiceNumLabel;
    }

    public JLabel getCustomerName() {
        return customerName;
    }

    public JLabel getCustomerNameLabel() {
        return customerNameLabel;
    }

    public JLabel getInvoiceDate() {
        return invoiceDate;
    }

    public JLabel getInvoiceDateLabel() {
        return invoiceDateLabel;
    }

    public JLabel getInvoiceNumber() {
        return invoiceNumber;
    }

    public JLabel getTotalOfInvoice() {
        return totalOfInvoice;
    }

    public JLabel getTotalOfInvoiceLabel() {
        return totalOfInvoiceLabel;
    }

    public Controller.InvoiceController getInvoiceController() {
        return InvoiceController;
    }




    public ArrayList<InvoiceHeader> getInvoices() {
        return Invoices;
    }

    public void setInvoices(ArrayList<InvoiceHeader> Invoices) {
        this.Invoices = Invoices;
    }

}


