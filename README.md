# Getting started

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=SMART%20COSMOS%20Profiles-Java&workspaceName=SMARTCOSMOSProfiles&projectName=SMARTCOSMOSProfilesLib&rootNamespace=com.smartcosmos.profiles)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=SMART%20COSMOS%20Profiles-Java&workspaceName=SMARTCOSMOSProfiles&projectName=SMARTCOSMOSProfilesLib&rootNamespace=com.smartcosmos.profiles)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=SMART%20COSMOS%20Profiles-Java&workspaceName=SMARTCOSMOSProfiles&projectName=SMARTCOSMOSProfilesLib&rootNamespace=com.smartcosmos.profiles)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=SMART%20COSMOS%20Profiles-Java&workspaceName=SMARTCOSMOSProfiles&projectName=SMARTCOSMOSProfilesLib&rootNamespace=com.smartcosmos.profiles)

## How to Use

The following section explains how to use the SMARTCOSMOSProfiles library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=SMART%20COSMOS%20Profiles-Java&workspaceName=SMARTCOSMOSProfiles&projectName=SMARTCOSMOSProfilesLib&rootNamespace=com.smartcosmos.profiles)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=SMART%20COSMOS%20Profiles-Java&workspaceName=SMARTCOSMOSProfiles&projectName=SMARTCOSMOSProfilesLib&rootNamespace=com.smartcosmos.profiles)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=SMART%20COSMOS%20Profiles-Java&workspaceName=SMARTCOSMOSProfiles&projectName=SMARTCOSMOSProfilesLib&rootNamespace=com.smartcosmos.profiles)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=SMART%20COSMOS%20Profiles-Java&workspaceName=SMARTCOSMOSProfiles&projectName=SMARTCOSMOSProfilesLib&rootNamespace=com.smartcosmos.profiles)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=SMART%20COSMOS%20Profiles-Java&workspaceName=SMARTCOSMOSProfiles&projectName=SMARTCOSMOSProfilesLib&rootNamespace=com.smartcosmos.profiles)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *SMARTCOSMOSProfilesLib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=SMART%20COSMOS%20Profiles-Java&workspaceName=SMARTCOSMOSProfiles&projectName=SMARTCOSMOSProfilesLib&rootNamespace=com.smartcosmos.profiles)

Clicking the ``` Add ``` button will open a dialog where you need to specify SMARTCOSMOSProfiles in ``` Group Id ``` and SMARTCOSMOSProfilesLib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=SMART%20COSMOS%20Profiles-Java&workspaceName=SMARTCOSMOSProfiles&projectName=SMARTCOSMOSProfilesLib&rootNamespace=com.smartcosmos.profiles)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=SMART%20COSMOS%20Profiles-Java&workspaceName=SMARTCOSMOSProfiles&projectName=SMARTCOSMOSProfilesLib&rootNamespace=com.smartcosmos.profiles)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *SMARTCOSMOSProfilesLib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| basicAuthUserName | The username to use with basic authentication |
| basicAuthPassword | The password to use with basic authentication |



API client can be initialized as following.

```java
// Initializing Object Mapper for Serialization and Deserialization purposes
public static ObjectMapper mapper = new ObjectMapper()
{
	private static final long serialVersionUID = -174113593500315394L;
	{
		configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}
};

// Configuration parameters and credentials
String basicAuthUserName = "basicAuthUserName"; // The username to use with basic authentication
String basicAuthPassword = "basicAuthPassword"; // The password to use with basic authentication

SMARTCOSMOSProfilesClient client = new SMARTCOSMOSProfilesClient(basicAuthUserName, basicAuthPassword);
```

## Class Reference

### <a name="list_of_controllers"></a>List of Controllers

