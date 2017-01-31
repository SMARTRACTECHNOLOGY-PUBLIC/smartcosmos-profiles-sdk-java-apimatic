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

public class TagDataEndpointsController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static TagDataEndpointsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the TagDataEndpointsController class 
     */
    public static TagDataEndpointsController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new TagDataEndpointsController();
            }
        }
        return instance;
    }

    /**
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** specified tag was found, result available
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * - **401 UNAUTHORIZED** user not authorized
     * ### Input HTTP Headers:
     * - HTTP Basic Authorization (as specified above)
     * ### Input parameters
     * - tagId (required, string, `E12345678912345678`) ... a single RFID tag identifier
     * - nameLike (optional, string, `chip`) ... Comparison string for metadata properties
     * ### Output parameters
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - tagId the requested `tagID`
     * - properties an array of JSON objects, each of which contains property ID, property name, property data type, and a flag indicating whether the property exists for the tag.
     * @param    tagId    Required parameter: Example: 
     * @param    nameLike    Optional parameter: Example: 
     * @return    Returns the GetTagMetadataDefinitionResponseModel response from the API call 
     */
    public GetTagMetadataDefinitionResponseModel getTagMetadataDefinition(
                final String tagId,
                final String nameLike
    ) throws Throwable {
        APICallBackCatcher<GetTagMetadataDefinitionResponseModel> callback = new APICallBackCatcher<GetTagMetadataDefinitionResponseModel>();
        getTagMetadataDefinitionAsync(tagId, nameLike, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** specified tag was found, result available
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * - **401 UNAUTHORIZED** user not authorized
     * ### Input HTTP Headers:
     * - HTTP Basic Authorization (as specified above)
     * ### Input parameters
     * - tagId (required, string, `E12345678912345678`) ... a single RFID tag identifier
     * - nameLike (optional, string, `chip`) ... Comparison string for metadata properties
     * ### Output parameters
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - tagId the requested `tagID`
     * - properties an array of JSON objects, each of which contains property ID, property name, property data type, and a flag indicating whether the property exists for the tag.
     * @param    tagId    Required parameter: Example: 
     * @param    nameLike    Optional parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void getTagMetadataDefinitionAsync(
                final String tagId,
                final String nameLike,
                final APICallBack<GetTagMetadataDefinitionResponseModel> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/rest/tag/properties/definition/{tagId}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5017225991199560191L;
            {
                    put( "tagId", tagId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5443902299622567421L;
            {
                    put( "nameLike", nameLike );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4838247267440508280L;
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

                            if (_responseCode == 401)
                                throw new APIException("", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            GetTagMetadataDefinitionResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetTagMetadataDefinitionResponseModel>(){});

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
     * Look up an array of the first **count** tag IDs with the specified batch URN.
     * ### Output parameters
     * - tagIds (array of string, `E12345678912345678`) ... Array of RFID tag identifiers
     * @param    batchUrn    Required parameter: Case-sensitive batch URN
     * @param    count    Optional parameter: Maximum number of tag IDs to return; defaults to 100000; maximum is 1000000
     * @return    Returns the QueryTagsResponseModel response from the API call 
     */
    public QueryTagsResponseModel getQueryTags(
                final String batchUrn,
                final Integer count
    ) throws Throwable {
        APICallBackCatcher<QueryTagsResponseModel> callback = new APICallBackCatcher<QueryTagsResponseModel>();
        getQueryTagsAsync(batchUrn, count, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Look up an array of the first **count** tag IDs with the specified batch URN.
     * ### Output parameters
     * - tagIds (array of string, `E12345678912345678`) ... Array of RFID tag identifiers
     * @param    batchUrn    Required parameter: Case-sensitive batch URN
     * @param    count    Optional parameter: Maximum number of tag IDs to return; defaults to 100000; maximum is 1000000
     * @return    Returns the void response from the API call 
     */
    public void getQueryTagsAsync(
                final String batchUrn,
                final Integer count,
                final APICallBack<QueryTagsResponseModel> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/rest/tag/queryTags");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5581054417603431027L;
            {
                    put( "batchUrn", batchUrn );
                    put( "count", (null != count) ? count : 100000 );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5594354294995721239L;
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

                            if (_responseCode == 401)
                                throw new APIException("", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            QueryTagsResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<QueryTagsResponseModel>(){});

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
     * Get a message to a single numeric tag code.
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** message available
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * - **401 UNAUTHORIZED** user not authorized
     * ### Input HTTP Headers:
     * - HTTP Basic Authorization (as specified above)
     * - Accept language (as specified above)
     * ### Input parameters:
     * - tagCode (required, number, `0`) ... Result code of a tag action
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - message (string, `verified`) ... Result message in `Accept-Language` (see `Multi language support`)
     * @param    body    Required parameter: Example: 
     * @return    Returns the GetSingleTagCodeMessageResponseModel response from the API call 
     */
    public GetSingleTagCodeMessageResponseModel createGetSingleTagCodeMessage(
                final GetSingleTagCodeMessageRequestModel body
    ) throws Throwable {
        APICallBackCatcher<GetSingleTagCodeMessageResponseModel> callback = new APICallBackCatcher<GetSingleTagCodeMessageResponseModel>();
        createGetSingleTagCodeMessageAsync(body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get a message to a single numeric tag code.
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** message available
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * - **401 UNAUTHORIZED** user not authorized
     * ### Input HTTP Headers:
     * - HTTP Basic Authorization (as specified above)
     * - Accept language (as specified above)
     * ### Input parameters:
     * - tagCode (required, number, `0`) ... Result code of a tag action
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - message (string, `verified`) ... Result message in `Accept-Language` (see `Multi language support`)
     * @param    body    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void createGetSingleTagCodeMessageAsync(
                final GetSingleTagCodeMessageRequestModel body,
                final APICallBack<GetSingleTagCodeMessageResponseModel> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/rest/tag/message");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4898870766927486945L;
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
                            GetSingleTagCodeMessageResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetSingleTagCodeMessageResponseModel>(){});

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
     * Writes application data to tags, which updated the existing application data in Profiles. This
     * function also supports setting the lock state of the application data, which prevents further
     * changes of the application data.
     * Writing application data to a tag is permitted under following conditions only:
     * - The tag with the given tagId must exist in Profiles
     * - The tag must have an application record with the given appId
     * - The lock state of the tag's application data must be present and explicitly set to **false**
     * - To insert a new application record, the data transaction endpoint shall be used
     * **Notes:**
     * - Omitting **value** in the request will update the lock state of the tag only.
     * - Omitting **locked** in the request will write the value only.
     * - It is not possible to unlock a locked tag by setting **locked** to **false**.
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** tags found and result available (also returned if only a subset of tags have this keys)
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * - **401 UNAUTHORIZED** user not authorized
     * - **404 NOT_FOUND** no matching tags found or none the tags found do have app IDs with given name
     * ### Input HTTP Headers:
     * - HTTP Basic Authorization (as specified above)
     * - Accept language (as specified above)
     * ### Input parameters:
     * - appId (required, string, `ndef`) ... Application ID which references the data
     * - tagId (required, string, `0EEEE100000001`) ... Identifier for each tag to be updated
     * - value (optional, string, `AQIDBAUGBwgJCgsM`) ... Application data to be updated
     * - locked (optional, boolean, `true`) ... Lock flag to be set
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - tagId (string, `0EEEE100000001`) ... Tag ID
     * - tagCode (Number, `0`) ... Indicates if the result code for this tag (see `Possible result codes for a tag actions`)
     * @param    body    Required parameter: Example: 
     * @return    Returns the UpdateTagValuesResponseModel response from the API call 
     */
    public UpdateTagValuesResponseModel updateTagValues(
                final UpdateTagValuesRequestModel body
    ) throws Throwable {
        APICallBackCatcher<UpdateTagValuesResponseModel> callback = new APICallBackCatcher<UpdateTagValuesResponseModel>();
        updateTagValuesAsync(body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Writes application data to tags, which updated the existing application data in Profiles. This
     * function also supports setting the lock state of the application data, which prevents further
     * changes of the application data.
     * Writing application data to a tag is permitted under following conditions only:
     * - The tag with the given tagId must exist in Profiles
     * - The tag must have an application record with the given appId
     * - The lock state of the tag's application data must be present and explicitly set to **false**
     * - To insert a new application record, the data transaction endpoint shall be used
     * **Notes:**
     * - Omitting **value** in the request will update the lock state of the tag only.
     * - Omitting **locked** in the request will write the value only.
     * - It is not possible to unlock a locked tag by setting **locked** to **false**.
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** tags found and result available (also returned if only a subset of tags have this keys)
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * - **401 UNAUTHORIZED** user not authorized
     * - **404 NOT_FOUND** no matching tags found or none the tags found do have app IDs with given name
     * ### Input HTTP Headers:
     * - HTTP Basic Authorization (as specified above)
     * - Accept language (as specified above)
     * ### Input parameters:
     * - appId (required, string, `ndef`) ... Application ID which references the data
     * - tagId (required, string, `0EEEE100000001`) ... Identifier for each tag to be updated
     * - value (optional, string, `AQIDBAUGBwgJCgsM`) ... Application data to be updated
     * - locked (optional, boolean, `true`) ... Lock flag to be set
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - tagId (string, `0EEEE100000001`) ... Tag ID
     * - tagCode (Number, `0`) ... Indicates if the result code for this tag (see `Possible result codes for a tag actions`)
     * @param    body    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void updateTagValuesAsync(
                final UpdateTagValuesRequestModel body,
                final APICallBack<UpdateTagValuesResponseModel> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/rest/tag/value");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5573737330032799586L;
            {
                    put( "user-agent", "SMARTCOSMOS SDK 1.0" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().putBody(_queryUrl, _headers, APIHelper.serialize(body),
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
                            UpdateTagValuesResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<UpdateTagValuesResponseModel>(){});

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
     * Get application data from tags, which returns data encoded on the tags. This function also returns
     * the lock state of the application data.
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** tags found and result available (also returned if only a subset of tags have this keys)
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * - **401 UNAUTHORIZED** user not authorized
     * - **404 NOT_FOUND** no matching tags found or none the tags found does have keys with given name
     * ### Input HTTP Headers:
     * - HTTP Basic Authorization (as specified above)
     * - Accept language (as specified above)
     * ### Input parameters:
     * - tagIds (required, string, `0EEEE100000001`) ... Identifier for each tag to be queried
     * - appId (required, string, `ndef`) ... Application ID which references the data
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - tagId (string, `0EEEE100000001`) ... Tag ID
     * - tagCode (Number, `0`) ... Indicates if the result code for this tag (see `Possible result codes for a tag actions`)
     * - value (string, `AQIDBAUGBwgJCgsM`) ... Application data (Base64 encoded)
     * - locked (boolean, `false`) ... Tag has been made read-only
     * @param    body    Required parameter: Example: 
     * @return    Returns the GetApplicationDataFromTagsResponseModel response from the API call 
     */
    public GetApplicationDataFromTagsResponseModel createGetApplicationDataFromTags(
                final GetApplicationDataFromTagsRequestModel body
    ) throws Throwable {
        APICallBackCatcher<GetApplicationDataFromTagsResponseModel> callback = new APICallBackCatcher<GetApplicationDataFromTagsResponseModel>();
        createGetApplicationDataFromTagsAsync(body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get application data from tags, which returns data encoded on the tags. This function also returns
     * the lock state of the application data.
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** tags found and result available (also returned if only a subset of tags have this keys)
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * - **401 UNAUTHORIZED** user not authorized
     * - **404 NOT_FOUND** no matching tags found or none the tags found does have keys with given name
     * ### Input HTTP Headers:
     * - HTTP Basic Authorization (as specified above)
     * - Accept language (as specified above)
     * ### Input parameters:
     * - tagIds (required, string, `0EEEE100000001`) ... Identifier for each tag to be queried
     * - appId (required, string, `ndef`) ... Application ID which references the data
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - tagId (string, `0EEEE100000001`) ... Tag ID
     * - tagCode (Number, `0`) ... Indicates if the result code for this tag (see `Possible result codes for a tag actions`)
     * - value (string, `AQIDBAUGBwgJCgsM`) ... Application data (Base64 encoded)
     * - locked (boolean, `false`) ... Tag has been made read-only
     * @param    body    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void createGetApplicationDataFromTagsAsync(
                final GetApplicationDataFromTagsRequestModel body,
                final APICallBack<GetApplicationDataFromTagsResponseModel> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/rest/tag/value");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4748633448586094709L;
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
                            GetApplicationDataFromTagsResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetApplicationDataFromTagsResponseModel>(){});

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
     * Look up an array of the first **count** batchUrns with the specified customer PO.
     * **NOTE: Only one customerPO can be specified.**
     * ### Output parameters
     * - batchUrns (array of string, `urn:uuid:smartrac-group:batch:99990001`) ... Array of batch URNs
     * @param    customerPO    Required parameter: Case-sensitive customerPO
     * @param    count    Optional parameter: Maximum number of batch URNs to return; defaults to 100000; maximum is 1000000
     * @return    Returns the QueryBatchesResponseModel response from the API call 
     */
    public QueryBatchesResponseModel getQueryBatches(
                final String customerPO,
                final Integer count
    ) throws Throwable {
        APICallBackCatcher<QueryBatchesResponseModel> callback = new APICallBackCatcher<QueryBatchesResponseModel>();
        getQueryBatchesAsync(customerPO, count, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Look up an array of the first **count** batchUrns with the specified customer PO.
     * **NOTE: Only one customerPO can be specified.**
     * ### Output parameters
     * - batchUrns (array of string, `urn:uuid:smartrac-group:batch:99990001`) ... Array of batch URNs
     * @param    customerPO    Required parameter: Case-sensitive customerPO
     * @param    count    Optional parameter: Maximum number of batch URNs to return; defaults to 100000; maximum is 1000000
     * @return    Returns the void response from the API call 
     */
    public void getQueryBatchesAsync(
                final String customerPO,
                final Integer count,
                final APICallBack<QueryBatchesResponseModel> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/rest/tag/queryBatches");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5330978403021623239L;
            {
                    put( "customerPO", customerPO );
                    put( "count", (null != count) ? count : 100000 );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4745616056239456890L;
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

                            if (_responseCode == 401)
                                throw new APIException("", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            QueryBatchesResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<QueryBatchesResponseModel>(){});

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
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** minimum 1 tag found and result available
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * - **401 UNAUTHORIZED** user not authorized
     * ### Input HTTP Headers:
     * - HTTP Basic Authorization (as specified above)
     * ### Input parameters
     * - tagIds (required, array of string, `E12345678912345678`) ... Array of RFID tag identifiers; max 1000 entries allowed
     * - verificationTypes (optional, array of string, `RR`) ... Array of verification types
     * - properties (optional, array of string, `plantId,batchId`) ... Array of requested properties
     * <!--
     * - materialPerformance (optional, array of string, `air,carton`) ... Array of requested material performance data
     * -->
     * ### Available tag properties
     * Property ID | Data Type | Description | Availability
     * ------------ | ------------- | ------------ | ------------
     * custId | String | Customer ID | available
     * orderId | String | Order ID | available
     * orderDate | Long | Order date | available
     * orderQty | Number | Order quantity | available
     * orderQtyU | String | Order quantity unit | available
     * customerPO | String | Customer purchase order number | available
     * customerName | String | Customer name | available
     * supplPO | String | Supplier purchase order number | available
     * delivId | String | Delivery ID | available
     * delivDate | Long | Delivery date | available
     * delivQty | Number | Delivery quantity | available
     * delivQtyU | String | Delivery quantity unit | available
     * batchId | String | Roll number / batch ID | available
     * yield | Number | Batch yield [%] | available
     * subRoll | String | Sub roll number / sub batch ID | available
     * plantId | String | Manufacturer production side ID | available
     * chipManuf | String | Chip manufacturer | available
     * chipModel | String | Chip model | available
     * inlayType | String | Inlay type | available
     * inlayManufDate | Long | Inlay manufacturer date | available
     * attenuation | Number | Attenuation in dB | available
     * checkState | Number | 0=failed; 1=passed (default) | available
     * Notes:
     *  - Only available properties can be requested (check `Availability` column above)
     *  - Same data is not available for all tags/batches
     *  - There are additional properties planned in the future
     * ### Output parameters
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - tagId according the requested `tagIds`
     * - tagCode (Number, `0`) ... Indicates if the result code for this tag (see `result codes for a tag actions`)
     * - verificationState according the requested `verificationTypes`
     * - properties according the requested `properties`
     * @param    body    Required parameter: Example: 
     * @return    Returns the GetTagMetadataResponseModel response from the API call 
     */
    public GetTagMetadataResponseModel createGetTagMetadata(
                final GetTagMetadataRequestModel body
    ) throws Throwable {
        APICallBackCatcher<GetTagMetadataResponseModel> callback = new APICallBackCatcher<GetTagMetadataResponseModel>();
        createGetTagMetadataAsync(body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** minimum 1 tag found and result available
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * - **401 UNAUTHORIZED** user not authorized
     * ### Input HTTP Headers:
     * - HTTP Basic Authorization (as specified above)
     * ### Input parameters
     * - tagIds (required, array of string, `E12345678912345678`) ... Array of RFID tag identifiers; max 1000 entries allowed
     * - verificationTypes (optional, array of string, `RR`) ... Array of verification types
     * - properties (optional, array of string, `plantId,batchId`) ... Array of requested properties
     * <!--
     * - materialPerformance (optional, array of string, `air,carton`) ... Array of requested material performance data
     * -->
     * ### Available tag properties
     * Property ID | Data Type | Description | Availability
     * ------------ | ------------- | ------------ | ------------
     * custId | String | Customer ID | available
     * orderId | String | Order ID | available
     * orderDate | Long | Order date | available
     * orderQty | Number | Order quantity | available
     * orderQtyU | String | Order quantity unit | available
     * customerPO | String | Customer purchase order number | available
     * customerName | String | Customer name | available
     * supplPO | String | Supplier purchase order number | available
     * delivId | String | Delivery ID | available
     * delivDate | Long | Delivery date | available
     * delivQty | Number | Delivery quantity | available
     * delivQtyU | String | Delivery quantity unit | available
     * batchId | String | Roll number / batch ID | available
     * yield | Number | Batch yield [%] | available
     * subRoll | String | Sub roll number / sub batch ID | available
     * plantId | String | Manufacturer production side ID | available
     * chipManuf | String | Chip manufacturer | available
     * chipModel | String | Chip model | available
     * inlayType | String | Inlay type | available
     * inlayManufDate | Long | Inlay manufacturer date | available
     * attenuation | Number | Attenuation in dB | available
     * checkState | Number | 0=failed; 1=passed (default) | available
     * Notes:
     *  - Only available properties can be requested (check `Availability` column above)
     *  - Same data is not available for all tags/batches
     *  - There are additional properties planned in the future
     * ### Output parameters
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - tagId according the requested `tagIds`
     * - tagCode (Number, `0`) ... Indicates if the result code for this tag (see `result codes for a tag actions`)
     * - verificationState according the requested `verificationTypes`
     * - properties according the requested `properties`
     * @param    body    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void createGetTagMetadataAsync(
                final GetTagMetadataRequestModel body,
                final APICallBack<GetTagMetadataResponseModel> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/rest/tag/properties");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4837574998961356490L;
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
                            GetTagMetadataResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetTagMetadataResponseModel>(){});

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
     * Get authentication keys for encoded tags, which can be used to access the tag memory. The key names,
     * content and access rules need to be defined when ordering the tags.
     * It is possible to have several applications with their corresponding keys on a tag.
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** tags found and result available (also returned if only a subset of tags have this keys)
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * - **401 UNAUTHORIZED** user not authorized
     * - **404 NOT_FOUND** no matching tags found or none the tags found does have keys with given name
     * ### Input HTTP Headers:
     * - HTTP Basic Authorization (as specified above)
     * - Accept language (as specified above)
     * ### Input parameters:
     * - tagIds (required, string, `0EEEE100000001`) ... Identifier for each tag to be queried
     * - appId (required, string, `SC Public Transport`) ... Application ID which references the key
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - tagId (string, `0EEEE100000001`) ... Tag ID
     * - tagCode (Number, `0`) ... Indicates if the result code for this tag (see `Possible result codes for a tag actions`)
     * - key (string, `0102030405060708090A0B0C`) ... Key blob (AsciiHex encoded key)
     * @param    body    Required parameter: Example: 
     * @return    Returns the GetKeysUsedForTagAuthenticationResponseModel response from the API call 
     */
    public GetKeysUsedForTagAuthenticationResponseModel createGetKeysUsedForTagAuthentication(
                final GetKeysUsedForTagAuthenticationRequestModel body
    ) throws Throwable {
        APICallBackCatcher<GetKeysUsedForTagAuthenticationResponseModel> callback = new APICallBackCatcher<GetKeysUsedForTagAuthenticationResponseModel>();
        createGetKeysUsedForTagAuthenticationAsync(body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get authentication keys for encoded tags, which can be used to access the tag memory. The key names,
     * content and access rules need to be defined when ordering the tags.
     * It is possible to have several applications with their corresponding keys on a tag.
     * ### Idempotent Behaviour
     * This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
     * - **200 OK** tags found and result available (also returned if only a subset of tags have this keys)
     * - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
     * - **401 UNAUTHORIZED** user not authorized
     * - **404 NOT_FOUND** no matching tags found or none the tags found does have keys with given name
     * ### Input HTTP Headers:
     * - HTTP Basic Authorization (as specified above)
     * - Accept language (as specified above)
     * ### Input parameters:
     * - tagIds (required, string, `0EEEE100000001`) ... Identifier for each tag to be queried
     * - appId (required, string, `SC Public Transport`) ... Application ID which references the key
     * ### Output parameters:
     * - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
     * - tagId (string, `0EEEE100000001`) ... Tag ID
     * - tagCode (Number, `0`) ... Indicates if the result code for this tag (see `Possible result codes for a tag actions`)
     * - key (string, `0102030405060708090A0B0C`) ... Key blob (AsciiHex encoded key)
     * @param    body    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void createGetKeysUsedForTagAuthenticationAsync(
                final GetKeysUsedForTagAuthenticationRequestModel body,
                final APICallBack<GetKeysUsedForTagAuthenticationResponseModel> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/rest/tag/key");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5284494843507917482L;
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
                            GetKeysUsedForTagAuthenticationResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetKeysUsedForTagAuthenticationResponseModel>(){});

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