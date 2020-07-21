package Test3;

import org.junit.Before;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws Exception {
	  Test3.Test003.tec1();
  }
  @Test
  public void g() throws Exception {
	  Test3.Test004.tec2();
  }
  @Test
  public void h() {
	  System.out.println("nihao zhegs");
  }
  
}
