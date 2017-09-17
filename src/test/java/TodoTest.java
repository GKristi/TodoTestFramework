import org.junit.Test;
import static com.jayway.restassured.RestAssured.*;
import static junit.framework.TestCase.assertEquals;

public class TodoTest {
    @Test
    public void getStatus() {
        get("https://www.google.com.ua")
                .then().statusCode(200);
    }

    @Test
    public void testPasses() {
        String expected = "Hello, teacher!";
        String actual = "Hello, teacher!";
        assertEquals(actual, expected);
    }
}
