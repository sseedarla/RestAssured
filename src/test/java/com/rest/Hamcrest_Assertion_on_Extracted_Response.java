package com.rest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class Hamcrest_Assertion_on_Extracted_Response {

        @Test
public void validate_get_status_code(){

           String name = given().
                    baseUri("https://api.postman.com").
                    header("x-api-key","PMAK-6718b076d9a1ee000186aea1-9acd6c551a2e0182464851a7a32cc69147").

            when().
                    get("/workspaces").
            then().
                         log().all().
                        assertThat().
                        statusCode(200).
                        extract().

                     response().path("workspaces[0].name");

     assertThat(name, equalTo("My Workspace"))  ;

          //  System.out.println("workspace name = " + name);
//System.out.println("workspace name = " + JsonPath.from(res).getString(  "workspaces[0].name"));


            //  JsonPath jsonPath = new JsonPath(res.asString());
//System.out.println("workspace name = " + jsonPath.getString("workspaces[0].name"));

//System.out.println("workspace name = " + res.path("workspaces[0].name"));










}

}
