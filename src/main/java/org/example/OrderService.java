package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    Cart cart;
    Product product;
    @Autowired
    ProductService productService;


    public void createOrder() {
        product = productService.productList.get((int) (Math.random() * productService.productList.size()));
        cart.add(product);
        for (Product orderProduct : cart.getOrderProducts()) {
            System.out.println(orderProduct.getTitle() + " | цена: " + orderProduct.getCost() + " руб.");
        }


    }
}
