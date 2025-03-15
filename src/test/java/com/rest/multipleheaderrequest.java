package com.rest;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.MatcherAssert.assertThat;

public class multipleheaderrequest {

    @Test
public void validate_get_status_code(){

    Header header = new Header("header","value2");
        Header matchheader = new Header("x-mock-match-request-headers","header");
        Headers headers = new Headers(header,matchheader);

        given().
                    baseUri("https://698ea4d5-9d1a-439b-a44f-f3adae41a664.mock.pstmn.io").
               //   header("x-api-key","PMAK-6718b076d9a1ee000186aea1-9acd6c551a2e0182464851a7a32cc69147").
                      headers(headers).



        when().
                get("/get").
                then().
        log().all().
         assertThat().
          statusCode(200);



}

}
