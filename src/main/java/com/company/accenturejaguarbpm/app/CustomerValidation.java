package com.company.accenturejaguarbpm.app;

import com.company.accenturejaguarbpm.entity.Customer;
import groovy.util.logging.Log;
import io.jmix.core.DataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerValidation {
    @Autowired
    private DataManager dataManager;

    public Customer findCustomerByEmail(String email){

        Customer entity = dataManager.load(Customer.class)
                .query("select c from Customer c where c.email = :email1")
                .parameter("email1", email)
                .one();
        return entity;
        }
    }
