package com.example.customerservice.mutations;

import com.example.customerservice.entities.CustomerInfo;
import com.example.customerservice.generated.types.Customer;
import com.example.customerservice.generated.types.CustomerInput;
import com.example.customerservice.repositories.CustomerInfoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.DgsMutation;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

@DgsComponent
public class AddCustomerMutation {

    private final CustomerInfoRepository customerInfoRepository;

    @Autowired
    public AddCustomerMutation(CustomerInfoRepository customerInfoRepository) {
        this.customerInfoRepository = customerInfoRepository;
    }

    @DgsMutation(field = "addCustomer")
    public Customer addCustomer(DgsDataFetchingEnvironment dgsDataFetchingEnvironment) {
        Map<String, Object> object = dgsDataFetchingEnvironment.getArgument("customer");
        CustomerInput customerInput = new ObjectMapper().convertValue(object, CustomerInput.class);
        CustomerInfo customerInfo = CustomerInfo.builder()
                .firstName(customerInput.getFirstName())
                .lastName(customerInput.getLastName())
                .emailId(customerInput.getEmailId())
                .profilePicURL(customerInput.getProfilePicURL())
                .build();
        customerInfo = customerInfoRepository.saveAndFlush(customerInfo);
        return new Customer(customerInfo.getId(), customerInfo.getFirstName(), customerInfo.getLastName(), customerInfo.getEmailId(), customerInfo.getProfilePicURL());
    }

}
