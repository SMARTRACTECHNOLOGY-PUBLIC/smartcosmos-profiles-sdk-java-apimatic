/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class GetSingleTagCodeMessageResponseModelBuilder {
    //the instance to build
    private GetSingleTagCodeMessageResponseModel getSingleTagCodeMessageResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public GetSingleTagCodeMessageResponseModelBuilder() {
        getSingleTagCodeMessageResponseModel = new GetSingleTagCodeMessageResponseModel();
    }

    public GetSingleTagCodeMessageResponseModelBuilder code(int code) {
        getSingleTagCodeMessageResponseModel.setCode(code);
        return this;
    }

    public GetSingleTagCodeMessageResponseModelBuilder message(String message) {
        getSingleTagCodeMessageResponseModel.setMessage(message);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetSingleTagCodeMessageResponseModel build() {
        return getSingleTagCodeMessageResponseModel;
    }
}