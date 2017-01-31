/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FileTransmissionReceiptRequestModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4816294251926555746L;
    private String transmissionResult;
    private String transmissionUrn;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("transmissionResult")
    public String getTransmissionResult ( ) { 
        return this.transmissionResult;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("transmissionResult")
    public void setTransmissionResult (String value) { 
        this.transmissionResult = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("transmissionUrn")
    public String getTransmissionUrn ( ) { 
        return this.transmissionUrn;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("transmissionUrn")
    public void setTransmissionUrn (String value) { 
        this.transmissionUrn = value;
    }
 
}
 