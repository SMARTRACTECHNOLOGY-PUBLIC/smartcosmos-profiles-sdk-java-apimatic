/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class ValidateOTPEncryptionResultResponseModelBuilder {
    //the instance to build
    private ValidateOTPEncryptionResultResponseModel validateOTPEncryptionResultResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public ValidateOTPEncryptionResultResponseModelBuilder() {
        validateOTPEncryptionResultResponseModel = new ValidateOTPEncryptionResultResponseModel();
    }

    public ValidateOTPEncryptionResultResponseModelBuilder code(int code) {
        validateOTPEncryptionResultResponseModel.setCode(code);
        return this;
    }

    public ValidateOTPEncryptionResultResponseModelBuilder message(String message) {
        validateOTPEncryptionResultResponseModel.setMessage(message);
        return this;
    }

    public ValidateOTPEncryptionResultResponseModelBuilder tagId(String tagId) {
        validateOTPEncryptionResultResponseModel.setTagId(tagId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ValidateOTPEncryptionResultResponseModel build() {
        return validateOTPEncryptionResultResponseModel;
    }
}