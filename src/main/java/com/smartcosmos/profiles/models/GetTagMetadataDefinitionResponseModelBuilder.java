/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class GetTagMetadataDefinitionResponseModelBuilder {
    //the instance to build
    private GetTagMetadataDefinitionResponseModel getTagMetadataDefinitionResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public GetTagMetadataDefinitionResponseModelBuilder() {
        getTagMetadataDefinitionResponseModel = new GetTagMetadataDefinitionResponseModel();
    }

    public GetTagMetadataDefinitionResponseModelBuilder code(int code) {
        getTagMetadataDefinitionResponseModel.setCode(code);
        return this;
    }

    public GetTagMetadataDefinitionResponseModelBuilder properties(List<Object> properties) {
        getTagMetadataDefinitionResponseModel.setProperties(properties);
        return this;
    }

    public GetTagMetadataDefinitionResponseModelBuilder tagId(String tagId) {
        getTagMetadataDefinitionResponseModel.setTagId(tagId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetTagMetadataDefinitionResponseModel build() {
        return getTagMetadataDefinitionResponseModel;
    }
}