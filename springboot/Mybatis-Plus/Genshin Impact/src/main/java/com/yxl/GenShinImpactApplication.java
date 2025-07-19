package com.yxl;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@MapperScan("com.yxl.mapper")
@SpringBootApplication
public class GenShinImpactApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenShinImpactApplication.class, args);
    }
    /****
     * 创建拦截器，并将分页拦截器加入
     * */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        //创建分页拦截器：PaginationInnerInterceptor，同时指定数据库类型
        //addInnerInterceptor：将分页拦截器加入到拦截器栈，让它生效
        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return mybatisPlusInterceptor;
    }
}
