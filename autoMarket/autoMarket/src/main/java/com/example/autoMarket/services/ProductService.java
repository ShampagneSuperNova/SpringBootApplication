package com.example.autoMarket.services;

import com.example.autoMarket.models.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;


    {
        products.add(new Product(++ID,"Nissan Z350", "japanise sport car", 5000,"Moscow","akira yomomoto"));
        products.add(new Product(++ID,"Dodge Challenger", "american muscle car", 4500,"Loas Angeles","Barnie Stinson"));

    }

    public List<Product> listProducts() { return products; }

    public void saveProduct(Product product){
        products.add(product);
        product.setId(++ID);
    }

    public void deleteProduct(Long id){
        products.removeIf(product -> Objects.equals(product.getId(), id));
    }

    public Product getProductById(Long id){
        for (Product product : products) {
            if (Objects.equals(product.getId(), id)) return product;
        }
        return null;
    }
}
