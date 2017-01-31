/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class VerifyTagsForRoundRockComplianceRequestModelBuilder {
    //the instance to build
    private VerifyTagsForRoundRockComplianceRequestModel verifyTagsForRoundRockComplianceRequestModel;

    /**
     * Default constructor to initialize the instance
     */
    public VerifyTagsForRoundRockComplianceRequestModelBuilder() {
        verifyTagsForRoundRockComplianceRequestModel = new VerifyTagsForRoundRockComplianceRequestModel();
    }

    public VerifyTagsForRoundRockComplianceRequestModelBuilder tagIds(List<String> tagIds) {
        verifyTagsForRoundRockComplianceRequestModel.setTagIds(tagIds);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VerifyTagsForRoundRockComplianceRequestModel build() {
        return verifyTagsForRoundRockComplianceRequestModel;
    }
}