/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class VerifyNXPTagSignatureResponseModelBuilder {
    //the instance to build
    private VerifyNXPTagSignatureResponseModel verifyNXPTagSignatureResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public VerifyNXPTagSignatureResponseModelBuilder() {
        verifyNXPTagSignatureResponseModel = new VerifyNXPTagSignatureResponseModel();
    }

    public VerifyNXPTagSignatureResponseModelBuilder code(int code) {
        verifyNXPTagSignatureResponseModel.setCode(code);
        return this;
    }

    public VerifyNXPTagSignatureResponseModelBuilder message(String message) {
        verifyNXPTagSignatureResponseModel.setMessage(message);
        return this;
    }

    public VerifyNXPTagSignatureResponseModelBuilder tagId(String tagId) {
        verifyNXPTagSignatureResponseModel.setTagId(tagId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VerifyNXPTagSignatureResponseModel build() {
        return verifyNXPTagSignatureResponseModel;
    }
}