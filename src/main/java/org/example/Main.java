package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
        ProductService service = context.getBean("productService", ProductService.class);
        service.printAll();
        OrderService service1 = context.getBean("orderService", OrderService.class);
        service1.createOrder();
    }
}