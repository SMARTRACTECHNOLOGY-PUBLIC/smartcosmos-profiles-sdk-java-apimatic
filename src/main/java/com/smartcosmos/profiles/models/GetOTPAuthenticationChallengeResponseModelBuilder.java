/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class GetOTPAuthenticationChallengeResponseModelBuilder {
    //the instance to build
    private GetOTPAuthenticationChallengeResponseModel getOTPAuthenticationChallengeResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public GetOTPAuthenticationChallengeResponseModelBuilder() {
        getOTPAuthenticationChallengeResponseModel = new GetOTPAuthenticationChallengeResponseModel();
    }

    public GetOTPAuthenticationChallengeResponseModelBuilder code(int code) {
        getOTPAuthenticationChallengeResponseModel.setCode(code);
        return this;
    }

    public GetOTPAuthenticationChallengeResponseModelBuilder message(String message) {
        getOTPAuthenticationChallengeResponseModel.setMessage(message);
        return this;
    }

    public GetOTPAuthenticationChallengeResponseModelBuilder otpRequestId(String otpRequestId) {
        getOTPAuthenticationChallengeResponseModel.setOtpRequestId(otpRequestId);
        return this;
    }

    public GetOTPAuthenticationChallengeResponseModelBuilder otpVector(String otpVector) {
        getOTPAuthenticationChallengeResponseModel.setOtpVector(otpVector);
        return this;
    }

    public GetOTPAuthenticationChallengeResponseModelBuilder tagId(String tagId) {
        getOTPAuthenticationChallengeResponseModel.setTagId(tagId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetOTPAuthenticationChallengeResponseModel build() {
        return getOTPAuthenticationChallengeResponseModel;
    }
}