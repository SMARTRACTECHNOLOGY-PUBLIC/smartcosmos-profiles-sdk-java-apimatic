/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class QueryBatchesResponseModelBuilder {
    //the instance to build
    private QueryBatchesResponseModel queryBatchesResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public QueryBatchesResponseModelBuilder() {
        queryBatchesResponseModel = new QueryBatchesResponseModel();
    }

    public QueryBatchesResponseModelBuilder batchUrns(List<String> batchUrns) {
        queryBatchesResponseModel.setBatchUrns(batchUrns);
        return this;
    }

    public QueryBatchesResponseModelBuilder code(int code) {
        queryBatchesResponseModel.setCode(code);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public QueryBatchesResponseModel build() {
        return queryBatchesResponseModel;
    }
}