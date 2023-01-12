创建对象的方式：
1. 自定义BeanPostProcessor生成代理对象，InstantiationAwareBeanPostProcessor
2. 通过反射创建
3. 通过factoryMethod创建对象，factory-bean、factory-method
4. 通过factoryBean创建对象
5. 通过supplier创建对象


三级缓存以及循环依赖



---
AOP

主要流程：
1. 解析xml标签
2. 注册BeanPostProcessor


构建调用链
1. 排序
2. 构建一个执行链
3. 