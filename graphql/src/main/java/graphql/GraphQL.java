package graphql;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import pojo.AllFilmsPOJO;
import service.Service;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GraphQL extends Service {
    private Response response;
    public Response postGRAPHQL(){


        AllFilmsPOJO allFilmsPOJO = new AllFilmsPOJO();
        String BASE_URI = "https://swapi-graphql.netlify.app/.netlify/functions/index";
        String payload = "";
        payload = allFilmsPOJO.body;
        JsonPath json = new JsonPath(payload);
        System.out.println("Json");
        System.out.println(json);
        RestAssured.baseURI = BASE_URI;

         response = given().
                when().
                post(String.valueOf(payload));



        return (Response) response.body();
    }

    public Response getResponse() {
        return response;
    }
}
