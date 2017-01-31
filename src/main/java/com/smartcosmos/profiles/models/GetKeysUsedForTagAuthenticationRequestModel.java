/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetKeysUsedForTagAuthenticationRequestModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5674676829677947306L;
    private String appId;
    private List<String> tagIds;
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
    @JsonGetter("tagIds")
    public List<String> getTagIds ( ) { 
        return this.tagIds;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("tagIds")
    public void setTagIds (List<String> value) { 
        this.tagIds = value;
    }
 
}
 