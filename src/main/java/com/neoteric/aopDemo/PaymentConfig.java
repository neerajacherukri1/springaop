package com.neoteric.aopDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {
   @Bean
    public PaymentService phonePe(){
        return  new PhonePe("from PhonePe Constructor");
    }


    @Bean
    public  PaymentService razorPay(){
       return  new RazorPay("from RazorPay Constructor");
    }




}