/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class GetSingleTagCodeMessageRequestModelBuilder {
    //the instance to build
    private GetSingleTagCodeMessageRequestModel getSingleTagCodeMessageRequestModel;

    /**
     * Default constructor to initialize the instance
     */
    public GetSingleTagCodeMessageRequestModelBuilder() {
        getSingleTagCodeMessageRequestModel = new GetSingleTagCodeMessageRequestModel();
    }

    public GetSingleTagCodeMessageRequestModelBuilder tagCode(int tagCode) {
        getSingleTagCodeMessageRequestModel.setTagCode(tagCode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetSingleTagCodeMessageRequestModel build() {
        return getSingleTagCodeMessageRequestModel;
    }
}