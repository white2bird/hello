package com.itwang.hello.api;

import com.itwang.hello.dto.CustomerByNameQuery;
import com.itwang.hello.dto.data.CustomerDTO;

public interface CustomServiceI {

    public CustomerDTO queryByName(CustomerByNameQuery customerByNameQuery);
}
