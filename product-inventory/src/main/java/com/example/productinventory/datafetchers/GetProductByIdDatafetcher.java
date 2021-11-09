package com.example.productinventory.datafetchers;

import com.example.productinventory.entities.ProductInfo;
import com.example.productinventory.generated.types.Product;
import com.example.productinventory.repositories.ProductInfoRepository;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsEntityFetcher;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.Optional;

@DgsComponent
public class GetProductByIdDatafetcher {

    private final ProductInfoRepository productInfoRepository;

    @Autowired
    public GetProductByIdDatafetcher(ProductInfoRepository productInfoRepository) {
        this.productInfoRepository = productInfoRepository;
    }

    public Product getProductById(@InputArgument String productId) {
        Optional<ProductInfo> productInfo = productInfoRepository.findById(productId);
        if (productInfo.isPresent()) {
            ProductInfo product = productInfo.get();
            return new Product(product.getId(), product.getName(), product.getCost(), product.getProductType());
        }
        return null;
    }

    @DgsQuery(field = "getProductById")
    public Product getProductByIdQuery(@InputArgument String productId) {
        return getProductById(productId);
    }

    @DgsEntityFetcher(name = "Product")
    public Product getProductEntity(Map<String, String> data) {
        String productId = data.get("id");
        return getProductById(productId);
    }
}
