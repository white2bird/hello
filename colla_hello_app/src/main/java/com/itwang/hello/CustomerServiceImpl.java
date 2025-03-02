package com.itwang.hello;

import com.itwang.hello.api.CustomServiceI;
import com.itwang.hello.dto.CustomerByNameQuery;
import com.itwang.hello.dto.data.CustomerDTO;
import com.itwang.hello.executor.query.CustomerByNameQueryExe;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class CustomerServiceImpl implements CustomServiceI {

    @Resource
    private CustomerByNameQueryExe customerByNameQueryExe;

    @Override
    public CustomerDTO queryByName(CustomerByNameQuery customerByNameQuery) {
        return customerByNameQueryExe.execute(customerByNameQuery);
    }
}
