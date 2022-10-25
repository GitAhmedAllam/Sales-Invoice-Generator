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

    /**
     *
     * @This is the ArrayLis code to hold the invoices details
     */
//    Invoice1Num
//{
//Invoice1Date (DD/MM/YYYY), Customer1Name
//Item1Name, Item1Price, Count1
//Item2Name, Item2Price, Count2
//Item3Name, Item3Price, Count3
//.
//.
//.
//}
//
//Invoice2Num
//{
//Invoice2Date (DD/MM/YYYY), Customer2Name
//Item1Name, Item1Price, Count1
//Item2Name, Item2Price, Count2
//.
//.
//.
//}

/**
 *
 * Below The Get and Set for the private fields
 */
    public int getinvoiceNum() {
        return invoiceNum;
    }

    public String getinvoiceDate() {
        return invoiceDate;
    }

    public String getcustomerName() {
        return customerName;
    }

    public void setinvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public void setinvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public void setcustomerName(String customerName) {
        this.customerName = customerName;
    }



}
