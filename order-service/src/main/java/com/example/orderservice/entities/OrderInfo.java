package com.example.orderservice.entities;

import com.example.orderservice.generated.types.OrderStatus;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "order_info")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    String id;

    @Column(name = "customer_id")
    String customerId;

    @Enumerated(EnumType.STRING)
    @Column(name = "order_status")
    OrderStatus status;

    @ElementCollection
    @CollectionTable(
            name="order_products",
            joinColumns=@JoinColumn(name="ORDER_ID")
    )
    List<String> productIdList;

}
