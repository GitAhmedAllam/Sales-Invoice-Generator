package Model;

import javax.swing.event.EventListenerList;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
public class TableOfLines extends AbstractTableModel{


        private ArrayList<InvoiceLine> Lines ;
        private String[] columns = {"Number", "Item Name", "Item Price", "Count", "Item Total"};

        public ArrayList<InvoiceLine> getLines() {
            return Lines;
        }

        public EventListenerList getListenerList() {
            return listenerList;
        }

        public TableOfLines(ArrayList<InvoiceLine> Lines) {
            this.Lines = Lines;
        }


        @Override
        public int getRowCount() {
            return Lines.size();
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

            InvoiceLine line = Lines.get(rowIndex);

            switch (columnIndex) {
                case 0: return line.getInvoice().getInvoiceNum();
                case 1: return line.getItem();
                case 2: return line.getPrice();
                case 3: return line.getCount();
                case 4: return line.getTotalLine();
                default : return "";
            }
        }



}
