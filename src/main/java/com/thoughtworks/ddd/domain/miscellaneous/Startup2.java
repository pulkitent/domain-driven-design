package com.thoughtworks.ddd.domain.miscellaneous;

import java.util.List;

import static java.util.Arrays.asList;

public class Startup2 {
    public static void main(String[] args) {
        Address address = new Address("1", "2", "3");

        BankAccount bankAccount = new BankAccount(address);
        BankAccount anotherBankAccount = new BankAccount(address);
        List<BankAccount> bankAccounts = asList(bankAccount, anotherBankAccount);

        Customer customer = new Customer("Bilal_Bhai", address, bankAccounts);

        Address anotherNewAddress = new Address("4", "5", "6");
        customer.updateAddress(anotherNewAddress);
    }
}
