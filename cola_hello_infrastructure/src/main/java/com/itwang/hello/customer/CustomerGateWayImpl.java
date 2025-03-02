package com.itwang.hello.customer;

import com.itwang.hello.domain.customer.Customer;
import com.itwang.hello.domain.customer.gateway.CustomerGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class CustomerGateWayImpl implements CustomerGateway {

    @Autowired(required = false)
    private CustomerMapper customerMapper;

    @Override
    public Customer getById(String customer) {
        return null;
    }
}
