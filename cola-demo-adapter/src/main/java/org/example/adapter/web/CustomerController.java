package org.example.adapter.web;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import org.example.client.customer.api.CustomerServiceI;
import org.example.client.customer.dto.clientobject.CustomerCO;
import org.example.client.customer.dto.cmd.CustomerAddCmd;
import org.example.client.customer.dto.cmd.query.CustomerListByNameQuery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
public class CustomerController {

    @Resource
    private CustomerServiceI customerService;

    @GetMapping(value = "/customer")
    public MultiResponse<CustomerCO> listCustomerByName(@RequestParam(required = false) String name) {
        CustomerListByNameQuery customerListByNameQuery = new CustomerListByNameQuery();
        customerListByNameQuery.setName(name);
        return customerService.listByName(customerListByNameQuery);
    }

    @PostMapping(value = "/customer")
    public Response addCustomer(@Valid @RequestBody CustomerAddCmd customerAddCmd) {
        return customerService.addCustomer(customerAddCmd);
    }
}
