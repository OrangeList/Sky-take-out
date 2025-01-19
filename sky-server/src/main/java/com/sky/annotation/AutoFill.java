package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用于表识某个方法需要进行功能字段进行自动填充处理
 * Target注解表明这个注解只能加在方法上
 */

//注解可以应用于方法
@Target(ElementType.METHOD)
//表示该注解在运行时保留，可以通过反射机制读取。
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    //数据库操作类型：UPDATE INSERT
    //加了括号不代表这是方法，这是一个属性字段
    OperationType value();
}
