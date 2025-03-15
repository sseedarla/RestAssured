package com.rest;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AutomateGet_Extact_Single_Field {

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

                 //  JsonPath jsonPath = new JsonPath(res.asString());

                     response().path("workspaces[0].name");

          //  System.out.println("workspace name = " + name);
//System.out.println("workspace name = " + JsonPath.from(res).getString(  "workspaces[0].name"));

//System.out.println("workspace name = " + jsonPath.getString("workspaces[0].name"));

//System.out.println("workspace name = " + res.path("workspaces[0].name"));










}

}
