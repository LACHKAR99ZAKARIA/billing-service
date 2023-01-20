package org.sid.billingservice.feign;

import org.sid.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductItemRestClient {
   /* @GetMapping(path = "/products?projection=fullProduct")
    PagedModel<Product> pageProducts(@RequestParam(name = "page") int page,@RequestParam(name = "size") int size);*/
    @GetMapping(path = "/products/{id}?projection=fullProduct")
    Product getProductById(@PathVariable(name = "id") Long id);
    @GetMapping(path = "/products?projection=fullProduct")
    PagedModel<Product> pageProducts();
}
