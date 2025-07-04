package com.yxl.aop;

import com.yxl.mapper.OperateLogMapper;
import com.yxl.pojo.OperateLog;
import com.yxl.utils.CurrentHolder;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;

/****
 * 1、创建日志表
 * 2、创建Pojo、Mapper
 * 3、定义切面类OperationLogAspect，切面类中定义环绕通知@Around
 * 4、在@Around中创建日志操作对象，并完善数据(赋值)   切入点表达式：execution || @annotation
 *      1）方法信息（方法名字、方法所在的类、方法参数、方法返回值、方法执行耗时）
 *      2）操作人（登录系统的用户-JWT令牌）
 * 5、将完善的日志对象添加到数据库中
 */
@Slf4j
@Component
@Aspect
public class OperationLogAspect {
    @Autowired
    private OperateLogMapper operateLogMapper;
    /***
     * 定义切面类OperationLogAspect，切面类中定义环绕通知@Around
     */
    /***
     * 在@Around中创建日志操作对象，并完善数据(赋值)   切入点表达式：execution || @annotation
     *    1）方法信息（方法名字、方法所在的类、方法参数、方法返回值、方法执行耗时）
     *    2）操作人（登录系统的用户-JWT令牌）
     */
    @Around("execution(* com.yxl.controller.*.delete*(..)) || execution(* com.yxl.controller.*.post*(..)) || execution(* com.yxl.controller.*.put*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = pjp.proceed();
        long end = System.currentTimeMillis();
        OperateLog operateLog = new OperateLog();
        operateLog.setOperateEmpId(CurrentHolder.getId());//操作人ID
        operateLog.setOperateTime(LocalDateTime.now());//操作时间
        operateLog.setClassName(pjp.getTarget().getClass().getName());//操作类名
        operateLog.setMethodName(pjp.getSignature().getName());//操作方法名
        operateLog.setMethodParams(Arrays.toString(pjp.getArgs()));//操作方法参数,获取过来是数组要转换String
        operateLog.setCostTime(end-start);//操作耗时
        operateLog.setReturnValue(result.toString());//操作方法返回值
        operateLogMapper.insert(operateLog);
        log.info("{}.{}方法执行了,执行时间是{}毫秒",pjp.getTarget().getClass().getName(),pjp.getSignature().getName(),end-start);
        return result;
    }





}
