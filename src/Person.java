public class Person {
    private String fullName;
    private String phone;
    private String email;

    public Person(String fullName, String phone, String email) {
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }

    public String getContactInfo() {
        return this.fullName + " - " + this.phone + " - " + this.email;
    }

    // toString
    @Override
    public String toString() {
        return this.getContactInfo();
    }
}
