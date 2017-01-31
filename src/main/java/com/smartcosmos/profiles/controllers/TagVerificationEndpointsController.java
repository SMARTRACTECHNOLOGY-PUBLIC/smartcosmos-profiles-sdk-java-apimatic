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

public class TagVerificationEndpointsController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static TagVerificationEndpointsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the TagVerificationEndpointsController class 
     */
    public static TagVerificationEndpointsController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new TagVerificationEndpointsController();
            }
        }
        return instance;
    }

    /**
     * Get a message to a single verification state. Translate a numeric verification state into a human readable format. e.g. `0` into `verified`
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** tag found and result available
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * - **401 UNAUTHORIZED** user not authorized
     * ### Input HTTP Headers:
     * - HTTP Basic Authorization (as specified above)
     * - Accept language (as specified above)
     * ### Input parameters:
     * - verificationType (required, string, `RR`) ... Identifier of the verification type
     * - verificationState (required, number, `0`) ... State of the verification
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - message (string, `verified`) ... Result message in `Accept-Language` (see `Multi language support`)
     * @param    body    Required parameter: Example: 
     * @return    Returns the GetVerificationStateMessageResponseModel response from the API call 
     */
    public GetVerificationStateMessageResponseModel createGetVerificationStateMessage(
                final GetVerificationStateMessageRequestModel body
    ) throws Throwable {
        APICallBackCatcher<GetVerificationStateMessageResponseModel> callback = new APICallBackCatcher<GetVerificationStateMessageResponseModel>();
        createGetVerificationStateMessageAsync(body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get a message to a single verification state. Translate a numeric verification state into a human readable format. e.g. `0` into `verified`
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** tag found and result available
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * - **401 UNAUTHORIZED** user not authorized
     * ### Input HTTP Headers:
     * - HTTP Basic Authorization (as specified above)
     * - Accept language (as specified above)
     * ### Input parameters:
     * - verificationType (required, string, `RR`) ... Identifier of the verification type
     * - verificationState (required, number, `0`) ... State of the verification
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - message (string, `verified`) ... Result message in `Accept-Language` (see `Multi language support`)
     * @param    body    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void createGetVerificationStateMessageAsync(
                final GetVerificationStateMessageRequestModel body,
                final APICallBack<GetVerificationStateMessageResponseModel> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/rest/verification/message");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5656678226797093986L;
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
                            GetVerificationStateMessageResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetVerificationStateMessageResponseModel>(){});

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

    /**
     * Verify tags for Round Rock compliance (verification type `RR`)
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** tag found and Round Rock compliance result available
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * ### Input parameters:
     * - tagIds (required, array of string, `E12345678912345678`) ... Array of RFID tag identifiers; max 1000 entries allowed
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - tagId (string, `0EEEE100000001`) ... RFID tag identifiers
     * - tagCode (Number, `0`) ... Indicates if the result code for this tag (see `result codes for a tag actions`)
     * - state (Number, `0`) ... Indicates the current RoundRock compliance state (1 = Round Rock licensed; 0 = Not RoundRock licensed)
     * The output contains all desired tag records. Even if the tag is not available or the user does not have permissions. The `tagCode` indicates the result code for each tag.
     * @param    body    Required parameter: Example: 
     * @return    Returns the VerifyTagsForRoundRockComplianceResponseModel response from the API call 
     */
    public VerifyTagsForRoundRockComplianceResponseModel createVerifyTagsForRoundRockCompliance(
                final VerifyTagsForRoundRockComplianceRequestModel body
    ) throws Throwable {
        APICallBackCatcher<VerifyTagsForRoundRockComplianceResponseModel> callback = new APICallBackCatcher<VerifyTagsForRoundRockComplianceResponseModel>();
        createVerifyTagsForRoundRockComplianceAsync(body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Verify tags for Round Rock compliance (verification type `RR`)
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** tag found and Round Rock compliance result available
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * ### Input parameters:
     * - tagIds (required, array of string, `E12345678912345678`) ... Array of RFID tag identifiers; max 1000 entries allowed
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - tagId (string, `0EEEE100000001`) ... RFID tag identifiers
     * - tagCode (Number, `0`) ... Indicates if the result code for this tag (see `result codes for a tag actions`)
     * - state (Number, `0`) ... Indicates the current RoundRock compliance state (1 = Round Rock licensed; 0 = Not RoundRock licensed)
     * The output contains all desired tag records. Even if the tag is not available or the user does not have permissions. The `tagCode` indicates the result code for each tag.
     * @param    body    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void createVerifyTagsForRoundRockComplianceAsync(
                final VerifyTagsForRoundRockComplianceRequestModel body,
                final APICallBack<VerifyTagsForRoundRockComplianceResponseModel> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/rest/verification/tags/RR");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5354460631852049266L;
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

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            VerifyTagsForRoundRockComplianceResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<VerifyTagsForRoundRockComplianceResponseModel>(){});

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

    /**
     * Verify tags for a verification type, which is represented by an unique verification id like 'RR'
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** tag found and verification result available
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * - **401 UNAUTHORIZED** user not authorized
     * ### Input HTTP Headers:
     * - HTTP Basic Authorization (as specified above)
     * ### Input parameters:
     * - tagIds (required, array of string, `E12345678912345678`) ... Array of RFID tag identifiers; max 1000 entries allowed
     * - verificationType (required, String, `RR`) ... Verification type
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - tagId (string, `0EEEE100000001`) ... RFID tag identifiers
     * - tagCode (Number, `0`) ... Indicates if the result code for this tag (see `Possible result codes for a tag actions`)
     * - state (Number, `0`) ... Indicates the current verification state; Number depends on verification type; Use the message function to get a string message
     * The output contains all desired tag records. Even if the tag is not available or the user does not have permissions. The `tagCode` indicates the result code for each tag.
     * @param    body    Required parameter: Example: 
     * @return    Returns the VerifyTagsForAVerificationTypeResponseModel response from the API call 
     */
    public VerifyTagsForAVerificationTypeResponseModel createVerifyTagsForAVerificationType(
                final VerifyTagsForAVerificationTypeRequestModel body
    ) throws Throwable {
        APICallBackCatcher<VerifyTagsForAVerificationTypeResponseModel> callback = new APICallBackCatcher<VerifyTagsForAVerificationTypeResponseModel>();
        createVerifyTagsForAVerificationTypeAsync(body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Verify tags for a verification type, which is represented by an unique verification id like 'RR'
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** tag found and verification result available
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * - **401 UNAUTHORIZED** user not authorized
     * ### Input HTTP Headers:
     * - HTTP Basic Authorization (as specified above)
     * ### Input parameters:
     * - tagIds (required, array of string, `E12345678912345678`) ... Array of RFID tag identifiers; max 1000 entries allowed
     * - verificationType (required, String, `RR`) ... Verification type
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - tagId (string, `0EEEE100000001`) ... RFID tag identifiers
     * - tagCode (Number, `0`) ... Indicates if the result code for this tag (see `Possible result codes for a tag actions`)
     * - state (Number, `0`) ... Indicates the current verification state; Number depends on verification type; Use the message function to get a string message
     * The output contains all desired tag records. Even if the tag is not available or the user does not have permissions. The `tagCode` indicates the result code for each tag.
     * @param    body    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void createVerifyTagsForAVerificationTypeAsync(
                final VerifyTagsForAVerificationTypeRequestModel body,
                final APICallBack<VerifyTagsForAVerificationTypeResponseModel> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/rest/verification/tags");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5650869885618361980L;
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
                            VerifyTagsForAVerificationTypeResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<VerifyTagsForAVerificationTypeResponseModel>(){});

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