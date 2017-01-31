/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class GetKeysUsedForTagAuthenticationRequestModelBuilder {
    //the instance to build
    private GetKeysUsedForTagAuthenticationRequestModel getKeysUsedForTagAuthenticationRequestModel;

    /**
     * Default constructor to initialize the instance
     */
    public GetKeysUsedForTagAuthenticationRequestModelBuilder() {
        getKeysUsedForTagAuthenticationRequestModel = new GetKeysUsedForTagAuthenticationRequestModel();
    }

    public GetKeysUsedForTagAuthenticationRequestModelBuilder appId(String appId) {
        getKeysUsedForTagAuthenticationRequestModel.setAppId(appId);
        return this;
    }

    public GetKeysUsedForTagAuthenticationRequestModelBuilder tagIds(List<String> tagIds) {
        getKeysUsedForTagAuthenticationRequestModel.setTagIds(tagIds);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetKeysUsedForTagAuthenticationRequestModel build() {
        return getKeysUsedForTagAuthenticationRequestModel;
    }
}