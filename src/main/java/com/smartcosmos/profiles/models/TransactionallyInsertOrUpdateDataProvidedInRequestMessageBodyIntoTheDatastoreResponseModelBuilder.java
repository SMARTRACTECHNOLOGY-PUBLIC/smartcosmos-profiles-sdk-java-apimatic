/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModelBuilder {
    //the instance to build
    private TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModel transactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModelBuilder() {
        transactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModel = new TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModel();
    }

    public TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModelBuilder code(int code) {
        transactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModel.setCode(code);
        return this;
    }

    public TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModelBuilder message(String message) {
        transactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModel.setMessage(message);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModel build() {
        return transactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModel;
    }
}