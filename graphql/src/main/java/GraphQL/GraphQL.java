package GraphQL;

import Service.Service;
import io.restassured.response.Response;

public class GraphQL extends Service {
    public Response postGRAPHQL(){
        Response response;
        String header = "header";
        String bodyPayload = "bodyPayload";

        response = post(header, bodyPayload);

        return response;

    }
}
