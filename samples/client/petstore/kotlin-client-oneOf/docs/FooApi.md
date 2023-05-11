# FooApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFoo**](FooApi.md#createFoo) | **POST** /foo | Create a Foo
[**getAllFoos**](FooApi.md#getAllFoos) | **GET** /foo | GET all Foos


<a name="createFoo"></a>
# **createFoo**
> FooRefOrValue createFoo(foo)

Create a Foo

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FooApi()
val foo : Foo =  // Foo | The Foo to be created
try {
    val result : FooRefOrValue = apiInstance.createFoo(foo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FooApi#createFoo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FooApi#createFoo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **foo** | [**Foo**](Foo.md)| The Foo to be created | [optional]

### Return type

[**FooRefOrValue**](FooRefOrValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json

<a name="getAllFoos"></a>
# **getAllFoos**
> kotlin.collections.List&lt;FooRefOrValue&gt; getAllFoos()

GET all Foos

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FooApi()
try {
    val result : kotlin.collections.List<FooRefOrValue> = apiInstance.getAllFoos()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FooApi#getAllFoos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FooApi#getAllFoos")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;FooRefOrValue&gt;**](FooRefOrValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

