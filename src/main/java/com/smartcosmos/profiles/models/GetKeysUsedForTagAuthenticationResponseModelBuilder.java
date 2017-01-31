/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class GetKeysUsedForTagAuthenticationResponseModelBuilder {
    //the instance to build
    private GetKeysUsedForTagAuthenticationResponseModel getKeysUsedForTagAuthenticationResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public GetKeysUsedForTagAuthenticationResponseModelBuilder() {
        getKeysUsedForTagAuthenticationResponseModel = new GetKeysUsedForTagAuthenticationResponseModel();
    }

    public GetKeysUsedForTagAuthenticationResponseModelBuilder code(int code) {
        getKeysUsedForTagAuthenticationResponseModel.setCode(code);
        return this;
    }

    public GetKeysUsedForTagAuthenticationResponseModelBuilder result(List<Object> result) {
        getKeysUsedForTagAuthenticationResponseModel.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetKeysUsedForTagAuthenticationResponseModel build() {
        return getKeysUsedForTagAuthenticationResponseModel;
    }
}