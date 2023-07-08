package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderService {
    @Autowired
    Cart cart;

    public void createOrderFromCurrentCart() {
        List<Product> products = cart.getOrderProducts();
        System.out.println("\n КОРЗИНА: ");
        products.stream()
                .filter(product -> !product.getTitle().equals("unknown product"))
                .forEach(product -> System.out.printf("%-8s %s %-4d \n", product.getTitle(), "|", product.getCost()));

        System.out.println("ИТОГО: " + products.stream().mapToInt(Product::getCost).sum() + " руб");
    }
}
