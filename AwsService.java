import com.sun.net.httpserver.Request;

import javax.naming.Context;
import java.util.Collections;

public class AwsService implements Request {
    @Override
    public <GatewayResponse> GatewayResponse handleRequest(Object object, Context context) {

        String message = "Hello from TechPrimers";
        System.out.println(message);

        GatewayResponse response = new GatewayResponse(
                message,
                200,
                Collections.singletonMap("X-Powered-By", "TechPrimers"),
                false
        );
        return response;
    }
}
