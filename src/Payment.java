package model;

import java.time.LocalDate;

public class Payment {
    private int paymentId;
    private Invoice invoice;
    private PaymentMethod paymentMethod;
    private LocalDate paymentDate;
    private PaymentStatus paymentStatus;

    public Payment(int paymentId, Invoice invoice, PaymentMethod method) {
        this.paymentId = paymentId;
        this.invoice = invoice;
        this.paymentMethod = method;
        this.paymentDate = LocalDate.now();
        this.paymentStatus = PaymentStatus.SUCCESS;
    }
    public int getPaymentId() {
        return this.paymentId;
    }
    public Invoice getInvoice() {
        return this.invoice;
    }
    public PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }
    public LocalDate getPaymentDate() {
        return this.paymentDate;
    }
    public PaymentStatus getPaymentStatus() {
        return this.paymentStatus;
    }
}
