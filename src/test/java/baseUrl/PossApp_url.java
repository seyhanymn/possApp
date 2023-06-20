package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class PossApp_url {

    protected RequestSpecification spec;

    @Before
    public void setup() {
        spec = new RequestSpecBuilder().setBaseUri("https://mors-pos-app-api.onrender.com/api").build();
    }
}

