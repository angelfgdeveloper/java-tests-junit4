package org.example.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;

    // Metodos comunes
    @Before // Para ejecutar antes de que inicien los metodos TESTs
    public void setup() {
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    @Test
    public void payment_is_correct() {

        // 1. PREPARACION DEL ESCENARIO
        // Simular interface
        // PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        // Haciendo una simulacion de que es una respuesta correcta
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        // PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

        // 2. LLAMADA DEL METODO QUE QUEREMOS PROBAR
        // Comprobar que sea True
        boolean result = paymentProcessor.makePayment(1000); // Si se procesa el pago

        // 3. COMPROBACION DE LA RESPUESTA ESPERADA
        assertTrue(result);
    }

    @Test
    public void payment_is_wrong() {
        // Simular interface
        // PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);

        // Haciendo una simulacion de que es una respuesta correcta
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        // PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

        // Comprobar que sea True
        boolean result = paymentProcessor.makePayment(1000); // Si se procesa el pago
        assertFalse(result);
    }

}