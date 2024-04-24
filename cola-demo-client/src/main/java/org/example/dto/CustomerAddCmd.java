package org.example.dto;

import lombok.Data;
import org.example.dto.data.CustomerDTO;

@Data
public class CustomerAddCmd {

    private CustomerDTO customerDTO;

}
