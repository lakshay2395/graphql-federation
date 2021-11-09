package com.example.orderservice.mutations;

import com.example.orderservice.entities.OrderInfo;
import com.example.orderservice.generated.types.Customer;
import com.example.orderservice.generated.types.Order;
import com.example.orderservice.generated.types.OrderInput;
import com.example.orderservice.referenceutils.ProductReferenceUtils;
import com.example.orderservice.repositories.OrderInfoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.DgsMutation;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

@DgsComponent
public class AddOrderMutation {

    private final OrderInfoRepository orderInfoRepository;

    @Autowired
    public AddOrderMutation(OrderInfoRepository orderInfoRepository) {
        this.orderInfoRepository = orderInfoRepository;
    }

    @DgsMutation(field = "addOrder")
    public Order addOrder(DgsDataFetchingEnvironment dgsDataFetchingEnvironment) {
        Map<String, Object> object = dgsDataFetchingEnvironment.getArgument("order");
        OrderInput orderInput = new ObjectMapper().convertValue(object, OrderInput.class);
        OrderInfo orderInfo = OrderInfo.builder()
                .customerId(orderInput.getCustomerId())
                .status(orderInput.getStatus())
                .productIdList(orderInput.getProductIds())
                .build();
        orderInfo = orderInfoRepository.saveAndFlush(orderInfo);
        Order o = new Order(orderInfo.getId(),
                new Customer(orderInfo.getCustomerId()),
                orderInfo.getStatus(),
                ProductReferenceUtils.fetchProducts(orderInfo.getProductIdList()));
        return o;
    }

}
