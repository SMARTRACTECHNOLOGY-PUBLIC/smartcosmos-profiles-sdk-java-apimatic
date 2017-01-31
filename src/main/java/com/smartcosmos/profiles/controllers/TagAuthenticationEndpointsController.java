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

public class TagAuthenticationEndpointsController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static TagAuthenticationEndpointsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the TagAuthenticationEndpointsController class 
     */
    public static TagAuthenticationEndpointsController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new TagAuthenticationEndpointsController();
            }
        }
        return instance;
    }

    /**
     * OTP (One-Time Password) Authentication is performed in three steps:
     *  1. Retrieve an authentication challenge for the given tag
     *     in: tagId, appId
     *     out: otpRequestId, otpVector
     *  2. Calculate the OTP encryption result on the client
     *  3. Send the OTP encryption result to the service
     *     in: tagId, otpRequestId, otpResult
     *     out: verification result
     * Get an authentication challenge to authenticate a tag identified by its tag ID using an OTP init vector
     * and a key. The authentication session is valid for 60 seconds.
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** tags found and result available (also returned if only a subset of tags have this keys)
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * - **401 UNAUTHORIZED** user not authorized
     * - **404 NOT_FOUND** no matching tags found or none the tags found does support OTP authentication
     * ### Input parameters:
     * - tagId (required, string, `0EEEE100000001`) ... Identifier for the tag
     * - appId (optional, string, `OTP`) ... Identifier for the requested application (used for multi application RFID tags)
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - message (string, `Verification successful`) ... Result message
     * - tagId (string, `0EEEE100000001`) ... tag ID
     * - otpRequestId (string, `urn:uuid:82b3a00c-e1b0-44cb-a50d-7705e1c6e2b4`) ... Identifier to track the authentication flow
     * - otpVector (byte[], `MzMEOwsSAkYTBRUTPjpGJRIsLgE=`) ... Generated OTP init vector to calculate the OTP result
     * @param    body    Required parameter: Example: 
     * @return    Returns the GetOTPAuthenticationChallengeResponseModel response from the API call 
     */
    public GetOTPAuthenticationChallengeResponseModel createGetOTPAuthenticationChallenge(
                final GetOTPAuthenticationChallengeRequestModel body
    ) throws Throwable {
        APICallBackCatcher<GetOTPAuthenticationChallengeResponseModel> callback = new APICallBackCatcher<GetOTPAuthenticationChallengeResponseModel>();
        createGetOTPAuthenticationChallengeAsync(body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * OTP (One-Time Password) Authentication is performed in three steps:
     *  1. Retrieve an authentication challenge for the given tag
     *     in: tagId, appId
     *     out: otpRequestId, otpVector
     *  2. Calculate the OTP encryption result on the client
     *  3. Send the OTP encryption result to the service
     *     in: tagId, otpRequestId, otpResult
     *     out: verification result
     * Get an authentication challenge to authenticate a tag identified by its tag ID using an OTP init vector
     * and a key. The authentication session is valid for 60 seconds.
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** tags found and result available (also returned if only a subset of tags have this keys)
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * - **401 UNAUTHORIZED** user not authorized
     * - **404 NOT_FOUND** no matching tags found or none the tags found does support OTP authentication
     * ### Input parameters:
     * - tagId (required, string, `0EEEE100000001`) ... Identifier for the tag
     * - appId (optional, string, `OTP`) ... Identifier for the requested application (used for multi application RFID tags)
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - message (string, `Verification successful`) ... Result message
     * - tagId (string, `0EEEE100000001`) ... tag ID
     * - otpRequestId (string, `urn:uuid:82b3a00c-e1b0-44cb-a50d-7705e1c6e2b4`) ... Identifier to track the authentication flow
     * - otpVector (byte[], `MzMEOwsSAkYTBRUTPjpGJRIsLgE=`) ... Generated OTP init vector to calculate the OTP result
     * @param    body    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void createGetOTPAuthenticationChallengeAsync(
                final GetOTPAuthenticationChallengeRequestModel body,
                final APICallBack<GetOTPAuthenticationChallengeResponseModel> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/rest/tag/auth/otp/request");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5037638765195525475L;
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

                            if (_responseCode == 404)
                                throw new APIException("Unexpected error in API call. See HTTP response body for details.", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            GetOTPAuthenticationChallengeResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetOTPAuthenticationChallengeResponseModel>(){});

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
     * Verify the signature of NXP NTAG, Mifare Ultralight EV1 or I-Code SLIX2 tags. The signature could be obtained
     * from the NXP tag by issuing a READ_SIG command. To use the correct verification key, it is also
     * required to submit the tag version, which could be acquired by issuing a GET_VERSION command.
     * The signature is verified in Profiles by ECDSA using the public key from NXP.
     * Following NXP chip types are supported:
     * - NXP NTAG
     * - NXP Mifare Ultralight EV1
     * - NXP I-Code SLIX2
     * ### Note on tagVersion
     * - For NTAG and Ultralight it is required to provide the GET_VERSION response to locate the correct verification key
     * - For I-Code the *tagVersion* could be ommitted, because the verification key is derived from the UID directly
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** signature valid
     * - **400 BAD_REQUEST** signature invalid
     * - **401 UNAUTHORIZED** user not authorized
     * ### Input parameters:
     * - tagId (required, string, `04001122334455`) ... NXP tag UID
     * - tagVersion (optional, string, `0004040201000F03`) ... NXP GET_VERSION response
     * - signature (required, string, `MTIzNDU2NzgxMjM0NTY3ODEyMzQ1Njc4MTIzNDU2Nzg=`) ... signature read from the chip (Base64 encoded)
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - message (string, `Verification successful`) ... Result message
     * - tagId (string, `04001122334455`) ... NXP tag UID
     * @param    body    Required parameter: Example: 
     * @return    Returns the VerifyNXPTagSignatureResponseModel response from the API call 
     */
    public VerifyNXPTagSignatureResponseModel createVerifyNXPTagSignature(
                final VerifyNXPTagSignatureRequestModel body
    ) throws Throwable {
        APICallBackCatcher<VerifyNXPTagSignatureResponseModel> callback = new APICallBackCatcher<VerifyNXPTagSignatureResponseModel>();
        createVerifyNXPTagSignatureAsync(body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Verify the signature of NXP NTAG, Mifare Ultralight EV1 or I-Code SLIX2 tags. The signature could be obtained
     * from the NXP tag by issuing a READ_SIG command. To use the correct verification key, it is also
     * required to submit the tag version, which could be acquired by issuing a GET_VERSION command.
     * The signature is verified in Profiles by ECDSA using the public key from NXP.
     * Following NXP chip types are supported:
     * - NXP NTAG
     * - NXP Mifare Ultralight EV1
     * - NXP I-Code SLIX2
     * ### Note on tagVersion
     * - For NTAG and Ultralight it is required to provide the GET_VERSION response to locate the correct verification key
     * - For I-Code the *tagVersion* could be ommitted, because the verification key is derived from the UID directly
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** signature valid
     * - **400 BAD_REQUEST** signature invalid
     * - **401 UNAUTHORIZED** user not authorized
     * ### Input parameters:
     * - tagId (required, string, `04001122334455`) ... NXP tag UID
     * - tagVersion (optional, string, `0004040201000F03`) ... NXP GET_VERSION response
     * - signature (required, string, `MTIzNDU2NzgxMjM0NTY3ODEyMzQ1Njc4MTIzNDU2Nzg=`) ... signature read from the chip (Base64 encoded)
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - message (string, `Verification successful`) ... Result message
     * - tagId (string, `04001122334455`) ... NXP tag UID
     * @param    body    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void createVerifyNXPTagSignatureAsync(
                final VerifyNXPTagSignatureRequestModel body,
                final APICallBack<VerifyNXPTagSignatureResponseModel> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/rest/tag/auth/nxp");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5715436954809151090L;
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
                            VerifyNXPTagSignatureResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<VerifyNXPTagSignatureResponseModel>(){});

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
     * Validate the OTP authentication attempt based on the OTP init vactor identified by UUID.
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** authentication successful
     * - **400 BAD_REQUEST** authentication failed
     * - **401 UNAUTHORIZED** user not authorized
     * - **404 NOT_FOUND** invalid session or session expired
     * ### Input parameters:
     * - timestamp (required, long, `1430911319542`) ... UTC timestamp used by the client to calculate the OTP
     * - otpRequestId (required, string, `urn:uuid:82b3a00c-e1b0-44cb-a50d-7705e1c6e2b4`) ... Server side generated id to track the authentication flow
     * - otpResult (required, int, `123456`) ... Generated OTP from HMAC according to RFC 6238
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - message (string, `Verification successful`) ... Result message
     * - tagId (string, `0EEEE100000001`) ... tag ID
     * @param    body    Required parameter: Example: 
     * @return    Returns the ValidateOTPEncryptionResultResponseModel response from the API call 
     */
    public ValidateOTPEncryptionResultResponseModel createValidateOTPEncryptionResult(
                final ValidateOTPEncryptionResultRequestModel body
    ) throws Throwable {
        APICallBackCatcher<ValidateOTPEncryptionResultResponseModel> callback = new APICallBackCatcher<ValidateOTPEncryptionResultResponseModel>();
        createValidateOTPEncryptionResultAsync(body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Validate the OTP authentication attempt based on the OTP init vactor identified by UUID.
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** authentication successful
     * - **400 BAD_REQUEST** authentication failed
     * - **401 UNAUTHORIZED** user not authorized
     * - **404 NOT_FOUND** invalid session or session expired
     * ### Input parameters:
     * - timestamp (required, long, `1430911319542`) ... UTC timestamp used by the client to calculate the OTP
     * - otpRequestId (required, string, `urn:uuid:82b3a00c-e1b0-44cb-a50d-7705e1c6e2b4`) ... Server side generated id to track the authentication flow
     * - otpResult (required, int, `123456`) ... Generated OTP from HMAC according to RFC 6238
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - message (string, `Verification successful`) ... Result message
     * - tagId (string, `0EEEE100000001`) ... tag ID
     * @param    body    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void createValidateOTPEncryptionResultAsync(
                final ValidateOTPEncryptionResultRequestModel body,
                final APICallBack<ValidateOTPEncryptionResultResponseModel> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/rest/tag/auth/otp/validate");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4819160902297841670L;
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

                            if (_responseCode == 404)
                                throw new APIException("Unexpected error in API call. See HTTP response body for details.", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            ValidateOTPEncryptionResultResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<ValidateOTPEncryptionResultResponseModel>(){});

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