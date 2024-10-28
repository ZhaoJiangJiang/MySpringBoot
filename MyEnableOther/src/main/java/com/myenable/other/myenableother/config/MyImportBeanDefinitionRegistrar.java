package com.myenable.other.myenableother.config;

import com.myenable.other.myenableother.entity.Product;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        AbstractBeanDefinition productDefinition = BeanDefinitionBuilder.rootBeanDefinition(Product.class)
                .getBeanDefinition();
        registry.registerBeanDefinition("product", productDefinition);
    }
}
