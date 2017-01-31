/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class FileTransmissionReceiptRequestModelBuilder {
    //the instance to build
    private FileTransmissionReceiptRequestModel fileTransmissionReceiptRequestModel;

    /**
     * Default constructor to initialize the instance
     */
    public FileTransmissionReceiptRequestModelBuilder() {
        fileTransmissionReceiptRequestModel = new FileTransmissionReceiptRequestModel();
    }

    public FileTransmissionReceiptRequestModelBuilder transmissionResult(String transmissionResult) {
        fileTransmissionReceiptRequestModel.setTransmissionResult(transmissionResult);
        return this;
    }

    public FileTransmissionReceiptRequestModelBuilder transmissionUrn(String transmissionUrn) {
        fileTransmissionReceiptRequestModel.setTransmissionUrn(transmissionUrn);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FileTransmissionReceiptRequestModel build() {
        return fileTransmissionReceiptRequestModel;
    }
}