/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetOTPAuthenticationChallengeResponseModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5141519870430965726L;
    private int code;
    private String message;
    private String otpRequestId;
    private String otpVector;
    private String tagId;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("code")
    public int getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("code")
    public void setCode (int value) { 
        this.code = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("message")
    public void setMessage (String value) { 
        this.message = value;
    }
 
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
    @JsonGetter("otpVector")
    public String getOtpVector ( ) { 
        return this.otpVector;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("otpVector")
    public void setOtpVector (String value) { 
        this.otpVector = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("tagId")
    public String getTagId ( ) { 
        return this.tagId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("tagId")
    public void setTagId (String value) { 
        this.tagId = value;
    }
 
}
 