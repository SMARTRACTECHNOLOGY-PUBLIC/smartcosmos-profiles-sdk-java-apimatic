/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4934754699207840169L;
    private Object account;
    private List<Object> metadata;
    private List<Object> objectAddresses;
    private List<Object> objects;
    private List<Object> relationships;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("account")
    public Object getAccount ( ) { 
        return this.account;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("account")
    public void setAccount (Object value) { 
        this.account = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("metadata")
    public List<Object> getMetadata ( ) { 
        return this.metadata;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("metadata")
    public void setMetadata (List<Object> value) { 
        this.metadata = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("objectAddresses")
    public List<Object> getObjectAddresses ( ) { 
        return this.objectAddresses;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("objectAddresses")
    public void setObjectAddresses (List<Object> value) { 
        this.objectAddresses = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("objects")
    public List<Object> getObjects ( ) { 
        return this.objects;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("objects")
    public void setObjects (List<Object> value) { 
        this.objects = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("relationships")
    public List<Object> getRelationships ( ) { 
        return this.relationships;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("relationships")
    public void setRelationships (List<Object> value) { 
        this.relationships = value;
    }
 
}
 