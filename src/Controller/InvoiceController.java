package Controller;

/**
 * Controller handles user input and communicates with the model
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import Model.InvoiceHeader;
import Model.InvoiceLine;
import Model.TableOfInvoice;
import Model.TableOfLines;
import View.MainFrame;


public class InvoiceController implements ActionListener, ListSelectionListener{
    private MainFrame invoiceFrame;
    public InvoiceController(MainFrame invoiceFrame)
    {
        this.invoiceFrame = invoiceFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String ActionCommand = e.getActionCommand();

        switch (ActionCommand){
            case"Create New Invoice":
                createNewInvoice();
                break;
            case"Delete Invoice":
                deleteInvoice();
                break;
            case"Create New Item":
                createNewItem();
                break;
            case"Delete Item":
                deleteItem();
                break;
            case"Load File":
                loadFile();
                break;
            case"Save File":
                saveFile();
                break;

        }

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int selectIndex= invoiceFrame.getTableOfInvoice().getSelectedRow();
        InvoiceHeader current = invoiceFrame.getInvoices().get(selectIndex);
        invoiceFrame.getInvoiceNumLabel().setText(""+current.getInvoiceNum());
        invoiceFrame.getInvoiceDateLabel().setText(current.getInvoiceDate());
        invoiceFrame.getCustomerNameLabel().setText(current.getCustomerName());
        invoiceFrame.getTotalOfInvoiceLabel().setText(""+current.getTotalOfInvoice());
        TableOfLines tableOfLines = new TableOfLines(current.getLine());
        invoiceFrame.getLineTable().setModel(tableOfLines);
        tableOfLines.fireTableDataChanged();
    }

    private void createNewInvoice() {

    }

    private void deleteInvoice() {

    }

    private void createNewItem() {

    }

    private void deleteItem() {

    }



    private void loadFile() {

        JFileChooser jfc =new JFileChooser();
        try{
            int action =jfc.showOpenDialog(invoiceFrame);
            if(action == JFileChooser.APPROVE_OPTION)
            {
                File hFile =jfc.getSelectedFile();
                Path hpath= Paths.get(hFile.getAbsolutePath());
                List<String> hLines= Files.readAllLines(hpath);
                ArrayList<InvoiceHeader> arrOfInvoices= new ArrayList<>();

                for( String hLine : hLines )
                {
                    String [] hparts =  hLine.split(",");
                    int invoiceNum = Integer.parseInt(hparts[0]);
                    String invoiceDate = hparts[1];
                    String cumName= hparts[2];
                    InvoiceHeader invoice = new InvoiceHeader(invoiceNum,invoiceDate,cumName);
                    arrOfInvoices.add(invoice);
                }
                action=jfc.showOpenDialog(invoiceFrame);
                if(action == JFileChooser.APPROVE_OPTION)
                {
                    File lFile =jfc.getSelectedFile();
                    Path hline= Paths.get(lFile.getAbsolutePath());
                    List<String> invoiceLines= Files.readAllLines(hline);
                    for (String invoiceLine : invoiceLines) {
                        String []lineParts = invoiceLine.split(",");
                        int invoiceNum = Integer.parseInt(lineParts[0]);
                        String itemName = lineParts[1];
                        double itemPrice = Double.parseDouble(lineParts[2]);
                        int count = Integer.parseInt(lineParts[3]);
                        InvoiceHeader invoices;
                        invoices = null;
                        for (InvoiceHeader invoice : arrOfInvoices) {
                            if (invoice.getInvoiceNum() == invoiceNum) {
                                invoices = invoice;
                                break;
                            }
                        }
                        InvoiceLine line=new InvoiceLine( itemName, count, itemPrice, invoices);
                        invoices.getLine().add(line);

                    }
                }
                invoiceFrame.setInvoices(arrOfInvoices);
                TableOfInvoice tableOfInvoice =new TableOfInvoice(arrOfInvoices);
                invoiceFrame.setTableOfTheInvoice(tableOfInvoice);
                invoiceFrame.getTableOfInvoice().setModel(tableOfInvoice);
                invoiceFrame.getTableOfTheInvoice().fireTableDataChanged();
            }
        } catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }

    private void saveFile() {
    }




}
