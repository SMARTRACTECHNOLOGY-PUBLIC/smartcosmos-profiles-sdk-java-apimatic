/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetTagDeliveryNetworkDataResponseModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4879634264506304232L;
    private int code;
    private String value;
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
    @JsonGetter("value")
    public String getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("value")
    public void setValue (String value) { 
        this.value = value;
    }
 
}
 