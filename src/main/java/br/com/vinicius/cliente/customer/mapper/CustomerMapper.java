package br.com.vinicius.cliente.customer.mapper;

import br.com.vinicius.cliente.customer.entity.CustomerEntity;
import br.com.vinicius.cliente.customer.model.CustomerModel;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    private CustomerMapper(){}

    public CustomerEntity from (CustomerModel model){
        CustomerEntity entity = new CustomerEntity();
        entity.setName(model.getName());
        return entity;
    }

    public CustomerModel to (CustomerEntity entity) {
        CustomerModel model = new CustomerModel();
        model.setId(entity.getCustomerId());
        model.setName(entity.getName());
        return model;
    }
}
