package org.hackathon.model.userlogin;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Error {

private String name;
private Integer status;
private String message;
private Integer statusCode;
private String code;

/**
* 
* @return
* The name
*/
public String getName() {
return name;
}

/**
* 
* @param name
* The name
*/
public void setName(String name) {
this.name = name;
}

/**
* 
* @return
* The status
*/
public Integer getStatus() {
return status;
}

/**
* 
* @param status
* The status
*/
public void setStatus(Integer status) {
this.status = status;
}

/**
* 
* @return
* The message
*/
public String getMessage() {
return message;
}

/**
* 
* @param message
* The message
*/
public void setMessage(String message) {
this.message = message;
}

/**
* 
* @return
* The statusCode
*/
public Integer getStatusCode() {
return statusCode;
}

/**
* 
* @param statusCode
* The statusCode
*/
public void setStatusCode(Integer statusCode) {
this.statusCode = statusCode;
}

/**
* 
* @return
* The code
*/
public String getCode() {
return code;
}

/**
* 
* @param code
* The code
*/
public void setCode(String code) {
this.code = code;
}

}