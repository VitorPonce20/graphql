import graphql.GraphQL;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

public class GraphQLTest {

    @Test
    public void GraphqlTest(){
        ValidatableResponse response;
         response = given().header("content-type","application/json")
//            .body("{\"query\":\"query{\\n  getAllUsers{\\n firstName,id\\n }\\n}\",\"variables\":null}")
              .body("{\"query\":\"query{\\n  getAllUsers{\\n firstName,id\\n }\\n}\",\"variables\":null}")
//            .body("{\"query\":\"{\\n getAllUsers {\\n id, firstName\\n}\\n}\",\"variables\":null} ")

                .when().post("https://graphql-api-ppql.onrender.com/graphql")
                .then()
                .assertThat()
                .body("data.getAllUsers.firstName",hasItems("Wilbur","Oriana","Brade","Sebastian"))
                .statusCode(200).log().all();

        System.out.println(response);




    }
    @Test
    public void GraphqlTestSPACEX(){
        ValidatableResponse response;
        response = given().header("content-type","application/json")
//            .body("{\"query\":\"query{\\n  getAllUsers{\\n firstName,id\\n }\\n}\",\"variables\":null}")
                .body("{\"query\":\"query{\\n  getAllUsers{\\n firstName,id\\n }\\n}\",\"variables\":null}")
//            .body("{\"query\":\"{\\n getAllUsers {\\n id, firstName\\n}\\n}\",\"variables\":null} ")

                .when().post("https://graphql-api-ppql.onrender.com/graphql")
                .then()
                .assertThat()
                .body("data.getAllUsers.firstName",hasItems("Wilbur","Oriana","Brade","Sebastian"))
                .statusCode(200).log().all();

        System.out.println(response);




    }
    @Test
    public void GraphqlTestUsers(){
        ValidatableResponse response;
        response = given().header("content-type","application/json")
//            .body("{\"query\":\"query{\\n  getAllUsers{\\n firstName,id\\n }\\n}\",\"variables\":null}")
                .body("{\"query\":\"query{\\n  getAllUsers{\\n firstName,id\\n }\\n}\",\"variables\":null}")
//            .body("{\"query\":\"{\\n getAllUsers {\\n id, firstName\\n}\\n}\",\"variables\":null} ")

                .when().post("https://graphql-api-ppql.onrender.com/graphql")
                .then()
                .assertThat()
                .body("data.getAllUsers.firstName",hasItems("Wilbur","Oriana","Brade","Sebastian"))
                .statusCode(200).log().all();

        System.out.println(response);




    }
    @Test
    public void GraphqlUsers(){
        ValidatableResponse response;
        response = given().header("content-type","application/json")
//            .body("{\"query\":\"query{\\n  getAllUsers{\\n firstName,id\\n }\\n}\",\"variables\":null}")
                .body("{\"query\":\"query{\\n  getAllUsers{\\n firstName,id\\n }\\n}\",\"variables\":null}")
//            .body("{\"query\":\"{\\n getAllUsers {\\n id, firstName\\n}\\n}\",\"variables\":null} ")

                .when().post("https://graphql-api-ppql.onrender.com/graphql")
                .then()
                .assertThat()
                .body("data.getAllUsers.firstName",hasItems("Wilbur","Oriana","Brade","Sebastian"))
                .statusCode(200).log().all();

        System.out.println(response);




    }
    @Test
    public void starWarsJediReturns(){
        ValidatableResponse response;
        response = given().header("content-type","application/json")
//            .body("{\"query\":\"query{\\n  getAllUsers{\\n firstName,id\\n }\\n}\",\"variables\":null}")
                .body("{\"query\":\"query{\\n  getAllUsers{\\n firstName,id\\n }\\n}\",\"variables\":null}")
//            .body("{\"query\":\"{\\n getAllUsers {\\n id, firstName\\n}\\n}\",\"variables\":null} ")

                .when().post("https://graphql-api-ppql.onrender.com/graphql")
                .then()
                .assertThat()
                .body("data.getAllUsers.firstName",hasItems("Wilbur","Oriana","Brade","Sebastian"))
                .statusCode(200).log().all();

        System.out.println(response);




    }

    @Test
    public void starWarsCloneWar(){
        ValidatableResponse response;
        response = given().header("content-type","application/json")
//            .body("{\"query\":\"query{\\n  getAllUsers{\\n firstName,id\\n }\\n}\",\"variables\":null}")
                .body("{\"query\":\"query{\\n  getAllUsers{\\n firstName,id\\n }\\n}\",\"variables\":null}")
//            .body("{\"query\":\"{\\n getAllUsers {\\n id, firstName\\n}\\n}\",\"variables\":null} ")

                .when().post("https://graphql-api-ppql.onrender.com/graphql")
                .then()
                .assertThat()
                .body("data.getAllUsers.firstName",hasItems("Wilbur","Oriana","Brade","Sebastian"))
                .statusCode(200).log().all();

        System.out.println(response);




    }
    @Test
    public void mandalorian(){
        ValidatableResponse response;
        response = given().header("content-type","application/json")
//            .body("{\"query\":\"query{\\n  getAllUsers{\\n firstName,id\\n }\\n}\",\"variables\":null}")
                .body("{\"query\":\"query{\\n  getAllUsers{\\n firstName,id\\n }\\n}\",\"variables\":null}")
//            .body("{\"query\":\"{\\n getAllUsers {\\n id, firstName\\n}\\n}\",\"variables\":null} ")

                .when().post("https://graphql-api-ppql.onrender.com/graphql")
                .then()
                .assertThat()
                .body("data.getAllUsers.firstName",hasItems("Wilbur","Oriana","Brade","Sebastian"))
                .statusCode(200).log().all();

        System.out.println(response);




    }
}
