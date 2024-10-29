package com.myenable.myenable;

import com.myenable.other.myenableother.config.MyImportBeanDefinitionRegistrar;
import com.myenable.other.myenableother.config.MyImportSelector;
import com.myenable.other.myenableother.config.ProductConfig;
import com.myenable.other.myenableother.enable.EnableProduct;
import com.myenable.other.myenableother.entity.Product;
import com.myenable.other.myenableother.entity.Shop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import redis.clients.jedis.Jedis;

/**
 * @ComponentScan：扫描范围：当前引导类所在包及其子包
 * 1. 使用@ComponentScan扫描配置类的包 @ComponentScan("com.myenable.other.myenableother.config")
 * 2. 使用@Import注解，加载类 @Import(ProductConfig.class)
 * 3. 自定义EnableProduct注解
 */

/**
 * @Import 注解的4种用法
 * 1. 导入Bean @Import(Product.class) -> context.getBean(Product.class)
 * 2. 导入配置类 @Import(ProductConfig.class)
 * 3. 导入ImportSelector的实现类
 * 4. 导入ImportBeanDefinitionRegistrar的实现类
 */

@SpringBootApplication
//@ComponentScan("com.myenable.other.myenableother.config")
//@Import(ProductConfig.class)
//@EnableProduct

@Import(MyImportSelector.class)
//@Import(MyImportBeanDefinitionRegistrar.class)
public class MyEnableApplication {


//    // 验证 @ConditionalOnMissingBean(name = "jedis") 是生效的
//    @Bean
//    public Jedis jedis() {
//        return new Jedis("localhost", 6379);
//    }


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MyEnableApplication.class, args);

        // 获取Bean
        Product product = context.getBean(Product.class);
        System.out.println(product);

        Shop shop = context.getBean(Shop.class);
        System.out.println(shop);

        Jedis jedis = context.getBean(Jedis.class);
        System.out.println(jedis);
    }

}
