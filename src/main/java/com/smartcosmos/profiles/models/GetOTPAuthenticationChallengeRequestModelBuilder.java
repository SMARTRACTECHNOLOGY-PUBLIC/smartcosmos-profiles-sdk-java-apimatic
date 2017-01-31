/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class GetOTPAuthenticationChallengeRequestModelBuilder {
    //the instance to build
    private GetOTPAuthenticationChallengeRequestModel getOTPAuthenticationChallengeRequestModel;

    /**
     * Default constructor to initialize the instance
     */
    public GetOTPAuthenticationChallengeRequestModelBuilder() {
        getOTPAuthenticationChallengeRequestModel = new GetOTPAuthenticationChallengeRequestModel();
    }

    public GetOTPAuthenticationChallengeRequestModelBuilder appId(String appId) {
        getOTPAuthenticationChallengeRequestModel.setAppId(appId);
        return this;
    }

    public GetOTPAuthenticationChallengeRequestModelBuilder tagId(String tagId) {
        getOTPAuthenticationChallengeRequestModel.setTagId(tagId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetOTPAuthenticationChallengeRequestModel build() {
        return getOTPAuthenticationChallengeRequestModel;
    }
}