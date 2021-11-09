package com.example.orderservice.referenceutils;

import com.example.orderservice.generated.types.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductReferenceUtils {

    public static List<Product> fetchProducts(List<String> productIds) {
        List<Product> products = new ArrayList<>();
        for (String productId : productIds) {
            products.add(new Product(productId));
        }
        return products;
    }

}
