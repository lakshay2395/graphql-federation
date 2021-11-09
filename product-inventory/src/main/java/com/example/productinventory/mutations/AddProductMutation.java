package com.example.productinventory.mutations;

import com.example.productinventory.entities.ProductInfo;
import com.example.productinventory.generated.types.Product;
import com.example.productinventory.generated.types.ProductInput;
import com.example.productinventory.repositories.ProductInfoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.DgsMutation;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

@DgsComponent
public class AddProductMutation {

    private final ProductInfoRepository productInfoRepository;

    @Autowired
    public AddProductMutation(ProductInfoRepository productInfoRepository) {
        this.productInfoRepository = productInfoRepository;
    }

    @DgsMutation(field = "addProduct")
    public Product addProduct(DgsDataFetchingEnvironment dgsDataFetchingEnvironment) {
        Map<String, Object> object = dgsDataFetchingEnvironment.getArgument("product");
        ProductInput productInput = new ObjectMapper().convertValue(object, ProductInput.class);
        ProductInfo productInfo = ProductInfo.builder()
                .name(productInput.getName())
                .cost(productInput.getCost())
                .productType(productInput.getType())
                .build();
        productInfo = productInfoRepository.saveAndFlush(productInfo);
        return new Product(productInfo.getId(), productInfo.getName(), productInfo.getCost(), productInfo.getProductType());
    }

}
