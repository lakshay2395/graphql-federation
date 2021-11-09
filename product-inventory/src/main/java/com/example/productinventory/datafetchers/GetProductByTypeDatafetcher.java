package com.example.productinventory.datafetchers;

import com.example.productinventory.entities.ProductInfo;
import com.example.productinventory.generated.types.Product;
import com.example.productinventory.generated.types.ProductType;
import com.example.productinventory.repositories.ProductInfoRepository;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@DgsComponent
public class GetProductByTypeDatafetcher {

    private final ProductInfoRepository productInfoRepository;

    @Autowired
    public GetProductByTypeDatafetcher(ProductInfoRepository productInfoRepository) {
        this.productInfoRepository = productInfoRepository;
    }

    @DgsQuery(field = "getProductByType")
    public List<Product> getProductByTypes(@InputArgument String productType) {
        List<ProductInfo> productInfoList = productInfoRepository.getProductInfoByProductType(ProductType.valueOf(productType));
        if (productInfoList.size() > 0) {
            List<Product> products = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                products.add(new Product(productInfo.getId(), productInfo.getName(), productInfo.getCost(), productInfo.getProductType()));
            }
            return products;
        }
        return new ArrayList<>();
    }

}
