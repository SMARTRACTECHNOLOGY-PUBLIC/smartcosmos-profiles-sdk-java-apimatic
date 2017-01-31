/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class FileTransmissionRequestResponseModelBuilder {
    //the instance to build
    private FileTransmissionRequestResponseModel fileTransmissionRequestResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public FileTransmissionRequestResponseModelBuilder() {
        fileTransmissionRequestResponseModel = new FileTransmissionRequestResponseModel();
    }

    public FileTransmissionRequestResponseModelBuilder endpointUri(String endpointUri) {
        fileTransmissionRequestResponseModel.setEndpointUri(endpointUri);
        return this;
    }

    public FileTransmissionRequestResponseModelBuilder protocol(String protocol) {
        fileTransmissionRequestResponseModel.setProtocol(protocol);
        return this;
    }

    public FileTransmissionRequestResponseModelBuilder transmissionUrn(String transmissionUrn) {
        fileTransmissionRequestResponseModel.setTransmissionUrn(transmissionUrn);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FileTransmissionRequestResponseModel build() {
        return fileTransmissionRequestResponseModel;
    }
}