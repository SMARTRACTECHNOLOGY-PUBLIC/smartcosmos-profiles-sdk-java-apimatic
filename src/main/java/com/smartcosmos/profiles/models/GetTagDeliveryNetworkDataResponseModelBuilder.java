/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class GetTagDeliveryNetworkDataResponseModelBuilder {
    //the instance to build
    private GetTagDeliveryNetworkDataResponseModel getTagDeliveryNetworkDataResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public GetTagDeliveryNetworkDataResponseModelBuilder() {
        getTagDeliveryNetworkDataResponseModel = new GetTagDeliveryNetworkDataResponseModel();
    }

    public GetTagDeliveryNetworkDataResponseModelBuilder code(int code) {
        getTagDeliveryNetworkDataResponseModel.setCode(code);
        return this;
    }

    public GetTagDeliveryNetworkDataResponseModelBuilder value(String value) {
        getTagDeliveryNetworkDataResponseModel.setValue(value);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetTagDeliveryNetworkDataResponseModel build() {
        return getTagDeliveryNetworkDataResponseModel;
    }
}