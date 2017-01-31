/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class GetTagMetadataResponseModelBuilder {
    //the instance to build
    private GetTagMetadataResponseModel getTagMetadataResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public GetTagMetadataResponseModelBuilder() {
        getTagMetadataResponseModel = new GetTagMetadataResponseModel();
    }

    public GetTagMetadataResponseModelBuilder code(int code) {
        getTagMetadataResponseModel.setCode(code);
        return this;
    }

    public GetTagMetadataResponseModelBuilder result(List<Object> result) {
        getTagMetadataResponseModel.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetTagMetadataResponseModel build() {
        return getTagMetadataResponseModel;
    }
}