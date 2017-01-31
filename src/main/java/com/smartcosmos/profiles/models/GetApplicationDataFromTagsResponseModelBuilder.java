/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class GetApplicationDataFromTagsResponseModelBuilder {
    //the instance to build
    private GetApplicationDataFromTagsResponseModel getApplicationDataFromTagsResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public GetApplicationDataFromTagsResponseModelBuilder() {
        getApplicationDataFromTagsResponseModel = new GetApplicationDataFromTagsResponseModel();
    }

    public GetApplicationDataFromTagsResponseModelBuilder code(int code) {
        getApplicationDataFromTagsResponseModel.setCode(code);
        return this;
    }

    public GetApplicationDataFromTagsResponseModelBuilder result(List<Object> result) {
        getApplicationDataFromTagsResponseModel.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetApplicationDataFromTagsResponseModel build() {
        return getApplicationDataFromTagsResponseModel;
    }
}