* [DataImportEndpointsController](#data_import_endpoints_controller)
* [TagDataEndpointsController](#tag_data_endpoints_controller)
* [TagDeliveryNetworkEndpointsController](#tag_delivery_network_endpoints_controller)
* [TransactionEndpointsController](#transaction_endpoints_controller)
* [TagAuthenticationEndpointsController](#tag_authentication_endpoints_controller)
* [TagVerificationEndpointsController](#tag_verification_endpoints_controller)
* [PlatformAvailabilityEndpointsController](#platform_availability_endpoints_controller)

### <a name="data_import_endpoints_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.smartcosmos.profiles.controllers.DataImportEndpointsController") DataImportEndpointsController

#### Get singleton instance

The singleton instance of the ``` DataImportEndpointsController ``` class can be accessed from the API Client.

```java
DataImportEndpointsController dataImportEndpoints = client.getDataImportEndpoints();
```

#### <a name="create_file_transmission_receipt_async"></a>![Method: ](https://apidocs.io/img/method.png "com.smartcosmos.profiles.controllers.DataImportEndpointsController.createFileTransmissionReceiptAsync") createFileTransmissionReceiptAsync

> TODO: Add a method description


```java
void createFileTransmissionReceiptAsync(
        final FileTransmissionReceiptRequestModel body,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    FileTransmissionReceiptRequestModel body = new FileTransmissionReceiptRequestModel();
    // Invoking the API call with sample inputs
    dataImportEndpoints.createFileTransmissionReceiptAsync(body, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Unexpected error in API call. See HTTP response body for details. |
| 401 | TODO: Add an error description |



#### <a name="update_file_transmission_request_async"></a>![Method: ](https://apidocs.io/img/method.png "com.smartcosmos.profiles.controllers.DataImportEndpointsController.updateFileTransmissionRequestAsync") updateFileTransmissionRequestAsync

> TODO: Add a method description


```java
void updateFileTransmissionRequestAsync(
        final FileTransmissionRequestRequestModel body,
        final APICallBack<FileTransmissionRequestResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    FileTransmissionRequestRequestModel body = new FileTransmissionRequestRequestModel();
    // Invoking the API call with sample inputs
    dataImportEndpoints.updateFileTransmissionRequestAsync(body, new APICallBack<FileTransmissionRequestResponseModel>() {
        public void onSuccess(HttpContext context, FileTransmissionRequestResponseModel response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Unexpected error in API call. See HTTP response body for details. |
| 401 | TODO: Add an error description |



[Back to List of Controllers](#list_of_controllers)

### <a name="tag_data_endpoints_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.smartcosmos.profiles.controllers.TagDataEndpointsController") TagDataEndpointsController

#### Get singleton instance

The singleton instance of the ``` TagDataEndpointsController ``` class can be accessed from the API Client.

```java
TagDataEndpointsController tagDataEndpoints = client.getTagDataEndpoints();
```

#### <a name="get_tag_metadata_definition_async"></a>![Method: ](https://apidocs.io/img/method.png "com.smartcosmos.profiles.controllers.TagDataEndpointsController.getTagMetadataDefinitionAsync") getTagMetadataDefinitionAsync

> ### Idempotent Behaviour
> This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
> - **200 OK** specified tag was found, result available
> - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
> - **401 UNAUTHORIZED** user not authorized
> ### Input HTTP Headers:
> - HTTP Basic Authorization (as specified above)
> ### Input parameters
> - tagId (required, string, `E12345678912345678`) ... a single RFID tag identifier
> - nameLike (optional, string, `chip`) ... Comparison string for metadata properties
> ### Output parameters
> - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
> - tagId the requested `tagID`
> - properties an array of JSON objects, each of which contains property ID, property name, property data type, and a flag indicating whether the property exists for the tag.


```java
void getTagMetadataDefinitionAsync(
        final String tagId,
        final String nameLike,
        final APICallBack<GetTagMetadataDefinitionResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| tagId |  ``` Required ```  | TODO: Add a parameter description |
| nameLike |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String tagId = "tagId";
String nameLike = "nameLike";
// Invoking the API call with sample inputs
tagDataEndpoints.getTagMetadataDefinitionAsync(tagId, nameLike, new APICallBack<GetTagMetadataDefinitionResponseModel>() {
    public void onSuccess(HttpContext context, GetTagMetadataDefinitionResponseModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Unexpected error in API call. See HTTP response body for details. |
| 401 | TODO: Add an error description |



#### <a name="get_query_tags_async"></a>![Method: ](https://apidocs.io/img/method.png "com.smartcosmos.profiles.controllers.TagDataEndpointsController.getQueryTagsAsync") getQueryTagsAsync

> Look up an array of the first **count** tag IDs with the specified batch URN.
> ### Output parameters
> - tagIds (array of string, `E12345678912345678`) ... Array of RFID tag identifiers


```java
void getQueryTagsAsync(
        final String batchUrn,
        final Integer count,
        final APICallBack<QueryTagsResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| batchUrn |  ``` Required ```  | Case-sensitive batch URN |
| count |  ``` Optional ```  ``` DefaultValue ```  | Maximum number of tag IDs to return; defaults to 100000; maximum is 1000000 |


#### Example Usage

```java
String batchUrn = "batchUrn";
Integer count = 100000;
// Invoking the API call with sample inputs
tagDataEndpoints.getQueryTagsAsync(batchUrn, count, new APICallBack<QueryTagsResponseModel>() {
    public void onSuccess(HttpContext context, QueryTagsResponseModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Unexpected error in API call. See HTTP response body for details. |
| 401 | TODO: Add an error description |



#### <a name="create_get_single_tag_code_message_async"></a>![Method: ](https://apidocs.io/img/method.png "com.smartcosmos.profiles.controllers.TagDataEndpointsController.createGetSingleTagCodeMessageAsync") createGetSingleTagCodeMessageAsync

> Get a message to a single numeric tag code.
> ### Idempotent Behaviour
> This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
> - **200 OK** message available
> - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
> - **401 UNAUTHORIZED** user not authorized
> ### Input HTTP Headers:
> - HTTP Basic Authorization (as specified above)
> - Accept language (as specified above)
> ### Input parameters:
> - tagCode (required, number, `0`) ... Result code of a tag action
> ### Output parameters:
> - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
> - message (string, `verified`) ... Result message in `Accept-Language` (see `Multi language support`)


```java
void createGetSingleTagCodeMessageAsync(
        final GetSingleTagCodeMessageRequestModel body,
        final APICallBack<GetSingleTagCodeMessageResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    GetSingleTagCodeMessageRequestModel body = new GetSingleTagCodeMessageRequestModel();
    // Invoking the API call with sample inputs
    tagDataEndpoints.createGetSingleTagCodeMessageAsync(body, new APICallBack<GetSingleTagCodeMessageResponseModel>() {
        public void onSuccess(HttpContext context, GetSingleTagCodeMessageResponseModel response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Unexpected error in API call. See HTTP response body for details. |
| 401 | TODO: Add an error description |



#### <a name="update_tag_values_async"></a>![Method: ](https://apidocs.io/img/method.png "com.smartcosmos.profiles.controllers.TagDataEndpointsController.updateTagValuesAsync") updateTagValuesAsync

> Writes application data to tags, which updated the existing application data in Profiles. This
> function also supports setting the lock state of the application data, which prevents further
> changes of the application data.
> Writing application data to a tag is permitted under following conditions only:
> - The tag with the given tagId must exist in Profiles
> - The tag must have an application record with the given appId
> - The lock state of the tag's application data must be present and explicitly set to **false**
> - To insert a new application record, the data transaction endpoint shall be used
> **Notes:**
> - Omitting **value** in the request will update the lock state of the tag only.
> - Omitting **locked** in the request will write the value only.
> - It is not possible to unlock a locked tag by setting **locked** to **false**.
> ### Idempotent Behaviour
> This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
> - **200 OK** tags found and result available (also returned if only a subset of tags have this keys)
> - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
> - **401 UNAUTHORIZED** user not authorized
> - **404 NOT_FOUND** no matching tags found or none the tags found do have app IDs with given name
> ### Input HTTP Headers:
> - HTTP Basic Authorization (as specified above)
> - Accept language (as specified above)
> ### Input parameters:
> - appId (required, string, `ndef`) ... Application ID which references the data
> - tagId (required, string, `0EEEE100000001`) ... Identifier for each tag to be updated
> - value (optional, string, `AQIDBAUGBwgJCgsM`) ... Application data to be updated
> - locked (optional, boolean, `true`) ... Lock flag to be set
> ### Output parameters:
> - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
> - tagId (string, `0EEEE100000001`) ... Tag ID
> - tagCode (Number, `0`) ... Indicates if the result code for this tag (see `Possible result codes for a tag actions`)


```java
void updateTagValuesAsync(
        final UpdateTagValuesRequestModel body,
        final APICallBack<UpdateTagValuesResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    UpdateTagValuesRequestModel body = new UpdateTagValuesRequestModel();
    // Invoking the API call with sample inputs
    tagDataEndpoints.updateTagValuesAsync(body, new APICallBack<UpdateTagValuesResponseModel>() {
        public void onSuccess(HttpContext context, UpdateTagValuesResponseModel response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Unexpected error in API call. See HTTP response body for details. |
| 401 | TODO: Add an error description |
| 404 | Unexpected error in API call. See HTTP response body for details. |



#### <a name="create_get_application_data_from_tags_async"></a>![Method: ](https://apidocs.io/img/method.png "com.smartcosmos.profiles.controllers.TagDataEndpointsController.createGetApplicationDataFromTagsAsync") createGetApplicationDataFromTagsAsync

> Get application data from tags, which returns data encoded on the tags. This function also returns
> the lock state of the application data.
> ### Idempotent Behaviour
> This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
> - **200 OK** tags found and result available (also returned if only a subset of tags have this keys)
> - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
> - **401 UNAUTHORIZED** user not authorized
> - **404 NOT_FOUND** no matching tags found or none the tags found does have keys with given name
> ### Input HTTP Headers:
> - HTTP Basic Authorization (as specified above)
> - Accept language (as specified above)
> ### Input parameters:
> - tagIds (required, string, `0EEEE100000001`) ... Identifier for each tag to be queried
> - appId (required, string, `ndef`) ... Application ID which references the data
> ### Output parameters:
> - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
> - tagId (string, `0EEEE100000001`) ... Tag ID
> - tagCode (Number, `0`) ... Indicates if the result code for this tag (see `Possible result codes for a tag actions`)
> - value (string, `AQIDBAUGBwgJCgsM`) ... Application data (Base64 encoded)
> - locked (boolean, `false`) ... Tag has been made read-only


```java
void createGetApplicationDataFromTagsAsync(
        final GetApplicationDataFromTagsRequestModel body,
        final APICallBack<GetApplicationDataFromTagsResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    GetApplicationDataFromTagsRequestModel body = new GetApplicationDataFromTagsRequestModel();
    // Invoking the API call with sample inputs
    tagDataEndpoints.createGetApplicationDataFromTagsAsync(body, new APICallBack<GetApplicationDataFromTagsResponseModel>() {
        public void onSuccess(HttpContext context, GetApplicationDataFromTagsResponseModel response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Unexpected error in API call. See HTTP response body for details. |
| 401 | TODO: Add an error description |
| 404 | Unexpected error in API call. See HTTP response body for details. |



#### <a name="get_query_batches_async"></a>![Method: ](https://apidocs.io/img/method.png "com.smartcosmos.profiles.controllers.TagDataEndpointsController.getQueryBatchesAsync") getQueryBatchesAsync

> Look up an array of the first **count** batchUrns with the specified customer PO.
> **NOTE: Only one customerPO can be specified.**
> ### Output parameters
> - batchUrns (array of string, `urn:uuid:smartrac-group:batch:99990001`) ... Array of batch URNs


```java
void getQueryBatchesAsync(
        final String customerPO,
        final Integer count,
        final APICallBack<QueryBatchesResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerPO |  ``` Required ```  | Case-sensitive customerPO |
| count |  ``` Optional ```  ``` DefaultValue ```  | Maximum number of batch URNs to return; defaults to 100000; maximum is 1000000 |


#### Example Usage

```java
String customerPO = "customerPO";
Integer count = 100000;
// Invoking the API call with sample inputs
tagDataEndpoints.getQueryBatchesAsync(customerPO, count, new APICallBack<QueryBatchesResponseModel>() {
    public void onSuccess(HttpContext context, QueryBatchesResponseModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Unexpected error in API call. See HTTP response body for details. |
| 401 | TODO: Add an error description |



#### <a name="create_get_tag_metadata_async"></a>![Method: ](https://apidocs.io/img/method.png "com.smartcosmos.profiles.controllers.TagDataEndpointsController.createGetTagMetadataAsync") createGetTagMetadataAsync

> ### Idempotent Behaviour
> This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
> - **200 OK** minimum 1 tag found and result available
> - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
> - **401 UNAUTHORIZED** user not authorized
> ### Input HTTP Headers:
> - HTTP Basic Authorization (as specified above)
> ### Input parameters
> - tagIds (required, array of string, `E12345678912345678`) ... Array of RFID tag identifiers; max 1000 entries allowed
> - verificationTypes (optional, array of string, `RR`) ... Array of verification types
> - properties (optional, array of string, `plantId,batchId`) ... Array of requested properties
> <!--
> - materialPerformance (optional, array of string, `air,carton`) ... Array of requested material performance data
> -->
> ### Available tag properties
> Property ID | Data Type | Description | Availability
> ------------ | ------------- | ------------ | ------------
> custId | String | Customer ID | available
> orderId | String | Order ID | available
> orderDate | Long | Order date | available
> orderQty | Number | Order quantity | available
> orderQtyU | String | Order quantity unit | available
> customerPO | String | Customer purchase order number | available
> customerName | String | Customer name | available
> supplPO | String | Supplier purchase order number | available
> delivId | String | Delivery ID | available
> delivDate | Long | Delivery date | available
> delivQty | Number | Delivery quantity | available
> delivQtyU | String | Delivery quantity unit | available
> batchId | String | Roll number / batch ID | available
> yield | Number | Batch yield [%] | available
> subRoll | String | Sub roll number / sub batch ID | available
> plantId | String | Manufacturer production side ID | available
> chipManuf | String | Chip manufacturer | available
> chipModel | String | Chip model | available
> inlayType | String | Inlay type | available
> inlayManufDate | Long | Inlay manufacturer date | available
> attenuation | Number | Attenuation in dB | available
> checkState | Number | 0=failed; 1=passed (default) | available
> Notes:
>  - Only available properties can be requested (check `Availability` column above)
>  - Same data is not available for all tags/batches
>  - There are additional properties planned in the future
> ### Output parameters
> - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
> - tagId according the requested `tagIds`
> - tagCode (Number, `0`) ... Indicates if the result code for this tag (see `result codes for a tag actions`)
> - verificationState according the requested `verificationTypes`
> - properties according the requested `properties`


```java
void createGetTagMetadataAsync(
        final GetTagMetadataRequestModel body,
        final APICallBack<GetTagMetadataResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    GetTagMetadataRequestModel body = new GetTagMetadataRequestModel();
    // Invoking the API call with sample inputs
    tagDataEndpoints.createGetTagMetadataAsync(body, new APICallBack<GetTagMetadataResponseModel>() {
        public void onSuccess(HttpContext context, GetTagMetadataResponseModel response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Unexpected error in API call. See HTTP response body for details. |
| 401 | TODO: Add an error description |



#### <a name="create_get_keys_used_for_tag_authentication_async"></a>![Method: ](https://apidocs.io/img/method.png "com.smartcosmos.profiles.controllers.TagDataEndpointsController.createGetKeysUsedForTagAuthenticationAsync") createGetKeysUsedForTagAuthenticationAsync

> Get authentication keys for encoded tags, which can be used to access the tag memory. The key names,
> content and access rules need to be defined when ordering the tags.
> It is possible to have several applications with their corresponding keys on a tag.
> ### Idempotent Behaviour
> This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
> - **200 OK** tags found and result available (also returned if only a subset of tags have this keys)
> - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
> - **401 UNAUTHORIZED** user not authorized
> - **404 NOT_FOUND** no matching tags found or none the tags found does have keys with given name
> ### Input HTTP Headers:
> - HTTP Basic Authorization (as specified above)
> - Accept language (as specified above)
> ### Input parameters:
> - tagIds (required, string, `0EEEE100000001`) ... Identifier for each tag to be queried
> - appId (required, string, `SC Public Transport`) ... Application ID which references the key
> ### Output parameters:
> - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
> - tagId (string, `0EEEE100000001`) ... Tag ID
> - tagCode (Number, `0`) ... Indicates if the result code for this tag (see `Possible result codes for a tag actions`)
> - key (string, `0102030405060708090A0B0C`) ... Key blob (AsciiHex encoded key)


```java
void createGetKeysUsedForTagAuthenticationAsync(
        final GetKeysUsedForTagAuthenticationRequestModel body,
        final APICallBack<GetKeysUsedForTagAuthenticationResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    GetKeysUsedForTagAuthenticationRequestModel body = new GetKeysUsedForTagAuthenticationRequestModel();
    // Invoking the API call with sample inputs
    tagDataEndpoints.createGetKeysUsedForTagAuthenticationAsync(body, new APICallBack<GetKeysUsedForTagAuthenticationResponseModel>() {
        public void onSuccess(HttpContext context, GetKeysUsedForTagAuthenticationResponseModel response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Unexpected error in API call. See HTTP response body for details. |
| 401 | TODO: Add an error description |
| 404 | Unexpected error in API call. See HTTP response body for details. |



[Back to List of Controllers](#list_of_controllers)

### <a name="tag_delivery_network_endpoints_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.smartcosmos.profiles.controllers.TagDeliveryNetworkEndpointsController") TagDeliveryNetworkEndpointsController

#### Get singleton instance

The singleton instance of the ``` TagDeliveryNetworkEndpointsController ``` class can be accessed from the API Client.

```java
TagDeliveryNetworkEndpointsController tagDeliveryNetworkEndpoints = client.getTagDeliveryNetworkEndpoints();
```

#### <a name="get_tag_delivery_network_data_async"></a>![Method: ](https://apidocs.io/img/method.png "com.smartcosmos.profiles.controllers.TagDeliveryNetworkEndpointsController.getTagDeliveryNetworkDataAsync") getTagDeliveryNetworkDataAsync

> **DRAFT** - Under development
> Get TDN data for a tag. The TDN data is proprietary and needs the SMART COSMOS TDN client
> service on the REST client for decoding. The endpoint will report "404 Not found" for all
> tags with no TDN data attached (so it is not possible to probe the Profiles instance for 
> no-TDN tag IDs without authorization).
> ### Notes
>  - Public endpoint (no authorization needed)
>  - If a secure endpoint is needed, it is possible to disable this endpoint and use GetTagValue with "TDN" as appId instead.
> ### Idempotent Behaviour
> This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate
> the actual result.
> - **200 OK** valid TDN tag ID
> - **404 NOT_FOUND** invalid tag ID (tag not available or no TDN data attached)
> ### Output parameters:
> - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
> - value (string, `54646E50726F707269657461727944617461`) ... TDN data (AsciiHex encoded)


```java
void getTagDeliveryNetworkDataAsync(
        final String tagId,
        final APICallBack<GetTagDeliveryNetworkDataResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| tagId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String tagId = "tagId";
// Invoking the API call with sample inputs
tagDeliveryNetworkEndpoints.getTagDeliveryNetworkDataAsync(tagId, new APICallBack<GetTagDeliveryNetworkDataResponseModel>() {
    public void onSuccess(HttpContext context, GetTagDeliveryNetworkDataResponseModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 404 | TODO: Add an error description |



[Back to List of Controllers](#list_of_controllers)

### <a name="transaction_endpoints_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.smartcosmos.profiles.controllers.TransactionEndpointsController") TransactionEndpointsController

#### Get singleton instance

The singleton instance of the ``` TransactionEndpointsController ``` class can be accessed from the API Client.

```java
TransactionEndpointsController transactionEndpoints = client.getTransactionEndpoints();
```

#### <a name="create_transactionally_insert_or_update_data_provided_in_request_message_body_into_the_datastore_async"></a>![Method: ](https://apidocs.io/img/method.png "com.smartcosmos.profiles.controllers.TransactionEndpointsController.createTransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreAsync") createTransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreAsync

> ### Idempotent Behaviour
> This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
> ### Input parameters:
> - [[account, objects[], objectAddresses[], metadata[], relationships[], [...], ...]
> ### Output parameters:
> - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
> - message (string, `11e5d3f6-0c65-7791-917a-e95d5a282bcb`) ... System-generated Transaction ID, as used in all logging
> ### Input HTTP Headers:
> - HTTP Basic Authorization (as specified above)
> ### HTTP result codes
> This endpoint will respond with an appropriate HTTP status code to indicate the actual result
> - **200 SUCCESS** the insertion was successful. The UUID in the message string of the response body is system-generated transaction ID, which can be helpful for logging.
> - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information, including an approximate count of elements processed before the error occurred.
> - **401 UNAUTHORIZED** user not authorized


```java
void createTransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreAsync(
        final List<TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModel> body,
        final String transactionHandlerName,
        final APICallBack<TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  ``` Collection ```  | TODO: Add a parameter description |
| transactionHandlerName |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    List<TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModel> body = new ArrayList<TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreRequestModel>();
    String transactionHandlerName = "transactionHandlerName";
    // Invoking the API call with sample inputs
    transactionEndpoints.createTransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreAsync(body, transactionHandlerName, new APICallBack<TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModel>() {
        public void onSuccess(HttpContext context, TransactionallyInsertOrUpdateDataProvidedInRequestMessageBodyIntoTheDatastoreResponseModel response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Unexpected error in API call. See HTTP response body for details. |
| 401 | TODO: Add an error description |



[Back to List of Controllers](#list_of_controllers)

### <a name="tag_authentication_endpoints_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.smartcosmos.profiles.controllers.TagAuthenticationEndpointsController") TagAuthenticationEndpointsController

#### Get singleton instance

The singleton instance of the ``` TagAuthenticationEndpointsController ``` class can be accessed from the API Client.

```java
TagAuthenticationEndpointsController tagAuthenticationEndpoints = client.getTagAuthenticationEndpoints();
```

#### <a name="create_get_otp_authentication_challenge_async"></a>![Method: ](https://apidocs.io/img/method.png "com.smartcosmos.profiles.controllers.TagAuthenticationEndpointsController.createGetOTPAuthenticationChallengeAsync") createGetOTPAuthenticationChallengeAsync

> OTP (One-Time Password) Authentication is performed in three steps:
>  1. Retrieve an authentication challenge for the given tag
>     in: tagId, appId
>     out: otpRequestId, otpVector
>  2. Calculate the OTP encryption result on the client
>  3. Send the OTP encryption result to the service
>     in: tagId, otpRequestId, otpResult
>     out: verification result
> Get an authentication challenge to authenticate a tag identified by its tag ID using an OTP init vector
> and a key. The authentication session is valid for 60 seconds.
> ### Idempotent Behaviour
> This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
> - **200 OK** tags found and result available (also returned if only a subset of tags have this keys)
> - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
> - **401 UNAUTHORIZED** user not authorized
> - **404 NOT_FOUND** no matching tags found or none the tags found does support OTP authentication
> ### Input parameters:
> - tagId (required, string, `0EEEE100000001`) ... Identifier for the tag
> - appId (optional, string, `OTP`) ... Identifier for the requested application (used for multi application RFID tags)
> ### Output parameters:
> - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
> - message (string, `Verification successful`) ... Result message
> - tagId (string, `0EEEE100000001`) ... tag ID
> - otpRequestId (string, `urn:uuid:82b3a00c-e1b0-44cb-a50d-7705e1c6e2b4`) ... Identifier to track the authentication flow
> - otpVector (byte[], `MzMEOwsSAkYTBRUTPjpGJRIsLgE=`) ... Generated OTP init vector to calculate the OTP result


```java
void createGetOTPAuthenticationChallengeAsync(
        final GetOTPAuthenticationChallengeRequestModel body,
        final APICallBack<GetOTPAuthenticationChallengeResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    GetOTPAuthenticationChallengeRequestModel body = new GetOTPAuthenticationChallengeRequestModel();
    // Invoking the API call with sample inputs
    tagAuthenticationEndpoints.createGetOTPAuthenticationChallengeAsync(body, new APICallBack<GetOTPAuthenticationChallengeResponseModel>() {
        public void onSuccess(HttpContext context, GetOTPAuthenticationChallengeResponseModel response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Unexpected error in API call. See HTTP response body for details. |
| 401 | TODO: Add an error description |
| 404 | Unexpected error in API call. See HTTP response body for details. |



#### <a name="create_verify_nxp_tag_signature_async"></a>![Method: ](https://apidocs.io/img/method.png "com.smartcosmos.profiles.controllers.TagAuthenticationEndpointsController.createVerifyNXPTagSignatureAsync") createVerifyNXPTagSignatureAsync

> Verify the signature of NXP NTAG, Mifare Ultralight EV1 or I-Code SLIX2 tags. The signature could be obtained
> from the NXP tag by issuing a READ_SIG command. To use the correct verification key, it is also
> required to submit the tag version, which could be acquired by issuing a GET_VERSION command.
> The signature is verified in Profiles by ECDSA using the public key from NXP.
> Following NXP chip types are supported:
> - NXP NTAG
> - NXP Mifare Ultralight EV1
> - NXP I-Code SLIX2
> ### Note on tagVersion
> - For NTAG and Ultralight it is required to provide the GET_VERSION response to locate the correct verification key
> - For I-Code the *tagVersion* could be ommitted, because the verification key is derived from the UID directly
> ### Idempotent Behaviour
> This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
> - **200 OK** signature valid
> - **400 BAD_REQUEST** signature invalid
> - **401 UNAUTHORIZED** user not authorized
> ### Input parameters:
> - tagId (required, string, `04001122334455`) ... NXP tag UID
> - tagVersion (optional, string, `0004040201000F03`) ... NXP GET_VERSION response
> - signature (required, string, `MTIzNDU2NzgxMjM0NTY3ODEyMzQ1Njc4MTIzNDU2Nzg=`) ... signature read from the chip (Base64 encoded)
> ### Output parameters:
> - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
> - message (string, `Verification successful`) ... Result message
> - tagId (string, `04001122334455`) ... NXP tag UID


```java
void createVerifyNXPTagSignatureAsync(
        final VerifyNXPTagSignatureRequestModel body,
        final APICallBack<VerifyNXPTagSignatureResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    VerifyNXPTagSignatureRequestModel body = new VerifyNXPTagSignatureRequestModel();
    // Invoking the API call with sample inputs
    tagAuthenticationEndpoints.createVerifyNXPTagSignatureAsync(body, new APICallBack<VerifyNXPTagSignatureResponseModel>() {
        public void onSuccess(HttpContext context, VerifyNXPTagSignatureResponseModel response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Unexpected error in API call. See HTTP response body for details. |
| 401 | TODO: Add an error description |



#### <a name="create_validate_otp_encryption_result_async"></a>![Method: ](https://apidocs.io/img/method.png "com.smartcosmos.profiles.controllers.TagAuthenticationEndpointsController.createValidateOTPEncryptionResultAsync") createValidateOTPEncryptionResultAsync

> Validate the OTP authentication attempt based on the OTP init vactor identified by UUID.
> ### Idempotent Behaviour
> This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
> - **200 OK** authentication successful
> - **400 BAD_REQUEST** authentication failed
> - **401 UNAUTHORIZED** user not authorized
> - **404 NOT_FOUND** invalid session or session expired
> ### Input parameters:
> - timestamp (required, long, `1430911319542`) ... UTC timestamp used by the client to calculate the OTP
> - otpRequestId (required, string, `urn:uuid:82b3a00c-e1b0-44cb-a50d-7705e1c6e2b4`) ... Server side generated id to track the authentication flow
> - otpResult (required, int, `123456`) ... Generated OTP from HMAC according to RFC 6238
> ### Output parameters:
> - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
> - message (string, `Verification successful`) ... Result message
> - tagId (string, `0EEEE100000001`) ... tag ID


```java
void createValidateOTPEncryptionResultAsync(
        final ValidateOTPEncryptionResultRequestModel body,
        final APICallBack<ValidateOTPEncryptionResultResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    ValidateOTPEncryptionResultRequestModel body = new ValidateOTPEncryptionResultRequestModel();
    // Invoking the API call with sample inputs
    tagAuthenticationEndpoints.createValidateOTPEncryptionResultAsync(body, new APICallBack<ValidateOTPEncryptionResultResponseModel>() {
        public void onSuccess(HttpContext context, ValidateOTPEncryptionResultResponseModel response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Unexpected error in API call. See HTTP response body for details. |
| 401 | TODO: Add an error description |
| 404 | Unexpected error in API call. See HTTP response body for details. |



[Back to List of Controllers](#list_of_controllers)

### <a name="tag_verification_endpoints_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.smartcosmos.profiles.controllers.TagVerificationEndpointsController") TagVerificationEndpointsController

#### Get singleton instance

The singleton instance of the ``` TagVerificationEndpointsController ``` class can be accessed from the API Client.

```java
TagVerificationEndpointsController tagVerificationEndpoints = client.getTagVerificationEndpoints();
```

#### <a name="create_get_verification_state_message_async"></a>![Method: ](https://apidocs.io/img/method.png "com.smartcosmos.profiles.controllers.TagVerificationEndpointsController.createGetVerificationStateMessageAsync") createGetVerificationStateMessageAsync

> Get a message to a single verification state. Translate a numeric verification state into a human readable format. e.g. `0` into `verified`
> ### Idempotent Behaviour
> This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
> - **200 OK** tag found and result available
> - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
> - **401 UNAUTHORIZED** user not authorized
> ### Input HTTP Headers:
> - HTTP Basic Authorization (as specified above)
> - Accept language (as specified above)
> ### Input parameters:
> - verificationType (required, string, `RR`) ... Identifier of the verification type
> - verificationState (required, number, `0`) ... State of the verification
> ### Output parameters:
> - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
> - message (string, `verified`) ... Result message in `Accept-Language` (see `Multi language support`)


```java
void createGetVerificationStateMessageAsync(
        final GetVerificationStateMessageRequestModel body,
        final APICallBack<GetVerificationStateMessageResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    GetVerificationStateMessageRequestModel body = new GetVerificationStateMessageRequestModel();
    // Invoking the API call with sample inputs
    tagVerificationEndpoints.createGetVerificationStateMessageAsync(body, new APICallBack<GetVerificationStateMessageResponseModel>() {
        public void onSuccess(HttpContext context, GetVerificationStateMessageResponseModel response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Unexpected error in API call. See HTTP response body for details. |
| 401 | TODO: Add an error description |



#### <a name="create_verify_tags_for_round_rock_compliance_async"></a>![Method: ](https://apidocs.io/img/method.png "com.smartcosmos.profiles.controllers.TagVerificationEndpointsController.createVerifyTagsForRoundRockComplianceAsync") createVerifyTagsForRoundRockComplianceAsync

> Verify tags for Round Rock compliance (verification type `RR`)
> ### Idempotent Behaviour
> This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
> - **200 OK** tag found and Round Rock compliance result available
> - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
> ### Input parameters:
> - tagIds (required, array of string, `E12345678912345678`) ... Array of RFID tag identifiers; max 1000 entries allowed
> ### Output parameters:
> - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
> - tagId (string, `0EEEE100000001`) ... RFID tag identifiers
> - tagCode (Number, `0`) ... Indicates if the result code for this tag (see `result codes for a tag actions`)
> - state (Number, `0`) ... Indicates the current RoundRock compliance state (1 = Round Rock licensed; 0 = Not RoundRock licensed)
> The output contains all desired tag records. Even if the tag is not available or the user does not have permissions. The `tagCode` indicates the result code for each tag.


```java
void createVerifyTagsForRoundRockComplianceAsync(
        final VerifyTagsForRoundRockComplianceRequestModel body,
        final APICallBack<VerifyTagsForRoundRockComplianceResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    VerifyTagsForRoundRockComplianceRequestModel body = new VerifyTagsForRoundRockComplianceRequestModel();
    // Invoking the API call with sample inputs
    tagVerificationEndpoints.createVerifyTagsForRoundRockComplianceAsync(body, new APICallBack<VerifyTagsForRoundRockComplianceResponseModel>() {
        public void onSuccess(HttpContext context, VerifyTagsForRoundRockComplianceResponseModel response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Unexpected error in API call. See HTTP response body for details. |



#### <a name="create_verify_tags_for_a_verification_type_async"></a>![Method: ](https://apidocs.io/img/method.png "com.smartcosmos.profiles.controllers.TagVerificationEndpointsController.createVerifyTagsForAVerificationTypeAsync") createVerifyTagsForAVerificationTypeAsync

> Verify tags for a verification type, which is represented by an unique verification id like 'RR'
> ### Idempotent Behaviour
> This endpoint is idempotent and will respond with an appropriate HTTP status code to indicate the actual result
> - **200 OK** tag found and verification result available
> - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
> - **401 UNAUTHORIZED** user not authorized
> ### Input HTTP Headers:
> - HTTP Basic Authorization (as specified above)
> ### Input parameters:
> - tagIds (required, array of string, `E12345678912345678`) ... Array of RFID tag identifiers; max 1000 entries allowed
> - verificationType (required, String, `RR`) ... Verification type
> ### Output parameters:
> - code (Number, `0`) ... Indicates the result code of this call (see `result codes`)
> - tagId (string, `0EEEE100000001`) ... RFID tag identifiers
> - tagCode (Number, `0`) ... Indicates if the result code for this tag (see `Possible result codes for a tag actions`)
> - state (Number, `0`) ... Indicates the current verification state; Number depends on verification type; Use the message function to get a string message
> The output contains all desired tag records. Even if the tag is not available or the user does not have permissions. The `tagCode` indicates the result code for each tag.


```java
void createVerifyTagsForAVerificationTypeAsync(
        final VerifyTagsForAVerificationTypeRequestModel body,
        final APICallBack<VerifyTagsForAVerificationTypeResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    VerifyTagsForAVerificationTypeRequestModel body = new VerifyTagsForAVerificationTypeRequestModel();
    // Invoking the API call with sample inputs
    tagVerificationEndpoints.createVerifyTagsForAVerificationTypeAsync(body, new APICallBack<VerifyTagsForAVerificationTypeResponseModel>() {
        public void onSuccess(HttpContext context, VerifyTagsForAVerificationTypeResponseModel response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Unexpected error in API call. See HTTP response body for details. |
| 401 | TODO: Add an error description |



[Back to List of Controllers](#list_of_controllers)

### <a name="platform_availability_endpoints_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.smartcosmos.profiles.controllers.PlatformAvailabilityEndpointsController") PlatformAvailabilityEndpointsController

#### Get singleton instance

The singleton instance of the ``` PlatformAvailabilityEndpointsController ``` class can be accessed from the API Client.

```java
PlatformAvailabilityEndpointsController platformAvailabilityEndpoints = client.getPlatformAvailabilityEndpoints();
```

#### <a name="get_check_platform_availability_async"></a>![Method: ](https://apidocs.io/img/method.png "com.smartcosmos.profiles.controllers.PlatformAvailabilityEndpointsController.getCheckPlatformAvailabilityAsync") getCheckPlatformAvailabilityAsync

> Resource for checking the platform availability. 
> ### HTTP result codes
> This endpoint will respond with an appropriate HTTP status code to indicate the actual result
> - **204 NO_CONTENT** platform is available
> - **400 BAD_REQUEST** problem occurred, check message parameter for detailed information
> - **503 SERVICE_UNAVAILABLE** service is temporary unavailable (e.g. scheduled Platform Maintenance). Try again later.


```java
void getCheckPlatformAvailabilityAsync(final APICallBack<DynamicResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
platformAvailabilityEndpoints.getCheckPlatformAvailabilityAsync(new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Unexpected error in API call. See HTTP response body for details. |
| 503 | TODO: Add an error description |



[Back to List of Controllers](#list_of_controllers)



