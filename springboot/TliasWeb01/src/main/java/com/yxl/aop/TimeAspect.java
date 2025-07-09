//package com.yxl.aop;
//
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect //当前类为切面类
//@Slf4j
//public class TimeAspect {
//
//    @Pointcut("execution(* com.yxl.service.Impl.*.*(..))")
//    private void pt(){}
//    //切入点方法（公共的切入点表达式）
//
//    @Before("pt()")//前置通知
//    public void before(JoinPoint joinPoint){
//        String className = joinPoint.getTarget().getClass().getName();
//        String name = joinPoint.getSignature().getName();
//        //log.info("前置通知执行了在{}.{}",className,name);
//    }
//
//
//    @Around("@annotation(com.yxl.annotation.LogOperation)") //被这个注解标注的方法会执行这个环绕通知
//    public Object recordTime(ProceedingJoinPoint pjp) throws Throwable {
//        //记录方法执行开始时间
//        long begin = System.currentTimeMillis();
//        //执行原始方法
//        Object result = pjp.proceed();
//        //记录方法执行结束时间
//        long end = System.currentTimeMillis();
//        //计算方法执行耗时
//        log.info("被这个注解标注的方法会执行这个环绕通知方法执行耗时: {}毫秒",end-begin);
//        return result;
//    }
//
////    @After("pt()")
////    public void after(JoinPoint joinPoint){
////        log.info("后置方法after ...");
////    }
////
////    //返回后通知（程序在正常执行的情况下，会执行的后置通知）
////    @AfterReturning("pt()")
////    public void afterReturning(JoinPoint joinPoint){
////        log.info("返回后通知afterReturning ...");
////    }
////
////    //异常通知（程序在出现异常的情况下，执行的后置通知）
////    @AfterThrowing("pt()")
////    public void afterThrowing(JoinPoint joinPoint){
////        log.info("异常通知afterThrowing ...");
////    }
//}