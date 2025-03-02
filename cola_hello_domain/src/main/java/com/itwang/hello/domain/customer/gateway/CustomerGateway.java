package com.itwang.hello.domain.customer.gateway;

import com.itwang.hello.domain.customer.Customer;

public interface CustomerGateway {

    public Customer getById(String customer);
}
