package model;

public class Customer {

    private int customerId;
    private String fullName;
    private String phone;
    private String email;
    private String idCard;

    public Customer(int customerId, String fullName, String phone, String email, String idCard) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.idCard = idCard;
    }

    public int getCustomerId() {
        return this.customerId;
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

    public String getIdCard() {
        return this.idCard;
    }

    public String getContactInfo() {
        return this.fullName + " - " + this.phone + " - " + this.email;
    }
}
