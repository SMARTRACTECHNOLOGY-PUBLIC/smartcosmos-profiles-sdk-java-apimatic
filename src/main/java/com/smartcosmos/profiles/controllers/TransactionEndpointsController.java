/*
 * SMARTCOSMOSProfilesLib
 *
 * This file was automatically generated for SMARTRAC Technology Fletcher, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.smartcosmos.profiles.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;
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

public class TransactionEndpointsController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static TransactionEndpointsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the TransactionEndpointsController class 
     */
    public static TransactionEndpointsController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new TransactionEndpointsController();
            }
        }
        return instance;
    }

    /**
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * ### Input parameters:
     * - [[account, objects[], objectAddresses[], metadata[], relationships[], [...], ...]
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - message (string, `11e5d3f6-0c65-7791-917a-e95d5a282bcb`) ... System-generated Transaction ID, as used in all logging
     * ### Input HTTP Headers:
     * - HTTP Basic Authorization (as specified above)
     * ### HTTP result codes
     * This endpoint will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 SUCCESS** the insertion was successful. The UUID in the message string of the response body is system-generated transaction ID, which can be helpful for logging.
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information, including an approximate count of elements processed before the error occurred.
     * - **401 UNAUTHORIZED** user not authorized
     * @param    body    Required parameter: Example: 
     * @param    transactionHandlerName    Required parameter: Example: 
     * @return    Returns the TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModel response from the API call 
     */
    public TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModel createTransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastore(
                final List<TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModel> body,
                final String transactionHandlerName
    ) throws Throwable {
        APICallBackCatcher<TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModel> callback = new APICallBackCatcher<TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModel>();
        createTransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreAsync(body, transactionHandlerName, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * ### Input parameters:
     * - [[account, objects[], objectAddresses[], metadata[], relationships[], [...], ...]
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - message (string, `11e5d3f6-0c65-7791-917a-e95d5a282bcb`) ... System-generated Transaction ID, as used in all logging
     * ### Input HTTP Headers:
     * - HTTP Basic Authorization (as specified above)
     * ### HTTP result codes
     * This endpoint will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 SUCCESS** the insertion was successful. The UUID in the message string of the response body is system-generated transaction ID, which can be helpful for logging.
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information, including an approximate count of elements processed before the error occurred.
     * - **401 UNAUTHORIZED** user not authorized
     * @param    body    Required parameter: Example: 
     * @param    transactionHandlerName    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void createTransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreAsync(
                final List<TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModel> body,
                final String transactionHandlerName,
                final APICallBack<TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModel> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/rest/transaction/{transactionHandlerName}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5059341712502769798L;
            {
                    put( "transactionHandlerName", transactionHandlerName );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5099472744926098978L;
            {
                    put( "user-agent", "SMARTCOSMOS SDK 1.0" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(body),
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

                            if (_responseCode == 401)
                                throw new APIException("", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModel>(){});

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