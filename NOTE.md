

[Spring MVC]

前置：
web.xml 文件
```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://java.sun.com/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_4_0.xsd"
         version="4.0">
    <!-- 配置 Spring MVC 的 DispatcherServlet -->
    <servlet>
        <servlet-name>dispatcher</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <init-param>
            <param-name>contextConfigLocation</param-name>
            <param-value>/WEB-INF/applicationContext.xml</param-value>
        </init-param>
        <load-on-startup>1</load-on-startup>
    </servlet>

    <servlet-mapping>
        <servlet-name>dispatcher</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>

    <!-- 配置 Spring 的 ContextLoaderListener -->
    <listener>
        <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
    </listener>

    <!-- 配置 Spring 根上下文的配置文件位置 -->
    <context-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>/WEB-INF/applicationContext.xml</param-value>
    </context-param>
</web-app>

```
1. tomcat 启动
2. 加载 listener， 执行 ContextLoaderListener 的 contextInitialized 方法
3. 加载 servlet， 执行 DispatcherServlet 的 init 方法
   + 继承关系：DispatcherServlet --extends--> FrameworkServlet --extends--> HttpServletBean
   + 在 HttpServletBean 的 init 方法中，会调用 initServletBean 方法，该方法会调用 onRefresh 方法
   + 在 onRefresh 方法中，会调用 initStrategies 方法，会初始化九大组件
4. 进行请求解析，根据请求的方法进入到 doGet、doPost等方法中（这一步实际上是 servlet 完成）
   + 在 doGet、doPost 等方法[FrameworkServlet]中，会调用 processRequest方法[FrameworkServlet]
   + 在 processRequest 方法中，会调用 doService方法[DispatcherServlet 实现]
   + 在 doService 方法中，会调用 doDispatch方法[DispatcherServlet 实现]
   + 