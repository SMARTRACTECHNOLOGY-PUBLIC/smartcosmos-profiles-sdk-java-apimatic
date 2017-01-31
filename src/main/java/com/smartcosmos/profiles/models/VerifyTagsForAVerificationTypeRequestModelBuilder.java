/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class VerifyTagsForAVerificationTypeRequestModelBuilder {
    //the instance to build
    private VerifyTagsForAVerificationTypeRequestModel verifyTagsForAVerificationTypeRequestModel;

    /**
     * Default constructor to initialize the instance
     */
    public VerifyTagsForAVerificationTypeRequestModelBuilder() {
        verifyTagsForAVerificationTypeRequestModel = new VerifyTagsForAVerificationTypeRequestModel();
    }

    public VerifyTagsForAVerificationTypeRequestModelBuilder tagIds(List<String> tagIds) {
        verifyTagsForAVerificationTypeRequestModel.setTagIds(tagIds);
        return this;
    }

    public VerifyTagsForAVerificationTypeRequestModelBuilder verificationType(String verificationType) {
        verifyTagsForAVerificationTypeRequestModel.setVerificationType(verificationType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VerifyTagsForAVerificationTypeRequestModel build() {
        return verifyTagsForAVerificationTypeRequestModel;
    }
}