/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VerifyTagsForRoundRockComplianceRequestModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5737252104309285351L;
    private List<String> tagIds;
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
 