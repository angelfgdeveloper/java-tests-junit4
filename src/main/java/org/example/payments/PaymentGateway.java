package org.example.payments;

// Pasarela de pago
public interface PaymentGateway {
     PaymentResponse requestPayment(PaymentRequest request);
}
