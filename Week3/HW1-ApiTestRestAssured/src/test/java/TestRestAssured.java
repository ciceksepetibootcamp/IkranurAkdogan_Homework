import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class TestRestAssured {
    @Test
    public void loginSuccessfulTest() {
        String postString = "{\n" +
                " \"email\": \"eve.holt@reqres.in\",\n" +
                " \"password\": \"cityslicka\"\n" +
                "}";
        given().
                contentType(ContentType.JSON)
                .body(postString)
                .when()
                .post("https://reqres.in/api/login")
                .then()
                .statusCode(200)
                .body("token", equalTo("QpwL5tke4Pnpja7X4"));

    }

    @Test
    public void loginUnsuccessfulTest() {
        String postString = "{\n" +
                " \"email\": \"peter@klaven\",\n" +
                "}";
        given().
                contentType(ContentType.JSON)
                .body(postString)
                .when()
                .post("https://reqres.in/api/login")
                .then()
                .statusCode(400);
    }

    @Test
    public void singleResourceTest() {
        when().get("https://reqres.in/api/unknown/2")
                .then()
                .statusCode(200)
                .body("data.name", equalTo("fuchsia rose"))
                .time(lessThan(4000L));
    }

    @Test
    public void createUserTest() {
        String postString = "{\n" +
                " \"name\": \"morpheus\",\n" +
                " \"job\": \"leader\"\n" +
                "}";
        given().
                contentType(ContentType.JSON)
                .body(postString)
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(201)
                .body("job", equalTo("leader"));

    }

    @Test
    public void singleUserTest() {
        when().get("https://reqres.in/api/users/2")
                .then()
                .statusCode(200)
                .body("data.email", equalTo("janet.weaver@reqres.in"))
                .time(lessThan(4000L));
    }

}
