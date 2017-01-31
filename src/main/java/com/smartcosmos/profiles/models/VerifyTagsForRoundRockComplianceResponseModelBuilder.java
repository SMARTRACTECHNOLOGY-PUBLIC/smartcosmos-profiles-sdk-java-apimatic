/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class VerifyTagsForRoundRockComplianceResponseModelBuilder {
    //the instance to build
    private VerifyTagsForRoundRockComplianceResponseModel verifyTagsForRoundRockComplianceResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public VerifyTagsForRoundRockComplianceResponseModelBuilder() {
        verifyTagsForRoundRockComplianceResponseModel = new VerifyTagsForRoundRockComplianceResponseModel();
    }

    public VerifyTagsForRoundRockComplianceResponseModelBuilder code(int code) {
        verifyTagsForRoundRockComplianceResponseModel.setCode(code);
        return this;
    }

    public VerifyTagsForRoundRockComplianceResponseModelBuilder result(List<Object> result) {
        verifyTagsForRoundRockComplianceResponseModel.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VerifyTagsForRoundRockComplianceResponseModel build() {
        return verifyTagsForRoundRockComplianceResponseModel;
    }
}