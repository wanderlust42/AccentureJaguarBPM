package com.company.accenturejaguarbpm.screen.customer;

import io.jmix.ui.screen.*;
import com.company.accenturejaguarbpm.entity.Customer;

@UiController("Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
public class CustomerBrowse extends StandardLookup<Customer> {
}