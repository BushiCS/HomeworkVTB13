package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Cart {
    List<Product> orderProducts;

    @PostConstruct
    public void initCart() {
        orderProducts = new ArrayList<>();
    }

    public void add(Product product) {
        orderProducts.add(product);
    }

    public List<Product> getOrderProducts() {
        return orderProducts;
    }
}
