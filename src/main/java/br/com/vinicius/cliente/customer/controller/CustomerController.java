package br.com.vinicius.cliente.customer.controller;

import javax.validation.Valid;

import br.com.vinicius.cliente.customer.entity.CustomerEntity;
import br.com.vinicius.cliente.customer.mapper.CustomerMapper;
import br.com.vinicius.cliente.customer.model.CustomerModel;
import br.com.vinicius.cliente.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class CustomerController {

    @Autowired
    private CustomerService service;
    @Autowired
    private CustomerMapper mapper;

    @PostMapping
    public ResponseEntity<CustomerModel> cadastrarCliente(@RequestBody @Valid CustomerModel cliente) {
        CustomerEntity entity = mapper.from(cliente);
        CustomerModel newUser = service.createCustomer(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }

    @GetMapping(value = "/{clienteId}")
    public ResponseEntity<CustomerModel> getClientById(@PathVariable Long clienteId) {
        CustomerModel user = service.findCustomer(clienteId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

}
