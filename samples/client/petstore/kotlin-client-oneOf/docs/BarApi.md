# BarApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBar**](BarApi.md#createBar) | **POST** /bar | Create a Bar


<a name="createBar"></a>
# **createBar**
> Bar createBar(barCreate)

Create a Bar

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BarApi()
val barCreate : BarCreate =  // BarCreate | 
try {
    val result : Bar = apiInstance.createBar(barCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BarApi#createBar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BarApi#createBar")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **barCreate** | [**BarCreate**](BarCreate.md)|  |

### Return type

[**Bar**](Bar.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

