/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.type.TypeReference;

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

public class TagDeliveryNetworkEndpointsController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static TagDeliveryNetworkEndpointsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the TagDeliveryNetworkEndpointsController class 
     */
    public static TagDeliveryNetworkEndpointsController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new TagDeliveryNetworkEndpointsController();
            }
        }
        return instance;
    }

    /**
     * **DRAFT** - Under development
     * Get TDN data for a tag. The TDN data is proprietary and needs the SMART COSMOS TDN client
     * service on the REST client for decoding. The endpoint will report "404 Not found" for all
     * tags with no TDN data attached (so it is not possible to probe the Profiles instance for 
     * no-TDN tag IDs without authorization).
     * ### Notes
     *  - Public endpoint (no authorization needed)
     *  - If a secure endpoint is needed, it is possible to disable this endpoint and use GetTagValue with "TDN" as appId instead.
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate
     * the actual result.
     * - **200 OK** valid TDN tag ID
     * - **404 NOT_FOUND** invalid tag ID (tag not available or no TDN data attached)
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - value (string, `54646E50726F707269657461727944617461`) ... TDN data (AsciiHex encoded)
     * @param    tagId    Required parameter: Example: 
     * @return    Returns the GetTagDeliveryNetworkDataResponseModel response from the API call 
     */
    public GetTagDeliveryNetworkDataResponseModel getTagDeliveryNetworkData(
                final String tagId
    ) throws Throwable {
        APICallBackCatcher<GetTagDeliveryNetworkDataResponseModel> callback = new APICallBackCatcher<GetTagDeliveryNetworkDataResponseModel>();
        getTagDeliveryNetworkDataAsync(tagId, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * **DRAFT** - Under development
     * Get TDN data for a tag. The TDN data is proprietary and needs the SMART COSMOS TDN client
     * service on the REST client for decoding. The endpoint will report "404 Not found" for all
     * tags with no TDN data attached (so it is not possible to probe the Profiles instance for 
     * no-TDN tag IDs without authorization).
     * ### Notes
     *  - Public endpoint (no authorization needed)
     *  - If a secure endpoint is needed, it is possible to disable this endpoint and use GetTagValue with "TDN" as appId instead.
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate
     * the actual result.
     * - **200 OK** valid TDN tag ID
     * - **404 NOT_FOUND** invalid tag ID (tag not available or no TDN data attached)
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - value (string, `54646E50726F707269657461727944617461`) ... TDN data (AsciiHex encoded)
     * @param    tagId    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void getTagDeliveryNetworkDataAsync(
                final String tagId,
                final APICallBack<GetTagDeliveryNetworkDataResponseModel> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/rest/tag/tdn/{tagId}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4755308013973923765L;
            {
                    put( "tagId", tagId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5727427769587640936L;
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
                            if (_responseCode == 404)
                                throw new APIException("", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            GetTagDeliveryNetworkDataResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetTagDeliveryNetworkDataResponseModel>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
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