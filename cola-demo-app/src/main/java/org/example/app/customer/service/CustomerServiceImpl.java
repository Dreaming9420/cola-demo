package org.example.app.customer.service;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import org.example.app.customer.executor.CustomerAddCmdExe;
import org.example.app.customer.executor.query.CustomerListByNameQueryExe;
import org.example.client.customer.api.CustomerServiceI;
import org.example.client.customer.dto.clientobject.CustomerCO;
import org.example.client.customer.dto.cmd.CustomerAddCmd;
import org.example.client.customer.dto.cmd.query.CustomerListByNameQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
// @CatchAndLog
public class CustomerServiceImpl implements CustomerServiceI {

    @Resource
    private CustomerAddCmdExe customerAddCmdExe;

    @Resource
    private CustomerListByNameQueryExe customerListByNameQueryExe;

    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return customerAddCmdExe.execute(customerAddCmd);
    }

    @Override
    public MultiResponse<CustomerCO> listByName(CustomerListByNameQuery customerListByNameQuery) {
        return customerListByNameQueryExe.execute(customerListByNameQuery);
    }

}