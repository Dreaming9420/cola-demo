
package org.example.app.customer.executor;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.exception.Assert;
import org.example.client.customer.dto.cmd.CustomerAddCmd;
import org.springframework.stereotype.Component;


@Component
public class CustomerAddCmdExe {

    public Response execute(CustomerAddCmd cmd) {
        // The flow of usecase is defined here.
        // The core ablility should be implemented in Domain. or sink to Domian gradually
        Assert.isTrue(cmd.getCompanyName().equals("ConflictCompanyName"), "公司名冲突");
        return Response.buildSuccess();
    }

}
