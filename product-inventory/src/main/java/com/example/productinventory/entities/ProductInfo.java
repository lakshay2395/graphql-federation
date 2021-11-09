package com.example.productinventory.entities;

import com.example.productinventory.generated.types.ProductType;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "product_info")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductInfo {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    String id;

    @Column(name = "name")
    String name;

    @Column(name = "cost")
    Double cost;

    @Enumerated(EnumType.STRING)
    @Column(name = "product_type")
    ProductType productType;

}
