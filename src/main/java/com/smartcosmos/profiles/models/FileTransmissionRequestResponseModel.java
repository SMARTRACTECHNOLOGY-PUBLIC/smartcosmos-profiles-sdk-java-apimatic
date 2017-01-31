/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FileTransmissionRequestResponseModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5030214331466729410L;
    private String endpointUri;
    private String protocol;
    private String transmissionUrn;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("endpointUri")
    public String getEndpointUri ( ) { 
        return this.endpointUri;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("endpointUri")
    public void setEndpointUri (String value) { 
        this.endpointUri = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("protocol")
    public String getProtocol ( ) { 
        return this.protocol;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("protocol")
    public void setProtocol (String value) { 
        this.protocol = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("transmissionUrn")
    public String getTransmissionUrn ( ) { 
        return this.transmissionUrn;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("transmissionUrn")
    public void setTransmissionUrn (String value) { 
        this.transmissionUrn = value;
    }
 
}
 