/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;

public class FileTransmissionRequestRequestModelBuilder {
    //the instance to build
    private FileTransmissionRequestRequestModel fileTransmissionRequestRequestModel;

    /**
     * Default constructor to initialize the instance
     */
    public FileTransmissionRequestRequestModelBuilder() {
        fileTransmissionRequestRequestModel = new FileTransmissionRequestRequestModel();
    }

    public FileTransmissionRequestRequestModelBuilder contentLength(int contentLength) {
        fileTransmissionRequestRequestModel.setContentLength(contentLength);
        return this;
    }

    public FileTransmissionRequestRequestModelBuilder md5Checksum(String md5Checksum) {
        fileTransmissionRequestRequestModel.setMd5Checksum(md5Checksum);
        return this;
    }

    public FileTransmissionRequestRequestModelBuilder mimeType(String mimeType) {
        fileTransmissionRequestRequestModel.setMimeType(mimeType);
        return this;
    }

    public FileTransmissionRequestRequestModelBuilder routingUrn(String routingUrn) {
        fileTransmissionRequestRequestModel.setRoutingUrn(routingUrn);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FileTransmissionRequestRequestModel build() {
        return fileTransmissionRequestRequestModel;
    }
}