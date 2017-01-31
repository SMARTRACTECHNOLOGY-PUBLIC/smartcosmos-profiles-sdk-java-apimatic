/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.controllers;

import com.smartcosmos.profiles.exceptions.*;
import com.smartcosmos.profiles.http.client.HttpClient;
import com.smartcosmos.profiles.http.client.HttpContext;
import com.smartcosmos.profiles.http.client.HttpCallBack;
import com.smartcosmos.profiles.http.client.UnirestClient;
import com.smartcosmos.profiles.http.response.HttpResponse;

public abstract class BaseController {
    /**
     * Private variable to keep shared reference of client instance
     */
    private static HttpClient clientInstance = null;
    private static Object syncObject = new Object();

    /**
     * Protected variable to keep reference of httpCallBack instance if user provides any
     */
    protected HttpCallBack httpCallBack = null;
    
    /**
     * Get httpCallBack associated with this controller
     * @return HttpCallBack
     */
    public HttpCallBack getHttpCallBack() {
        return httpCallBack;
    }
    
    /**
     * Set the httpCallBack for this controller
     * @param httpCallBack
     */
    public void setHttpCallBack(HttpCallBack httpCallBack) {
        this.httpCallBack = httpCallBack;
    }

    /**
     * Shared instance of the Http client
     * @return The shared instance of the http client 
     */
    public static HttpClient getClientInstance() {
        synchronized (syncObject) {
            if (null == clientInstance) {
                clientInstance = UnirestClient.getSharedInstance();
    }
        }
        return clientInstance;
    }

    /**
     * Shared instance of the Http client
     * @param    client    The shared instance of the http client 
     */
    public static void setClientInstance(HttpClient client) {
        synchronized (syncObject) {
            if (null != client) {
                clientInstance = client;
            }
        }
    }

    /**
     * Validates the response against HTTP errors defined at the API level
     * @param   response    The response recieved
     * @param   context     Context of the request and the recieved response 
     */
    protected void validateResponse(HttpResponse response, HttpContext context) 
            throws APIException {
        //get response status code to validate
        int responseCode = response.getStatusCode();
        if ((responseCode < 200) || (responseCode > 208)) //[200,208] = HTTP OK
            throw new APIException("HTTP Response Not OK", context);
    }
}
