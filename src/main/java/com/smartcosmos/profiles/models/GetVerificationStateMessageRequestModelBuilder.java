/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class GetVerificationStateMessageRequestModelBuilder {
    //the instance to build
    private GetVerificationStateMessageRequestModel getVerificationStateMessageRequestModel;

    /**
     * Default constructor to initialize the instance
     */
    public GetVerificationStateMessageRequestModelBuilder() {
        getVerificationStateMessageRequestModel = new GetVerificationStateMessageRequestModel();
    }

    public GetVerificationStateMessageRequestModelBuilder verificationState(int verificationState) {
        getVerificationStateMessageRequestModel.setVerificationState(verificationState);
        return this;
    }

    public GetVerificationStateMessageRequestModelBuilder verificationType(String verificationType) {
        getVerificationStateMessageRequestModel.setVerificationType(verificationType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetVerificationStateMessageRequestModel build() {
        return getVerificationStateMessageRequestModel;
    }
}