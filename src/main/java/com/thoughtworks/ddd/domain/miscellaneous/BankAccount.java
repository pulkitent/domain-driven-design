package com.thoughtworks.ddd.domain.miscellaneous;

import java.util.UUID;

public class BankAccount {
    private String accountNumber;
    private Address address;

    public BankAccount(Address address) {
        this.accountNumber = UUID.randomUUID().toString();
        this.address = address;
    }

    void updateAddress(Address newAddress) {
        this.address = newAddress;
    }
}
