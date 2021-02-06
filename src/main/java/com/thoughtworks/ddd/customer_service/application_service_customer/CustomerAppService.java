package com.thoughtworks.ddd.customer_service.application_service_customer;

public class CustomerAppService {
    // Request will come here from Customer controller
    //@Transactional
    public void updateAddress() {
        //Initiate transaction
        //customer.updateAddress
        //end the transaction

        //Httpcall to account REST controller
        //Httpclient.post(addressPayload)
    }
}
