package model;

import enums.PaymentMethod;
import enums.PaymentStatus;
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
}
