package org.example.client.customer.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import org.example.client.customer.dto.clientobject.CustomerCO;
import org.example.client.customer.dto.cmd.CustomerAddCmd;
import org.example.client.customer.dto.cmd.query.CustomerListByNameQuery;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerCO> listByName(CustomerListByNameQuery customerListByNameQuery);
}
