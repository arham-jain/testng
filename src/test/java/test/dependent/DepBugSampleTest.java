package test.dependent;

import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class DepBugSampleTest {

  private static List<String> m_log = new ArrayList<>();

  private static void log(String s) {
    //    ppp(s);
    m_log.add(s);
  }

  private static void ppp(String s) {
    System.out.println("[DepBugSampleTest] " + s);
  }

  public static List<String> getLog() {
    return m_log;
  }

  @BeforeClass
  public void setup() {
    log("setup");
  }

  @AfterClass
  public void destroy() {
    log("destroy");
  }

  @Test(dependsOnMethods = "send")
  public void get() {
    log("get");
  }

  public void send() {
    log("send");
  }
}
