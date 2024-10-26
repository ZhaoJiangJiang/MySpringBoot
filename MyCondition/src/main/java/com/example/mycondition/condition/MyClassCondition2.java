package com.example.mycondition.condition;

import com.example.mycondition.annotation.MyConditionalOnClass;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

import java.util.List;

public class MyClassCondition2 implements Condition {
    /**
     *
     * @param context   上下文对象。用于获取环境、IOC容器、classLoader对象
     * @param metadata  注解元对象。可以用于获取注解定义的属性值
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        /* 导入通过MyConditionOnClass注解属性值 指定的坐标，创建Bean */
        // 获取注解属性值
        MultiValueMap<String, Object> allAnnotationAttributes = metadata.
                getAllAnnotationAttributes(MyConditionalOnClass.class.getName());
        List<Object> value = allAnnotationAttributes.get("value");
        String[] classNames = (String[]) value.get(0);
        for (Object className : classNames) {
            try {
                System.out.println(className);
                Class<?> aClass = Class.forName(className.toString());
                System.out.println(aClass);
            } catch (ClassNotFoundException e) {
                return false;
            }
        }
        return true;
    }
}
