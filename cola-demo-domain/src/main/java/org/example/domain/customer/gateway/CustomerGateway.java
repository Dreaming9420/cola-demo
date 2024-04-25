package org.example.domain.customer.gateway;

import org.example.domain.customer.entity.CustomerEntity;

public interface CustomerGateway {
    CustomerEntity getByById(String customerId);
}
