package com.thoughtworks.ddd.domain.miscellaneous;

import java.util.List;
import java.util.UUID;

// I am aggregate, I am root
// and anything inside I will manage it like updating address of bank account
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

        for (BankAccount account : bankAccounts) {
            account.updateAddress(newAddress);
        }
    }
    //Transaction end
}
