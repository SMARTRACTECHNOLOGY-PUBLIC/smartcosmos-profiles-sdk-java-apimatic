/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetVerificationStateMessageRequestModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4929866854681837491L;
    private int verificationState;
    private String verificationType;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("verificationState")
    public int getVerificationState ( ) { 
        return this.verificationState;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("verificationState")
    public void setVerificationState (int value) { 
        this.verificationState = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("verificationType")
    public String getVerificationType ( ) { 
        return this.verificationType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("verificationType")
    public void setVerificationType (String value) { 
        this.verificationType = value;
    }
 
}
 