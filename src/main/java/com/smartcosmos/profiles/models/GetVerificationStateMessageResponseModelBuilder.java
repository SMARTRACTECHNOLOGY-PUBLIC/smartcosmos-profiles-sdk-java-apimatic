/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class GetVerificationStateMessageResponseModelBuilder {
    //the instance to build
    private GetVerificationStateMessageResponseModel getVerificationStateMessageResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public GetVerificationStateMessageResponseModelBuilder() {
        getVerificationStateMessageResponseModel = new GetVerificationStateMessageResponseModel();
    }

    public GetVerificationStateMessageResponseModelBuilder code(int code) {
        getVerificationStateMessageResponseModel.setCode(code);
        return this;
    }

    public GetVerificationStateMessageResponseModelBuilder message(String message) {
        getVerificationStateMessageResponseModel.setMessage(message);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetVerificationStateMessageResponseModel build() {
        return getVerificationStateMessageResponseModel;
    }
}