/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ValidateOTPEncryptionResultRequestModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4962785379898952188L;
    private String otpRequestId;
    private int otpResult;
    private int timestamp;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("otpRequestId")
    public String getOtpRequestId ( ) { 
        return this.otpRequestId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("otpRequestId")
    public void setOtpRequestId (String value) { 
        this.otpRequestId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("otpResult")
    public int getOtpResult ( ) { 
        return this.otpResult;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("otpResult")
    public void setOtpResult (int value) { 
        this.otpResult = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("timestamp")
    public int getTimestamp ( ) { 
        return this.timestamp;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("timestamp")
    public void setTimestamp (int value) { 
        this.timestamp = value;
    }
 
}
 