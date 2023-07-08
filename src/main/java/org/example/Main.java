package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
        ProductService productService = context.getBean("productService", ProductService.class);
        productService.printAll();
        Cart cart = context.getBean("cart", Cart.class);
        OrderService orderService = context.getBean("orderService", OrderService.class);
        cart.add(productService.findByTitle("Батон"));
        cart.add(productService.findByTitle("фыв"));
        cart.add(productService.findByTitle("Хлеб"));
        orderService.createOrderFromCurrentCart();
    }
}