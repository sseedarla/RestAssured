package com.rest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.hasItem;

public class AutomateGet {

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
                        body(

                                "workspaces.type", hasItems("personal", "personal"),
                               "workspaces.name", hasItem("My Workspace"),
                               "workspaces.type", hasItems("personal", "personal"),
                                "workspaces.size()", equalTo((2))




                        );




}

}
