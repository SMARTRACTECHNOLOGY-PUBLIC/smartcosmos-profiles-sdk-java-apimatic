/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles;

import com.smartcosmos.profiles.controllers.*;
import com.smartcosmos.profiles.http.client.HttpClient;

public class SMARTCOSMOSProfilesClient {
    /**
     * Singleton access to DataImportEndpoints controller
     * @return	Returns the DataImportEndpointsController instance 
     */
    public DataImportEndpointsController getDataImportEndpoints() {
        return DataImportEndpointsController.getInstance();
    }

    /**
     * Singleton access to TagDataEndpoints controller
     * @return	Returns the TagDataEndpointsController instance 
     */
    public TagDataEndpointsController getTagDataEndpoints() {
        return TagDataEndpointsController.getInstance();
    }

    /**
     * Singleton access to TagDeliveryNetworkEndpoints controller
     * @return	Returns the TagDeliveryNetworkEndpointsController instance 
     */
    public TagDeliveryNetworkEndpointsController getTagDeliveryNetworkEndpoints() {
        return TagDeliveryNetworkEndpointsController.getInstance();
    }

    /**
     * Singleton access to TransactionEndpoints controller
     * @return	Returns the TransactionEndpointsController instance 
     */
    public TransactionEndpointsController getTransactionEndpoints() {
        return TransactionEndpointsController.getInstance();
    }

    /**
     * Singleton access to TagAuthenticationEndpoints controller
     * @return	Returns the TagAuthenticationEndpointsController instance 
     */
    public TagAuthenticationEndpointsController getTagAuthenticationEndpoints() {
        return TagAuthenticationEndpointsController.getInstance();
    }

    /**
     * Singleton access to TagVerificationEndpoints controller
     * @return	Returns the TagVerificationEndpointsController instance 
     */
    public TagVerificationEndpointsController getTagVerificationEndpoints() {
        return TagVerificationEndpointsController.getInstance();
    }

    /**
     * Singleton access to PlatformAvailabilityEndpoints controller
     * @return	Returns the PlatformAvailabilityEndpointsController instance 
     */
    public PlatformAvailabilityEndpointsController getPlatformAvailabilityEndpoints() {
        return PlatformAvailabilityEndpointsController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public SMARTCOSMOSProfilesClient() {	
	}

    /**
     * Client initialization constructor 
     */     
    public SMARTCOSMOSProfilesClient(String basicAuthUserName, String basicAuthPassword) {
        this();
        Configuration.basicAuthUserName = basicAuthUserName;
        Configuration.basicAuthPassword = basicAuthPassword;
    }
}