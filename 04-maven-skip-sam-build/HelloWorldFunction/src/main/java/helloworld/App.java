package helloworld;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Handler for requests to Lambda function.
 */
public class App implements RequestHandler<Person, String> {

    public String handleRequest(final Person person, final Context context) {
        return person.getName()
                .map( name -> "Hello, " + name)
                .orElse("Hello, World!");
    }
}
