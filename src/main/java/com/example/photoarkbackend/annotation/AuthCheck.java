package com.example.photoarkbackend.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // 注解作用于方法
@Retention(RetentionPolicy.RUNTIME) // 注解在运行时有效
public @interface AuthCheck {
    /**
     * 必须有某个角色
     */
    String mustRole() default "";
}
