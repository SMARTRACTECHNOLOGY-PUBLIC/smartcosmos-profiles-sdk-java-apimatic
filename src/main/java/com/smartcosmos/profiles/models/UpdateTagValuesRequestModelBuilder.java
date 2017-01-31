/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class UpdateTagValuesRequestModelBuilder {
    //the instance to build
    private UpdateTagValuesRequestModel updateTagValuesRequestModel;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateTagValuesRequestModelBuilder() {
        updateTagValuesRequestModel = new UpdateTagValuesRequestModel();
    }

    public UpdateTagValuesRequestModelBuilder appId(String appId) {
        updateTagValuesRequestModel.setAppId(appId);
        return this;
    }

    public UpdateTagValuesRequestModelBuilder tags(List<Object> tags) {
        updateTagValuesRequestModel.setTags(tags);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateTagValuesRequestModel build() {
        return updateTagValuesRequestModel;
    }
}