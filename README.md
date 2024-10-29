# MySpringBoot

### SpringBoot基础学习

#### 1. MyCondition: 分析SpringBoot是如何知道要创建哪个Bean的。通过2个例子，解析@Condition注解在SpringBoot创建Bean时的作用。

#### 2. MyEnable & MyEnableOther：分析SpringBoot是如何加载Bean的，通过自定义@Enable*注解加载Bean；@Enable*的底层通过@Import实现。

* @Enable* 注解

```tex
这些注解都是用于动态开启某些功能的。
```

```java
/* 让当前Spring容器自动封装其他模块Bean的方式有3种 */
// 1. @ComponentScan("com.your.object.package.path")
// 2. @Import(YourObject.class)
// 3. 自定义@EnableYourObject注解
```

 * @Import 注解

```java
// @Enable* 底层依赖于 @Import 注解导入一些类
/**
 * @Import 注解的4种用法
 * 1. 导入Bean @Import(Product.class) -> context.getBean(Product.class)
 * 2. 导入配置类 @Import(ProductConfig.class)
 * 3. 导入ImportSelector的实现类
 * 4. 导入ImportBeanDefinitionRegistrar的实现类
 */
```

 * @EnableAutoConfiguration 注解

```java
// @EnableAutoConfiguration注解内部使用@Import(AutoConfigurationImportSelect.class)来加载配置类
```

#### 3. 自定义实现Starter

```java
/* 自定义redis-start。要求当导入redis坐标时，SpringBoot自动创建Jedis的Bean */

// 实现步骤
// 1. 创建redis-spring-boot-autoconfigure 模块
// 2. 创建redis-spring-boot-starter模块，依赖 redis-spring-boot-autoconfigure 模块
// 3. 在redis-spring-boot-autoconfigure模块中初始化Jedis的Bean。并定义META-INF/spring.factories文件
// 4. 在测试模块中引入自定义的redis-starter依赖，测试获取Jedis的Bean，操作redis
```
