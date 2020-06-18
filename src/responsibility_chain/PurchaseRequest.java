package responsibility_chain;

public class PurchaseRequest {
    private final double amount;

    public PurchaseRequest(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
