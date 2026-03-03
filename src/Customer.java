package model;

public class Customer extends Person {
    private int customerId;
    private String idCard;

    public Customer(int customerId, String fullName, String phone,
                    String email, String idCard) {
        super(fullName, phone, email);
        this.customerId = customerId;
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Customer | "
                + super.getContactInfo()
                + " | CustomerID: " + this.customerId
                + " | IDCard: " + this.idCard;
    }
}
