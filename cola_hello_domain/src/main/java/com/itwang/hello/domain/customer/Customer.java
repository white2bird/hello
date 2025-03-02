package com.itwang.hello.domain.customer;


import lombok.Data;

@Data
public class Customer {

    private String customerId;

    private String memberId;

    private String globalId;

    private long registeredCapital;

    private String companyName;
}
