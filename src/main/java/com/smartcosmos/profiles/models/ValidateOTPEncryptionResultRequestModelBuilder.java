/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class ValidateOTPEncryptionResultRequestModelBuilder {
    //the instance to build
    private ValidateOTPEncryptionResultRequestModel validateOTPEncryptionResultRequestModel;

    /**
     * Default constructor to initialize the instance
     */
    public ValidateOTPEncryptionResultRequestModelBuilder() {
        validateOTPEncryptionResultRequestModel = new ValidateOTPEncryptionResultRequestModel();
    }

    public ValidateOTPEncryptionResultRequestModelBuilder otpRequestId(String otpRequestId) {
        validateOTPEncryptionResultRequestModel.setOtpRequestId(otpRequestId);
        return this;
    }

    public ValidateOTPEncryptionResultRequestModelBuilder otpResult(int otpResult) {
        validateOTPEncryptionResultRequestModel.setOtpResult(otpResult);
        return this;
    }

    public ValidateOTPEncryptionResultRequestModelBuilder timestamp(int timestamp) {
        validateOTPEncryptionResultRequestModel.setTimestamp(timestamp);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ValidateOTPEncryptionResultRequestModel build() {
        return validateOTPEncryptionResultRequestModel;
    }
}