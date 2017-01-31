/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class VerifyTagsForAVerificationTypeResponseModelBuilder {
    //the instance to build
    private VerifyTagsForAVerificationTypeResponseModel verifyTagsForAVerificationTypeResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public VerifyTagsForAVerificationTypeResponseModelBuilder() {
        verifyTagsForAVerificationTypeResponseModel = new VerifyTagsForAVerificationTypeResponseModel();
    }

    public VerifyTagsForAVerificationTypeResponseModelBuilder code(int code) {
        verifyTagsForAVerificationTypeResponseModel.setCode(code);
        return this;
    }

    public VerifyTagsForAVerificationTypeResponseModelBuilder result(List<Object> result) {
        verifyTagsForAVerificationTypeResponseModel.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VerifyTagsForAVerificationTypeResponseModel build() {
        return verifyTagsForAVerificationTypeResponseModel;
    }
}