package org.sid.billingservice.entities;

import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "fullBill",types = Bill.class)
public interface billingProjection {
    Long getId();
    Date getBillingDate();
    Long getCustomerID();
}
