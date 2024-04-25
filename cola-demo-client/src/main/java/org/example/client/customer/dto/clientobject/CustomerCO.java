package org.example.client.customer.dto.clientobject;

import lombok.Data;

@Data
public class CustomerCO {
    private String customerId;
    private String memberId;
    private String customerName;
    private String customerType;
    private String companyName;
    private String source;
}
