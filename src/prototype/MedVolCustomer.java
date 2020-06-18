package prototype;

public class MedVolCustomer implements Customer {
    private String name;

    public MedVolCustomer(String s) {
        this.name = s;
    }

    @Override
    public void use(double d) {
        if(d >= 30)
            System.out.println("추가 할인 지불 없음");
        else
            System.out.println("삭제");
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
