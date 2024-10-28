package com.myenable.other.myenableother.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{
                "com.myenable.other.myenableother.entity.Shop",
                "com.myenable.other.myenableother.entity.Product"};
    }
}
