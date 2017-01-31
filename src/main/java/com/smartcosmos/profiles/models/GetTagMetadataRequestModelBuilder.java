/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class GetTagMetadataRequestModelBuilder {
    //the instance to build
    private GetTagMetadataRequestModel getTagMetadataRequestModel;

    /**
     * Default constructor to initialize the instance
     */
    public GetTagMetadataRequestModelBuilder() {
        getTagMetadataRequestModel = new GetTagMetadataRequestModel();
    }

    public GetTagMetadataRequestModelBuilder properties(List<String> properties) {
        getTagMetadataRequestModel.setProperties(properties);
        return this;
    }

    public GetTagMetadataRequestModelBuilder tagIds(List<String> tagIds) {
        getTagMetadataRequestModel.setTagIds(tagIds);
        return this;
    }

    public GetTagMetadataRequestModelBuilder verificationTypes(List<String> verificationTypes) {
        getTagMetadataRequestModel.setVerificationTypes(verificationTypes);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetTagMetadataRequestModel build() {
        return getTagMetadataRequestModel;
    }
}