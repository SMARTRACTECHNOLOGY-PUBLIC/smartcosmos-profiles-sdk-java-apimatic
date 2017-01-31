/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class QueryTagsResponseModelBuilder {
    //the instance to build
    private QueryTagsResponseModel queryTagsResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public QueryTagsResponseModelBuilder() {
        queryTagsResponseModel = new QueryTagsResponseModel();
    }

    public QueryTagsResponseModelBuilder code(int code) {
        queryTagsResponseModel.setCode(code);
        return this;
    }

    public QueryTagsResponseModelBuilder tagIds(List<String> tagIds) {
        queryTagsResponseModel.setTagIds(tagIds);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public QueryTagsResponseModel build() {
        return queryTagsResponseModel;
    }
}