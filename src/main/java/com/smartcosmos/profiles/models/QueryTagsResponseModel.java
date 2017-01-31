/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class QueryTagsResponseModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4621880406588526314L;
    private int code;
    private List<String> tagIds;
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
 