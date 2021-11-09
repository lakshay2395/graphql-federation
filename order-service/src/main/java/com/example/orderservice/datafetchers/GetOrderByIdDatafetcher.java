package com.example.orderservice.datafetchers;

import com.example.orderservice.entities.OrderInfo;
import com.example.orderservice.generated.types.Customer;
import com.example.orderservice.generated.types.Order;
import com.example.orderservice.referenceutils.ProductReferenceUtils;
import com.example.orderservice.repositories.OrderInfoRepository;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@DgsComponent
public class GetOrderByIdDatafetcher {

    private final OrderInfoRepository orderInfoRepository;

    @Autowired
    public GetOrderByIdDatafetcher(OrderInfoRepository orderInfoRepository) {
        this.orderInfoRepository = orderInfoRepository;
    }

    @DgsQuery(field = "getOrderById")
    public Order getOrderById(@InputArgument String orderId) {
        Optional<OrderInfo> order = orderInfoRepository.findById(orderId);
        if (order.isPresent()) {
            OrderInfo orderInfo = order.get();
            return new Order(orderInfo.getId(),
                    new Customer(orderInfo.getCustomerId()),
                    orderInfo.getStatus(),
                    ProductReferenceUtils.fetchProducts(orderInfo.getProductIdList()));
        }
        return null;
    }

}
