package org.example.app.customer.executor.query;

import com.alibaba.cola.dto.MultiResponse;
import org.example.client.customer.dto.clientobject.CustomerCO;
import org.example.client.customer.dto.cmd.query.CustomerListByNameQuery;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class CustomerListByNameQueryExe {
    public MultiResponse<CustomerCO> execute(CustomerListByNameQuery cmd) {
        List<CustomerCO> customerCOList = new ArrayList<>();
        CustomerCO customerCO = new CustomerCO();
        customerCO.setCustomerName("Frank");
        customerCOList.add(customerCO);
        return MultiResponse.of(customerCOList);
    }
}
