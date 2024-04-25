package org.example.test;

import com.alibaba.cola.dto.Response;
import org.example.client.api.CustomerServiceI;
import org.example.client.dto.cmd.CustomerAddCmd;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * This is for integration test.
 * <p>
 * Created by fulan.zjf on 2017/11/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerEntityServiceTest {

    @Resource
    private CustomerServiceI customerService;


    @Before
    public void setUp() {

    }

    @Test
    public void testCustomerAddSuccess() {
        // 1.prepare
        CustomerAddCmd customerAddCmd = new CustomerAddCmd();
        customerAddCmd.setCompanyName("NormalName");

        // 2.execute
        Response response = customerService.addCustomer(customerAddCmd);

        // 3.assert
        Assert.assertTrue(response.isSuccess());
    }

    @Test
    public void testCustomerAddCompanyNameConflict() {
        // 1.prepare
        CustomerAddCmd customerAddCmd = new CustomerAddCmd();
        customerAddCmd.setCompanyName("ConflictCompanyName");

        // 2.execute
        Response response = customerService.addCustomer(customerAddCmd);

    }
}
