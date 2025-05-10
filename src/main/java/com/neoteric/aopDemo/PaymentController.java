package com.neoteric.aopDemo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private  final PaymentService phonePe;

    private  final PaymentService razorPay;


    public PaymentController(PaymentService phonePe, PaymentService razorPay) {
        this.phonePe = phonePe;
        this.razorPay = razorPay;
    }

    @RequestMapping("/payWithPhonePe")
    public String payWithPhonePe(@RequestParam double amount){
        return  phonePe.pay(amount);


    }
@RequestMapping("/payWithRazorPay")
    public  String payWithRazorPay(@RequestParam double amount){
        return  razorPay.pay(amount);
    }
}
