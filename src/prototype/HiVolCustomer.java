package prototype;

public class HiVolCustomer implements Customer{
    private String name;

    public HiVolCustomer(String s) {
        this.name = s;
    }

    @Override
    public void use(double d) {
        double value = 0;
        if(d > 2000) {
            value = d * 0.95;
            System.out.println("5%추가 할인 받음 " + value);
        }

        else if(d < 50) {
            System.out.println("5% 더 지불해야 한다.");
        }
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
