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
import java.util.Optional;

@DgsComponent
public class UpdateProductMutation {

    private final ProductInfoRepository productInfoRepository;

    @Autowired
    public UpdateProductMutation(ProductInfoRepository productInfoRepository) {
        this.productInfoRepository = productInfoRepository;
    }

    @DgsMutation(field = "updateProduct")
    public Product updateProduct(DgsDataFetchingEnvironment dgsDataFetchingEnvironment) {
        String productId = dgsDataFetchingEnvironment.getArgument("productId");
        Map<String, Object> object = dgsDataFetchingEnvironment.getArgument("product");
        ProductInput productInput = new ObjectMapper().convertValue(object, ProductInput.class);
        Optional<ProductInfo> product = productInfoRepository.findById(productId);
        if (product.isPresent()) {
            ProductInfo productInfo = product.get();
            productInfo.setName(productInput.getName());
            productInfo.setCost(productInput.getCost());
            productInfo.setProductType(productInput.getType());
            productInfo = productInfoRepository.saveAndFlush(productInfo);
            return new Product(productInfo.getId(), productInfo.getName(), productInfo.getCost(), productInfo.getProductType());
        }
        return null;
    }

}
