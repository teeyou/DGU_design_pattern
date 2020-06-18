package prototype;

public class LoVolCustomer implements Customer {
    private String name;

    public LoVolCustomer(String s) {
        this.name = s;
    }

    @Override
    public void use(double d) {
        System.out.println("서비스 요금 $10 청구");
    }

    @Override
    public Customer createClone() {
        Customer customer = null;
        try {
            customer = (Customer) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return customer;
    }
}
