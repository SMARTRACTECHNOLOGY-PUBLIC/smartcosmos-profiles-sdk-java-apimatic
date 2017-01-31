/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VerifyNXPTagSignatureRequestModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4990061997813955756L;
    private String signature;
    private String tagId;
    private String tagVersion;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("signature")
    public String getSignature ( ) { 
        return this.signature;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("signature")
    public void setSignature (String value) { 
        this.signature = value;
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
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("tagVersion")
    public String getTagVersion ( ) { 
        return this.tagVersion;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("tagVersion")
    public void setTagVersion (String value) { 
        this.tagVersion = value;
    }
 
}
 