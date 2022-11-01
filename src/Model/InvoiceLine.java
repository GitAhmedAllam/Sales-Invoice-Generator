package Model;


public class InvoiceLine {

    private String Item;
    private int Count;
    private double Price;
    private InvoiceHeader Invoice;


    public InvoiceLine() {
    }

    public InvoiceLine(int Number, String Item, int Count, double Price) {
        this.Item = Item;
        this.Count = Count;
        this.Price = Price;
    }
    public double getTotalLine()
    {
        return Price * Count;
    }

    public InvoiceLine(String Item, int Count, double Price, InvoiceHeader Invoice) {
        this.Item = Item;
        this.Count = Count;
        this.Price = Price;
        this.Invoice = Invoice;
    }

    /**
     *
     * Add here the get and set methods
     */
    public InvoiceHeader getInvoice() {
        return Invoice;
    }


    public String getItem() {
        return Item;
    }

    public int getCount() {
        return Count;
    }

    public double getPrice() {
        return Price;
    }


    public void setItem(String Item) {
        this.Item = Item;
    }

    public void setCount(int Count) {
        this.Count = Count;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "LineClass{" + "No.=" + Invoice.getInvoiceNum() + ", Item=" + Item + ", Count=" + Count + ", Price=" + Price + "}";
    }



}
