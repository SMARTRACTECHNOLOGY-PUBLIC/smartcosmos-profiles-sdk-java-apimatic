/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetOTPAuthenticationChallengeRequestModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5675682502686474665L;
    private String appId;
    private String tagId;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("appId")
    public String getAppId ( ) { 
        return this.appId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("appId")
    public void setAppId (String value) { 
        this.appId = value;
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
 