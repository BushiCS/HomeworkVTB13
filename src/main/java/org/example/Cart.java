package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Cart {
    List<Product> orderProducts;
    public void add(Product product){
        orderProducts = new ArrayList<>();
        orderProducts.add(product);
    }

    public List<Product> getOrderProducts() {
        return orderProducts;
    }
}
