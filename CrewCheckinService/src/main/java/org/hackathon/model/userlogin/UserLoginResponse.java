package org.hackathon.model.userlogin;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class UserLoginResponse {

private String id;
private Integer ttl;
private String created;
private String userId;
private Error error;

/**
* 
* @return
* The id
*/
public String getId() {
return id;
}

/**
* 
* @param id
* The id
*/
public void setId(String id) {
this.id = id;
}

/**
* 
* @return
* The ttl
*/
public Integer getTtl() {
return ttl;
}

/**
* 
* @param ttl
* The ttl
*/
public void setTtl(Integer ttl) {
this.ttl = ttl;
}

/**
* 
* @return
* The created
*/
public String getCreated() {
return created;
}

/**
* 
* @param created
* The created
*/
public void setCreated(String created) {
this.created = created;
}

/**
* 
* @return
* The userId
*/
public String getUserId() {
return userId;
}

/**
* 
* @param userId
* The userId
*/
public void setUserId(String userId) {
this.userId = userId;
}

/**
* 
* @return
* The error
*/
public Error getError() {
return error;
}

/**
* 
* @param error
* The error
*/
public void setError(Error error) {
this.error = error;
}

}