package com.neoteric.aopDemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class PaymentLoggingAspect {

@Before("execution(*com.neoteric.aopDemo.PaymentService.pay(..))")
    public void logBeforePayment(JoinPoint joinpoint){
        System.out.println("Starting payment using: "+ joinpoint.getTarget().getClass().getSimpleName());
    }


    @AfterReturning(pointcut="execution(*com.neoteric.aopDemo.PaymentService.pay(..))",returning = "result")
     public  void logAfterPayment(Object result){

    System.out.println("Payment completed successfully: " + result);


    }


}
