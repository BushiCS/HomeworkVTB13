package org.example;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class ProductService {
    List<Product> productList;
    public Product findByTitle(String title) {
        for (Product product : productList) {
            if (product.getTitle().equals(title)) {
                return product;
            }
        }
        return null;

    }
    @PostConstruct
    public void initProductList(){
        productList = new ArrayList<>(Arrays.asList(
                new Product(1,"Хлеб",54),
                new Product(2, "Майонез", 149),
                new Product(3, "Батон", 50),
                new Product(3, "Сырок", 20)));
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void printAll(){
        for (Product product : productList) {
            System.out.println(product);
        }
    }

}
