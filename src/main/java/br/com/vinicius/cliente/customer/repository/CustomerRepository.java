package br.com.vinicius.cliente.customer.repository;

import br.com.vinicius.cliente.customer.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
