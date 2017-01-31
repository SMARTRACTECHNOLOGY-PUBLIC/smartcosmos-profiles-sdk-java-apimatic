/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UpdateTagValuesRequestModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5247271807499679318L;
    private String appId;
    private List<Object> tags;
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
    @JsonGetter("tags")
    public List<Object> getTags ( ) { 
        return this.tags;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("tags")
    public void setTags (List<Object> value) { 
        this.tags = value;
    }
 
}
 