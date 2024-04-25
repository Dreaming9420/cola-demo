package org.example.infrastructure.customer.gatewayimpl.database.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.customer.gatewayimpl.database.dataobject.CustomerDO;

@Mapper
public interface CustomerMapper {

    CustomerDO getById(String customerId);
}
