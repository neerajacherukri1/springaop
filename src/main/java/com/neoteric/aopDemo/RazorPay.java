package com.neoteric.aopDemo;

public class RazorPay implements PaymentService{
    public RazorPay(String fromSource) {
    }

    @Override
    public String pay(double amount) {
        return "Paid ₹" + amount + " via RazorPay";
    }
}
