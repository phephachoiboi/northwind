package fi.vamk.e2000593.northwind.repository;

//import fi.vamk.e2000593.northwind.entity.*;
import org.springframework.stereotype.Repository;

import fi.vamk.e2000593.northwind.entity.Customers;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerRepository, Integer> {

    Customers save(Customers customer);

    void delete(Customers customer);

}

