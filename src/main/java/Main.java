
import kong.unirest.Header;
import kong.unirest.HttpResponse;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Object> parameters = new HashMap<String, Object>();
        parameters.put("t","201686");

        HttpResponse httpResponse = Demo.httpGet("GET","http://leporno.org/viewtopic.php", parameters);

        System.out.println(httpResponse.getBody());
        System.out.println("");
        for (Header header:httpResponse.getHeaders().all()) {
            System.out.println(header.getName() + " : " + header.getValue());
        }

    }
}
