/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class QueryBatchesResponseModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5327573828696066582L;
    private List<String> batchUrns;
    private int code;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("batchUrns")
    public List<String> getBatchUrns ( ) { 
        return this.batchUrns;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("batchUrns")
    public void setBatchUrns (List<String> value) { 
        this.batchUrns = value;
    }
 
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
 
}
 