package ua.edu.ucu.apps.flowerstore.paymant;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @GetMapping
    public List<Payment> getPayment() {
        return List.of(new CreditCardPaymentStrategy());
    }
}