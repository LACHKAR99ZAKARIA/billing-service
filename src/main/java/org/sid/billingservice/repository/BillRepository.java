package org.sid.billingservice.repository;

import feign.Param;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.sid.billingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface BillRepository extends JpaRepository<Bill,Long> {

    @RestResource(path = "/byCustomerId")
    List<Bill> findByCustomerID(@Param("customerId") Long customerId);


}
