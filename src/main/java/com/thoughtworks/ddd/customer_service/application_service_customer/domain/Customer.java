package com.thoughtworks.ddd.customer_service.application_service_customer.domain;

import com.thoughtworks.ddd.domain.miscellaneous.Address;
import com.thoughtworks.ddd.account_service.application_service_account.domain.BankAccount;

import java.util.List;
import java.util.UUID;

// I am aggregate, I am root
// and anything inside I will manage it like updating address of bank account

// Within a aggregate strong consistency
// and across multiple aggregates we can eventual consistency

//Aggregates can hold only id of another aggregate
public class Customer {
    private String id;
    private String name;
    private Address address;
    private List<BankAccount> bankAccounts;

    public Customer(String name, Address address, List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.address = address;
    }

    // Logical transaction
    // Transaction start
    public void updateAddress(Address newAddress) {
        this.address = newAddress;

        //Create a event named customerAddressUpdated event (Always flattend-out)
        //Send event to bus

//        for (BankAccount account : bankAccounts) {
//            account.updateAddress(newAddress);
//        }
    }
    //Transaction end
}
