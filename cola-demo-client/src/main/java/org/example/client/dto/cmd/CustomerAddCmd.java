package org.example.client.dto.cmd;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class CustomerAddCmd {
    private String customerId;
    private String memberId;
    private String customerName;
    private String customerType;
    @NotEmpty
    private String companyName;
    @NotEmpty
    private String source;

}
