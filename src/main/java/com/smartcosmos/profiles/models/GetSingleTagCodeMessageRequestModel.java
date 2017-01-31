/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetSingleTagCodeMessageRequestModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5048227872897195120L;
    private int tagCode;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("tagCode")
    public int getTagCode ( ) { 
        return this.tagCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("tagCode")
    public void setTagCode (int value) { 
        this.tagCode = value;
    }
 
}
 