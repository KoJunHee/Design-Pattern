package builder;

public class UserInfo {
    // required
    private String firstName;
    private String lastName;

    // optional
    private int age;
    private String phone;
    private String address;

    public UserInfo(String firstName, String lastName, int age, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserInfo() {
        String userInfo = String.format
                ("firstName:%s, lastName:%s, age:%d, phone:%s, address:%s",
                        this.firstName, this.lastName, this.age, this.phone, this.address);
        return userInfo;
    }
}
