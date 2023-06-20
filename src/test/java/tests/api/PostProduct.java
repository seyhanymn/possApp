package tests.api;

import baseUrl.PossApp_url;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.PostProductPojo;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

public class PostProduct extends PossApp_url {

    /*
         Given
          1)  https://mors-pos-app-api.onrender.com/api/product/add-product
          2)
            {
        "_id": "6418b95bdc6806308a20ded7",
        "title": "radyo",
        "img": "https://productimages.hepsiburada.net/s/361/550/110000376782107.jpg/format:webp",
        "price": 1122,
        "category": "Giyim",
        "createdAt": "2023-03-20T19:51:55.211Z",
        "updatedAt": "2023-03-20T19:51:55.211Z",
        "__v": 0
    }
        When
 		    I send POST Request to the URL
 	    Then
 		    Status code is 200
 		And
 		    Response body is like{
        "_id": "6418b95bdc6806308a20ded7",
        "title": "radyo",
        "img": "https://productimages.hepsiburada.net/s/361/550/110000376782107.jpg/format:webp",
        "price": 1122,
        "category": "Giyim",
        "createdAt": "2023-03-20T19:51:55.211Z",
        "updatedAt": "2023-03-20T19:51:55.211Z",
        "__v": 0
    }
     */

    @Test
    public void postProductTest(){
            //Set the Url
        spec.pathParams("first","product","second","add-product");

        //Set the Expected Data
        PostProductPojo expectedData=new PostProductPojo("radyo","https://productimages.hepsiburada.net/s/361/550/110000376782107.jpg/format:webp",
                1122,"Giyim");
        System.out.println(expectedData);

        //Send the Request and Get the Response
        Response response = given().spec(spec).contentType(ContentType.JSON).body(expectedData).when().post("/{first}/{second}");
        response.prettyPrint();

        //Do Assertion

       /*
        response.then().assertThat().statusCode(200);
        response.then().assertThat().
                body("title",equalTo(expectedData.getTitle())).
                body("price",equalTo(expectedData.getPrice())).
                body("category",equalTo(expectedData.getPrice())).
                body("img",equalTo(expectedData.getImg()));

        */
        PostProductPojo actualData=   response.as(PostProductPojo.class);
        System.out.println(actualData);
        assertEquals(expectedData.getPrice(),actualData.getPrice());
        assertEquals(expectedData.getCategory(),actualData.getCategory());
        assertEquals(expectedData.getImg(),actualData.getImg());
        assertEquals(expectedData.getTitle(),actualData.getTitle());




    }}