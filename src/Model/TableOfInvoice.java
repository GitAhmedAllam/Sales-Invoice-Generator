package Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class TableOfInvoice extends AbstractTableModel {
    private ArrayList<InvoiceHeader>Invoices ;

    private String[] columns = {"Number", "Date", "Customer", "Total"};

    public TableOfInvoice(ArrayList<InvoiceHeader> Invoices) {
        this.Invoices = Invoices;
    }


    @Override
    public int getRowCount() {


        return Invoices.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }
    public String getColumnName(int column)
    {
        return columns[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceHeader invoice = Invoices.get(rowIndex);

        switch (columnIndex) {
            case 0: return invoice.getInvoiceNum();
            case 1: return invoice.getInvoiceDate();
            case 2: return invoice.getCustomerName();
            case 3: return invoice.getTotalOfInvoice();
            default : return "";
        }
    }
}
