package Service;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Service {
    public static Response post(String header, String bodyPayload){
        Response response;
        response = (Response) given().header("user","test").when().post().then().log().all();
        return response;
    }
}
