package model;

public class BillAcceptor implements PaymentAcceptor {
    private int amount;

    public BillAcceptor(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
