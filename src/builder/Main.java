package builder;

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        User user = builder.setFirstName("태웅").setLastName("김").build();
        System.out.println(user.getFirstName() + " " + user.getLastName());
    }
}
