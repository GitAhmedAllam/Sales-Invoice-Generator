package Model;

import java.util.ArrayList;


public class InvoiceHeader {
    private int invoiceNum;
    private String invoiceDate;
    private String customerName;
    private ArrayList<InvoiceLine> Line ;

    public InvoiceHeader() {

    }


    public InvoiceHeader(int invoiceNum, String invoiceDate, String customerName) {
        this.invoiceNum = invoiceNum;
        this.invoiceDate = invoiceDate;
        this.customerName = customerName;
    }

    public double getTotalOfInvoice()
    {
        double total =0.0;
        for(InvoiceLine line : getLine())
        {
            total +=line.getTotalLine();
        }
        return total;
    }

    /**
     *
     * @This is the ArrayLis code to hold the invoices details
     */

    public ArrayList<InvoiceLine> getLine() {
        if(Line == null)
        {
            Line=new ArrayList<>();
        }
        return Line;
    }


    public int getInvoiceNum() {
        return invoiceNum;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setInvoiceNum(int Number) {
        this.invoiceNum = Number;
    }

    public void setInvoiceDate(String Date) {
        this.invoiceDate = Date;
    }

    public void setCustomerName(String Customer) {
        this.customerName = Customer;
    }

    @Override
    public String toString() {
        return "InvoiceClass{" + "No.=" + invoiceNum + ", Date=" + invoiceDate + ", Customer=" + customerName + ", Line=" + Line + "}";
    }


}
