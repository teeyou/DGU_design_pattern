package responsibility_chain.dispenser;

public class Main {
    public static void main(String[] args) {
        DispenseChain c1 = new Coin20Dispenser();

        DispenseChain c2 = new Coin10Dispenser();
        c1.setNextChain(c2);

        int amount = 90;
        c1.dispense(new Currency(amount));

    }
}
