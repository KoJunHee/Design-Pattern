package builder;

public class UserInfoBuilder {
    // required
    private String firstName;
    private String lastName;

    // optional
    private int age;
    private String phone;
    private String address;

    public UserInfoBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserInfoBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserInfoBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserInfoBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserInfoBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public UserInfo build() {
        UserInfo userInfo = new UserInfo(firstName, lastName, age, phone, address);
        return userInfo;
    }
}