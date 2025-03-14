class Purchase {
    private int invNumber;
    private double saleAmt;
    private double salesTax;

    public Purchase(int inv, double amount) {
        setInvoiceNumber(inv);
        setSaleAmount(amount);
    }

    public void setInvoiceNumber(int num) {
        invNumber = num;
    }

    public void setSaleAmount(double amt) {
        saleAmt = amt;
        salesTax = saleAmt * 0.05; 
    }

    public void displayPurchase() {
        System.out.println("Invoice Number: " + invNumber);
        System.out.println("Sale Amount: $" + saleAmt);
        System.out.println("Sales Tax: $" + salesTax);
        System.out.println("--------------------------");
    }
}