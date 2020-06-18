package builder;

public class Builder {
    private String firstName; // required
    private String lastName; // required
    private int age; // optional
    private String phone; // optional
    private String address;  //optional

    public Builder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Builder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Builder setAddress(String address) {
        this.address = address;
        return this;
    }

    public User build() {
        return new User(firstName,lastName,age,phone,address);
    }
}
