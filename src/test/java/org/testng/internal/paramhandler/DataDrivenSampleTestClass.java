package org.testng.internal.paramhandler;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenSampleTestClass {

  @Test(dataProvider = "dp")
  public void testMethod(String i) {
    Assertions.assertThat(i).isNotEmpty();
  }

  @DataProvider(name = "dp")
  public Object[][] getData() {
    return new Object[][]{{"bar"}};
  }
}
