package com.rest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Test {

    @org.testng.annotations.Test
    public void validate_get_status_code(){

        given().
                baseUri("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login").
                when().
                get("/workspaces").
                then().
                assertThat().


                statusCode(200).
        log().all();











    }
}
