package com.example.productinventory.repositories;

import com.example.productinventory.entities.ProductInfo;
import com.example.productinventory.generated.types.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {
    List<ProductInfo> getProductInfoByProductType(ProductType productType);
}