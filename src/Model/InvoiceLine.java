package Model;

public class InvoiceLine {

    private String itemName;
    private double itemPrice;
    private int count;
    private InvoiceHeader Invoice;


    public InvoiceLine() {
    }

    public InvoiceLine(int Number, String itemName, int count, double itemPrice) {
        this.itemName = itemName;
        this.count = count;
        this.itemPrice = itemPrice;
    }
    public double getTotalLine()
    {
        return itemPrice * count;
    }

    public InvoiceLine( String itemName, int count, double itemPrice, InvoiceHeader Invoice) {
        this.itemName = itemName;
        this.count = count;
        this.itemPrice = itemPrice;
        this.Invoice = Invoice;
    }

    /**
     *
     * Add here the get and set methods
     */
    public InvoiceHeader getInvoice() {
        return Invoice;
    }

    public String getitemName() {
        return itemName;
    }

    public int getcount() {
        return count;
    }

    public double getitemPrice() {
        return itemPrice;
    }


    public void setitemName(String itemName) {
        this.itemName = itemName;
    }

    public void setcount(int count) {
        this.count = count;
    }

    public void setitemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }


}

