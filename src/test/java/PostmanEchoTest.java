import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class PostmanEchoTest {
    private static final String base_uri = "https://postman-echo.com";
    private final String dataString = "This is expected to be sent back as part of response body.";

    @BeforeEach
    public void init_uri(){
        baseURI = base_uri;
    }

    @Test
    @DisplayName("GET Request")
    public void getRequest(){
        given()
                .when().get("get?foo1=bar1&foo2=bar2")
                .then()
                .log().all()
                .assertThat().statusCode(200)
                .and().body("args.foo1", is("bar1"))
                .and().body("args.foo2",is("bar2"));
    }

    @Test
    @DisplayName("POST Raw Text")
    public void postRawText(){
        given()
                .body(dataString)
                .when().post("/post")
                .then()
                .assertThat().statusCode(200)
                .and().body("data", is(dataString));
    }

    @Test
    @DisplayName("POST Form Data")
    public void postFormData(){
        given()
                .formParams("foo1","bar1")
                .formParams("foo2","bar2")
                .when().post("/post")
                .then().log().all()
                .assertThat().statusCode(200)
                .and().body("form.foo1", is("bar1"))
                .and().body("form.foo2", is("bar2"));

    }

    @Test
    @DisplayName("Put Test")
    public void putTest(){
        given()
                .body(dataString)
                .when().put("/put")
                .then()
                .log().all()
                .assertThat().statusCode(200)
                .and().body("data", is(dataString));
    }

    @Test
    @DisplayName("PATCH Request")
    public void patchTest(){
        given()
                .body(dataString)
                .when().patch("/patch")
                .then()
                .log().all()
                .assertThat().statusCode(200)
                .and().body("data",is(dataString));


    }

    @Test
    @DisplayName("Delete Request")
    public void deleteTest(){
        given()
                .body(dataString)
                .when().delete("/delete")
                .then()
                .log().all()
                .assertThat().statusCode(200)
                .and().body("data",is(dataString));
    }







}
