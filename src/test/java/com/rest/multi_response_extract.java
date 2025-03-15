package com.rest;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class multi_response_extract {

    @Test
public void validate_get_status_code(){

    Header header = new Header("header","value2");
        Header matchheader = new Header("x-mock-match-request-headers","header");
        Headers headers = new Headers(header,matchheader);

        Headers extractheaders =   given().
                    baseUri("https://698ea4d5-9d1a-439b-a44f-f3adae41a664.mock.pstmn.io").
               //   header("x-api-key","PMAK-6718b076d9a1ee000186aea1-9acd6c551a2e0182464851a7a32cc69147").
                      headers(headers).



        when().
                get("/get").
                then().
        log().all().
         assertThat().
          statusCode(200).
                extract().
                headers();

        for(Header aim : extractheaders){

            System.out.println("header name =  " + aim.getName()+ ", ");
            System.out.println("header name =  " + aim.getValue());
        }


}

}
