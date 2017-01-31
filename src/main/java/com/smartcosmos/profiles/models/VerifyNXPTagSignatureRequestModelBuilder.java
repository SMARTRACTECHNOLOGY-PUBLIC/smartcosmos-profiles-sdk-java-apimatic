/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class VerifyNXPTagSignatureRequestModelBuilder {
    //the instance to build
    private VerifyNXPTagSignatureRequestModel verifyNXPTagSignatureRequestModel;

    /**
     * Default constructor to initialize the instance
     */
    public VerifyNXPTagSignatureRequestModelBuilder() {
        verifyNXPTagSignatureRequestModel = new VerifyNXPTagSignatureRequestModel();
    }

    public VerifyNXPTagSignatureRequestModelBuilder signature(String signature) {
        verifyNXPTagSignatureRequestModel.setSignature(signature);
        return this;
    }

    public VerifyNXPTagSignatureRequestModelBuilder tagId(String tagId) {
        verifyNXPTagSignatureRequestModel.setTagId(tagId);
        return this;
    }

    public VerifyNXPTagSignatureRequestModelBuilder tagVersion(String tagVersion) {
        verifyNXPTagSignatureRequestModel.setTagVersion(tagVersion);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VerifyNXPTagSignatureRequestModel build() {
        return verifyNXPTagSignatureRequestModel;
    }
}