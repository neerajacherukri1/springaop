package com.neoteric.aopDemo;

public class PhonePe implements PaymentService{

    public PhonePe(String fromSource) {
    }

    @Override
    public String pay(double amount) {
        return "Paid ₹" + amount + " via PhonePay";
    }
}
