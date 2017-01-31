/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class GetApplicationDataFromTagsRequestModelBuilder {
    //the instance to build
    private GetApplicationDataFromTagsRequestModel getApplicationDataFromTagsRequestModel;

    /**
     * Default constructor to initialize the instance
     */
    public GetApplicationDataFromTagsRequestModelBuilder() {
        getApplicationDataFromTagsRequestModel = new GetApplicationDataFromTagsRequestModel();
    }

    public GetApplicationDataFromTagsRequestModelBuilder appId(String appId) {
        getApplicationDataFromTagsRequestModel.setAppId(appId);
        return this;
    }

    public GetApplicationDataFromTagsRequestModelBuilder tagIds(List<String> tagIds) {
        getApplicationDataFromTagsRequestModel.setTagIds(tagIds);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetApplicationDataFromTagsRequestModel build() {
        return getApplicationDataFromTagsRequestModel;
    }
}