/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FileTransmissionRequestRequestModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5449822209306597705L;
    private int contentLength;
    private String md5Checksum;
    private String mimeType;
    private String routingUrn;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("contentLength")
    public int getContentLength ( ) { 
        return this.contentLength;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("contentLength")
    public void setContentLength (int value) { 
        this.contentLength = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("md5Checksum")
    public String getMd5Checksum ( ) { 
        return this.md5Checksum;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("md5Checksum")
    public void setMd5Checksum (String value) { 
        this.md5Checksum = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("mimeType")
    public String getMimeType ( ) { 
        return this.mimeType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("mimeType")
    public void setMimeType (String value) { 
        this.mimeType = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("routingUrn")
    public String getRoutingUrn ( ) { 
        return this.routingUrn;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("routingUrn")
    public void setRoutingUrn (String value) { 
        this.routingUrn = value;
    }
 
}
 