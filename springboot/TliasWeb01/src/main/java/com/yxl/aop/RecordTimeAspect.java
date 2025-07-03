//package com.yxl.aop;
//
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.stereotype.Component;
//
//@Slf4j
//@Aspect//声明当前为切面类
//@Component
//public class RecordTimeAspect {
//
//    @Around("execution(* com.yxl.service.Impl.*.*(..))")
//            //修饰符（省略）返回值* 包名.类名.方法名.()
//    public Object recordTime(ProceedingJoinPoint pjp) throws Throwable {
//        //记录方法执行开始时间
//        long begin = System.currentTimeMillis();
//        //执行原始方法
//        String name = pjp.getSignature().getName();
//        Object result = pjp.proceed();
//        //记录方法执行结束时间
//        long end = System.currentTimeMillis();
//        //计算方法执行耗时
//        log.info("{}方法执行耗时: {}毫秒",name,end-begin);
//        return result;
//
//    }
//
//
//}
