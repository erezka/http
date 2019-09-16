import kong.unirest.GetRequest;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
    public static HttpResponse<String> httpGet(String  method,String uri, HashMap<String, Object> parameters){
        return Unirest.request(method,uri)
                .queryString(parameters)
                .asString();
    }
}
