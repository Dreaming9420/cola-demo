package org.example.client.dto.cmd.query;

import com.alibaba.cola.dto.Query;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerListByNameQuery extends Query {
    private String name;
}
