package org.example.domain.customer.gateway;

import org.example.domain.customer.entity.CreditEntity;

// Assume that the credit info is in another distributed Service
public interface CreditGateway {
    CreditEntity getCredit(String customerId);
}
