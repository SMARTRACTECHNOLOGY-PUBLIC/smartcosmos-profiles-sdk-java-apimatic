/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetTagMetadataRequestModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4955156868348593661L;
    private List<String> properties;
    private List<String> tagIds;
    private List<String> verificationTypes;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("properties")
    public List<String> getProperties ( ) { 
        return this.properties;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("properties")
    public void setProperties (List<String> value) { 
        this.properties = value;
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
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("verificationTypes")
    public List<String> getVerificationTypes ( ) { 
        return this.verificationTypes;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("verificationTypes")
    public void setVerificationTypes (List<String> value) { 
        this.verificationTypes = value;
    }
 
}
 