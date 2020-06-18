package responsibility_chain.dispenser;

public class Coin20Dispenser implements DispenseChain {
    private DispenseChain chain;

    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount()>=20){
            int num=cur.getAmount()/20;
            int remainder=cur.getAmount()%20;

            System.out.println("Dispensing " +num+" 20$");

            if(remainder!=0) this.chain.dispense(new Currency(remainder));
        }
        else this.chain.dispense(cur);
    }

}

class Coin10Dispenser implements DispenseChain {
    private DispenseChain chain;

    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount()>=10){
            int num=cur.getAmount()/10;
            int remainder=cur.getAmount()%10;

            System.out.println("Dispensing " +num+" 10$");

            if(remainder!=0) this.chain.dispense(new Currency(remainder));
        }
        else this.chain.dispense(cur);
    }
}
