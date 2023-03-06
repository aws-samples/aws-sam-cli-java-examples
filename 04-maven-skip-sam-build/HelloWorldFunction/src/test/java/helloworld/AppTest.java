package helloworld;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
  @Test
  public void successfulResponse() {
    App app = new App();
    Person p = new Person();
    p.setName("John");

    String result = app.handleRequest(p, null);
    assertEquals("Hello, John", result);
  }
}
