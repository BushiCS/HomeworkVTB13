package org.example;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductService {
    private List<Product> productList;

    public Product findByTitle(String title) {
        return productList
                .stream()
                .filter(product -> product.getTitle().equals(title))
                .findFirst()
                .orElse(new Product(0, "unknown product", 0));
    }


    @PostConstruct
    public void initProductList() {
        productList = new ArrayList<>(Arrays.asList(
                new Product(1, "Хлеб", 54),
                new Product(2, "Майонез", 149),
                new Product(3, "Батон", 50),
                new Product(4, "Сырок", 20)));
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void printAll() {
        System.out.println("СПИСОК ТОВАРОВ");
        System.out.println("НАЗВАНИЕ | ЦЕНА | ИДЕНТИФИКАТОР");
        for (Product product : productList) {
            System.out.printf("%-8s %s %-4d %s %-10d \n", product.getTitle(), "|", product.getCost(), "|", product.getId());
        }
    }

}
