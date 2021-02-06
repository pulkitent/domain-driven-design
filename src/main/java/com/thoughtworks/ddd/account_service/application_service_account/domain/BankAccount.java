package com.thoughtworks.ddd.account_service.application_service_account.domain;

import com.thoughtworks.ddd.domain.miscellaneous.Address;

import java.util.UUID;

//I am also a aggregate
public class BankAccount {
    private String accountNumber;
    private Address address;

    public BankAccount(Address address) {
        this.accountNumber = UUID.randomUUID().toString();
        this.address = address;
    }

    //Logical Transaction starts
    public void updateAddress(Address newAddress) {
        this.address = newAddress;
    }
    //Transaction ends
}
