package test.tmp;

import org.testng.annotations.BeforeTest;

public class TestFixture {

  public static int globalCallSequence = 0;
  public int fixtureBeforeTestCallSequence;

  public static int printGlobalCallSequence(String methodName) {
    globalCallSequence++;
    System.err.println("*** " + methodName + ": globalCallSequence=" + globalCallSequence);
    return globalCallSequence;
  }

  @BeforeTest(groups = "fixture")
  public void beforeTest() {
    fixtureBeforeTestCallSequence = printGlobalCallSequence("TestFixture.beforeTest");
  }

  public int getSomeRandomValue() {
    return 20;
  }

}
