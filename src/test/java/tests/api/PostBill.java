package tests.api;

import baseUrl.PossApp_url;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;


import pojos.CardItemsPojo;
import pojos.PostBillPojo;

import static io.restassured.RestAssured.given;

import static org.junit.Assert.assertEquals;

public class PostBill  extends PossApp_url {

    @Test
    public void postBillTest(){
        //Set the Url
        spec.pathParams("first","bills","second","add-bill");

//https://mors-pos-app-api.onrender.com/api/bills/add-bill

        CardItemsPojo  carditemss=new CardItemsPojo("ütü","https://productimages.hepsiburada.net/s/26/550/10150295011378.jpg/format:webp",
                400,"Teknoloji",1
        );

        PostBillPojo expectedData=new PostBillPojo("Ali Veli","123456",
                "Nakit",57,2,59, new CardItemsPojo[]{carditemss});

        System.out.println(expectedData);

        Response response = given().spec(spec).contentType(ContentType.JSON).body(expectedData).when().post("/{first}/{second}");
        response.prettyPrint();

        PostBillPojo actualData=response.as(PostBillPojo.class);
        System.out.println(actualData);
        assertEquals(200,response.getStatusCode());

        assertEquals(expectedData.getTotalAmount(),actualData.getTotalAmount());
        assertEquals(expectedData.getCustomerName(),actualData.getCustomerName());
        assertEquals(expectedData.getTax(),actualData.getTax());
        assertEquals(expectedData.getPaymentMode(),actualData.getPaymentMode());
        assertEquals(expectedData.getCustomerPhoneNumber(),actualData.getCustomerPhoneNumber());
        assertEquals(expectedData.getSubTotal(),actualData.getSubTotal());



 
    }}
