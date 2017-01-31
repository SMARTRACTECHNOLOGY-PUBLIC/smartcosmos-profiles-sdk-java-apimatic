/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

import com.smartcosmos.profiles.*;
import com.smartcosmos.profiles.models.*;
import com.smartcosmos.profiles.exceptions.*;
import com.smartcosmos.profiles.http.client.HttpClient;
import com.smartcosmos.profiles.http.client.HttpContext;
import com.smartcosmos.profiles.http.request.HttpRequest;
import com.smartcosmos.profiles.http.response.HttpResponse;
import com.smartcosmos.profiles.http.response.HttpStringResponse;
import com.smartcosmos.profiles.http.client.APICallBack;
import com.smartcosmos.profiles.controllers.syncwrapper.APICallBackCatcher;

public class PlatformAvailabilityEndpointsController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static PlatformAvailabilityEndpointsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the PlatformAvailabilityEndpointsController class 
     */
    public static PlatformAvailabilityEndpointsController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new PlatformAvailabilityEndpointsController();
            }
        }
        return instance;
    }

    /**
     * Resource for checking the platform availability. 
     * ### HTTP result codes
     * This endpoint will respond with an appropriate HTTP status code to indicate the actual result
     * - **204 NO_CONTENT** platform is available
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * - **503 SERVICE_UNAVAILABLE** service is temporary unavailable (e.g. scheduled Platform Maintenance). Try again later.
     * @return    Returns the DynamicResponse response from the API call 
     */
    public DynamicResponse getCheckPlatformAvailability(
    ) throws Throwable {
        APICallBackCatcher<DynamicResponse> callback = new APICallBackCatcher<DynamicResponse>();
        getCheckPlatformAvailabilityAsync(callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Resource for checking the platform availability. 
     * ### HTTP result codes
     * This endpoint will respond with an appropriate HTTP status code to indicate the actual result
     * - **204 NO_CONTENT** platform is available
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * - **503 SERVICE_UNAVAILABLE** service is temporary unavailable (e.g. scheduled Platform Maintenance). Try again later.
     * @return    Returns the void response from the API call 
     */
    public void getCheckPlatformAvailabilityAsync(
                final APICallBack<DynamicResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/rest/test/ping");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5324568744011422811L;
            {
                    put( "user-agent", "SMARTCOSMOS SDK 1.0" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null,
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();
                            if (_responseCode == 400)
                                throw new APIException("Unexpected error in API call. See HTTP response body for details.", _context);

                            if (_responseCode == 503)
                                throw new APIException("", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            DynamicResponse _result = new DynamicResponse(_response);

                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}