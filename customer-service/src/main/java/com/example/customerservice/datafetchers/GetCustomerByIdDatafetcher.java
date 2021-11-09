package com.example.customerservice.datafetchers;

import com.example.customerservice.entities.CustomerInfo;
import com.example.customerservice.generated.types.Customer;
import com.example.customerservice.repositories.CustomerInfoRepository;
import com.netflix.graphql.dgs.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.Optional;

@DgsComponent
public class GetCustomerByIdDatafetcher {

    private final CustomerInfoRepository customerInfoRepository;

    @Autowired
    public GetCustomerByIdDatafetcher(CustomerInfoRepository customerInfoRepository) {
        super();
        this.customerInfoRepository = customerInfoRepository;
    }

    public Customer getCustomerById(String customerId) {
        Optional<CustomerInfo> customerInfo = customerInfoRepository.findById(customerId);
        if (customerInfo.isPresent()) {
            CustomerInfo customer = customerInfo.get();
            return new Customer(customer.getId(), customer.getFirstName(), customer.getLastName(), customer.getEmailId(), customer.getProfilePicURL());
        }
        return null;
    }

    @DgsQuery(field = "getCustomerById")
    public Customer getCustomerByIdQuery(@InputArgument String customerId) {
        return getCustomerById(customerId);
    }

    @DgsEntityFetcher(name = "Customer")
    public Customer getCustomerEntity(Map<String, String> data) {
        String customerId = data.get("id");
        return getCustomerById(customerId);
    }

}
