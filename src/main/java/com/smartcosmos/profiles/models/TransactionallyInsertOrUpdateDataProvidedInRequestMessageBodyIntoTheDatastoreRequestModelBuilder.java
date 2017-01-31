/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModelBuilder {
    //the instance to build
    private TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModel transactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModel;

    /**
     * Default constructor to initialize the instance
     */
    public TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModelBuilder() {
        transactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModel = new TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModel();
    }

    public TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModelBuilder account(Object account) {
        transactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModel.setAccount(account);
        return this;
    }

    public TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModelBuilder metadata(List<Object> metadata) {
        transactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModel.setMetadata(metadata);
        return this;
    }

    public TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModelBuilder objectAddresses(List<Object> objectAddresses) {
        transactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModel.setObjectAddresses(objectAddresses);
        return this;
    }

    public TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModelBuilder objects(List<Object> objects) {
        transactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModel.setObjects(objects);
        return this;
    }

    public TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModelBuilder relationships(List<Object> relationships) {
        transactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModel.setRelationships(relationships);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModel build() {
        return transactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModel;
    }
}