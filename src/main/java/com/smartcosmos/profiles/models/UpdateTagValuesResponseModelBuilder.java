/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class UpdateTagValuesResponseModelBuilder {
    //the instance to build
    private UpdateTagValuesResponseModel updateTagValuesResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateTagValuesResponseModelBuilder() {
        updateTagValuesResponseModel = new UpdateTagValuesResponseModel();
    }

    public UpdateTagValuesResponseModelBuilder code(int code) {
        updateTagValuesResponseModel.setCode(code);
        return this;
    }

    public UpdateTagValuesResponseModelBuilder result(List<Object> result) {
        updateTagValuesResponseModel.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateTagValuesResponseModel build() {
        return updateTagValuesResponseModel;
    }
}