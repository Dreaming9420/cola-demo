package org.example.infrastructure.customer.gatewayimpl;

import org.example.domain.customer.entity.CustomerEntity;
import org.example.domain.customer.gateway.CustomerGateway;
import org.example.infrastructure.customer.gatewayimpl.database.dataobject.CustomerDO;
import org.example.infrastructure.customer.gatewayimpl.database.mapper.CustomerMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class CustomerGatewayImpl implements CustomerGateway {
    @Resource
    private CustomerMapper customerMapper;

    public CustomerEntity getByById(String customerId) {
        CustomerDO customerDO = customerMapper.getById(customerId);
        // Convert to CustomerEntity
        return null;
    }
}
