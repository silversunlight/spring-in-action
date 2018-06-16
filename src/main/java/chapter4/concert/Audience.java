package chapter4.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    @Pointcut("execution(* *chapter4.concert.Performance.perform())")
    public void performance() {
    }

//    @Before("performance()")
//    public void silenceCellPhones() {
//        System.out.println("Silencing cell phones");
//    }
//
//    @Before("performance()")
//    public void takeSeats() {
//        System.out.println("Taking seats");
//    }
//
//    @AfterReturning("performance()")
//    public void applause() {
//        System.out.println("clap hands");
//    }
//
//    @AfterThrowing("performance()")
//    public void demandRefund() {
//        System.out.println("Demanding a refund");
//    }

    @Around("performance()")
    public void watchBeforePerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("Silence cell phones");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("chap hands");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund");
        }
    }
}
