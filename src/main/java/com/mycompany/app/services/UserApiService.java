package com.mycompany.app.services;

import com.mycompany.app.payloads.UserPayload;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class UserApiService {
    public Response registerUser(UserPayload user) {
       return RestAssured
                .given().contentType(ContentType.JSON).log().all()
                .body(user)
                .when()
                .post("register");
    }
}
