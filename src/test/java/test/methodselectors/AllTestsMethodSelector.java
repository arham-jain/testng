package test.methodselectors;

import java.util.List;
import org.testng.IMethodSelector;
import org.testng.IMethodSelectorContext;
import org.testng.ITestNGMethod;

public class AllTestsMethodSelector implements IMethodSelector {

  private static void ppp(String s) {
    System.out.println("[MyMethodSelector] " + s);
  }

  @Override
  public boolean includeMethod(IMethodSelectorContext context,
      ITestNGMethod method, boolean isTestMethod) {
    context.setStopped(true);
    return true;
  }

  @Override
  public void setTestMethods(List<ITestNGMethod> testMethods) {
    // TODO Auto-generated method stub

  }

}
