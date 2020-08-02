package com.mycompany.app;

import com.mycompany.app.payloads.UserPayload;
import com.mycompany.app.services.UserApiService;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.BeforeClass;
import org.junit.Test;


public class AppTest {

    private final UserApiService userApiService = new UserApiService();

    @BeforeClass
    public static void setUp() {
        RestAssured.baseURI = "http://localhost:80";
    }

    @Test
    public void userCanRegister() {
        UserPayload user = new UserPayload()
                .firstName(RandomStringUtils.randomAlphanumeric(7))
                .lastName(RandomStringUtils.randomAlphanumeric(7))
                .username(RandomStringUtils.randomAlphanumeric(7))
                .password("password")
                .email("test@test.com");

        userApiService.registerUser(user)
                .then().log().all()
                .assertThat()
                .statusCode(200);
    }
}
