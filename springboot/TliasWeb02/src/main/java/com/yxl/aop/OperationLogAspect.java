package com.yxl.aop;

import com.yxl.mapper.OperateLogMapper;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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



}
