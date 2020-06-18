package responsibility_chain.dispenser;

public class Currency{
    private int amount;

    public Currency(int amt) {
        this.amount=amt;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

interface DispenseChain{
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency cur);
}
