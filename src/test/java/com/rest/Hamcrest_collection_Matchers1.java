package com.rest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

public class Hamcrest_collection_Matchers1 {

        @Test
public void validate_get_status_code(){

           given().
                    baseUri("https://api.postman.com").
                    header("x-api-key","PMAK-6718b076d9a1ee000186aea1-9acd6c551a2e0182464851a7a32cc69147").

            when().
                    get("/workspaces").
            then().
                         log().all().
                        assertThat().
                        statusCode(200).
                        body("workspaces.name", contains("My Workspace","Demo Sample"));






}

}
