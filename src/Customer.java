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

    public String getFullName() {
        return fullName;
    }
}
