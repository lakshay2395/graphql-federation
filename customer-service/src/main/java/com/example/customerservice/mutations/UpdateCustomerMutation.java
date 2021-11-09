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
import java.util.Optional;

@DgsComponent
public class UpdateCustomerMutation {

    private final CustomerInfoRepository customerInfoRepository;

    @Autowired
    public UpdateCustomerMutation(CustomerInfoRepository customerInfoRepository) {
        this.customerInfoRepository = customerInfoRepository;
    }

    @DgsMutation(field = "updateCustomer")
    public Customer updateCustomer(DgsDataFetchingEnvironment dgsDataFetchingEnvironment) {
        String customerId = dgsDataFetchingEnvironment.getArgument("customerId");
        Map<String, Object> object = dgsDataFetchingEnvironment.getArgument("customer");
        CustomerInput customerInput = new ObjectMapper().convertValue(object, CustomerInput.class);
        Optional<CustomerInfo> customer = customerInfoRepository.findById(customerId);
        if (customer.isPresent()) {
            CustomerInfo customerInfo = customer.get();
            customerInfo.setFirstName(customerInput.getFirstName());
            customerInfo.setLastName(customerInput.getLastName());
            customerInfo.setEmailId(customerInput.getEmailId());
            customerInfo.setProfilePicURL(customerInput.getProfilePicURL());
            customerInfo = customerInfoRepository.saveAndFlush(customerInfo);
            return new Customer(customerInfo.getId(), customerInfo.getFirstName(), customerInfo.getLastName(), customerInfo.getEmailId(), customerInfo.getProfilePicURL());
        }
        return null;
    }

}
