package com.itwang.hello.executor.query;


import com.itwang.hello.dto.CustomerByNameQuery;
import com.itwang.hello.dto.data.CustomerDTO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.UUID;

@Component
public class CustomerByNameQueryExe {


    public CustomerDTO execute(CustomerByNameQuery cmd){
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setName("query is " + cmd.getName());
        customerDTO.setId(UUID.randomUUID().toString());
        return customerDTO;
    }
}
